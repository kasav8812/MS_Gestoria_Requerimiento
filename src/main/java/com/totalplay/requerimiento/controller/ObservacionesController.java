package com.totalplay.requerimiento.controller;

import com.totalplay.requerimiento.model.ComentariosModel;
import com.totalplay.requerimiento.model.ReqEstado;
import com.totalplay.requerimiento.service.ComentarioService;
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
@RequestMapping("/comentarios")
public class ObservacionesController {

	private HttpStatus status;
	
	@Autowired
	private ComentarioService comentarioService;
	
	@PostMapping("/get")
	public ResponseEntity<List<ComentariosModel>> getComentarios(@RequestBody ReqEstado model){
		log.info("getComentarios by idRequerimiento");
		status = HttpStatus.OK;		
		return ResponseEntity.status(status).body(comentarioService.getComentarios(Integer.parseInt(model.getId())));
	}
        @PostMapping("/add")
	public ResponseEntity<?> addComentario(@RequestBody ComentariosModel model) throws Exception {
		log.info("observaciones/add");
		return ResponseEntity.status(HttpStatus.OK).body(comentarioService.addComentario(model));
	}
        
}
