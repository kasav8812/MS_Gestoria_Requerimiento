package com.totalplay.requerimiento.controller;

import com.totalplay.requerimiento.model.ParametroModel;
import com.totalplay.requerimiento.model.ReqEstado;
import com.totalplay.requerimiento.service.ParametroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Log4j2
@RestController
@CrossOrigin("*")
@RequestMapping("/parametros")
public class ParametrosController {

	private HttpStatus status;
	
	@Autowired
	private ParametroService parametroService;
	
	@PostMapping("/get")
	public ResponseEntity<List<ParametroModel>> getParametros(@RequestBody ReqEstado model){
		log.info("getParametros by id");
		status = HttpStatus.OK;		
		return ResponseEntity.status(status).body(parametroService.getParametros(Integer.parseInt(model.getId())));
	}
        @PostMapping("/add")
	public ResponseEntity<?> addParametro(@RequestBody ParametroModel model) throws Exception {
		log.info("parametros/add");
		return ResponseEntity.status(HttpStatus.OK).body(parametroService.addParametro(model));
	}
        
}
