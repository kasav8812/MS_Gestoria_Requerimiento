package com.totalplay.requerimiento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.requerimiento.model.RequerimientoModel;
import com.totalplay.requerimiento.model.RequerimientosModel;
import com.totalplay.requerimiento.service.RequerimientosService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@CrossOrigin("*")
@RequestMapping("/requerimiento")
public class RequerimientosController {

	@Autowired
	private RequerimientosService requerimientosService;
	
	
	@GetMapping
	public ResponseEntity<List<RequerimientosModel>> getRequerimiento() throws Exception {
		log.info("getRequerimiento");
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.getRequerimiento());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<RequerimientosModel>> getRequerimiento(@PathVariable("id") String id) throws Exception {
		log.info("getRequerimiento/"+id);
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.getRequerimiento(id));
	}
	
	@PostMapping
	public ResponseEntity<RequerimientosModel> setRequerimiento(@RequestBody RequerimientoModel model) throws Exception {
		log.info("setRequerimiento: " + model.toString());
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.setRequerimiento(model));
	}
}
