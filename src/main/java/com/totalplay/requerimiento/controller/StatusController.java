package com.totalplay.requerimiento.controller;

import com.totalplay.requerimiento.model.ReqEstado;
import com.totalplay.requerimiento.model.RequerimientosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.requerimiento.service.StatusService;
import java.util.List;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Log4j2
@RestController
@CrossOrigin("*")
@RequestMapping("/status")
public class StatusController {

	private HttpStatus status;
	
	@Autowired
	private StatusService statusService;
	
	@GetMapping
	public ResponseEntity<?> getStatus(){
		log.info("getStatus");
		status = HttpStatus.OK;		
		return ResponseEntity.status(status).body(statusService.getStatus());
	}
        @PostMapping("/autoriza")
	public ResponseEntity<?> autoriza(@RequestBody ReqEstado model) throws Exception {
		log.info("status/autoriza");
		return ResponseEntity.status(HttpStatus.OK).body(statusService.autorizaRequerimiento(model.getId()));
	}
        @PostMapping("/cancela")
	public ResponseEntity<?> cancela(@RequestBody ReqEstado model) throws Exception {
		log.info("status/autoriza");
		return ResponseEntity.status(HttpStatus.OK).body(statusService.cancelaRequerimiento(model.getId()));
	}
}
