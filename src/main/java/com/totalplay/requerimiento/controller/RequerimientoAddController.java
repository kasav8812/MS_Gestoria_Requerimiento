package com.totalplay.requerimiento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.requerimiento.model.RequAddonModel;
import com.totalplay.requerimiento.service.RequerimientoAddService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@CrossOrigin("*")
@RequestMapping("/requerimiento/add")
public class RequerimientoAddController {
	
	@Autowired
	RequerimientoAddService requerimientoAddService;

	@PostMapping
	public ResponseEntity<String> setRequerimiento(@RequestBody RequAddonModel model) throws Exception {
		log.info("setRequerimientoadd: " + model.toString());
		return ResponseEntity.status(HttpStatus.OK).body(requerimientoAddService.add(model));
	}
}
