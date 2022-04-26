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
import java.util.List;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Log4j2
@RestController
@CrossOrigin("*")
@RequestMapping("/requerimiento/add")
public class RequerimientoAddController {
	
	@Autowired
	RequerimientoAddService requerimientoAddService;

	@PostMapping
	public ResponseEntity<RequAddonModel> setRequerimiento(@RequestBody RequAddonModel model) throws Exception {
		log.info("setRequerimientoadd: " + model.toString());
//                log.info(model.idRequerimiento +","+model.folio +","+model.importe +","+model.paydate +","+model.registroContable +","+model.nombreContacto +","+model.proveedor +","+model.sistema +","+model.tipoSolicitud +","+model.folioEgreso +","+model.area +","+model.cc +","+model.nombreCc +","+model.postFin +","+model.incluidoPermiso +","+model.horario +","+model.perNeg +","+model.catidad +","+model.vigencia +","+model.medida +","+model.formaPago +","+model.cobertura +","+model.actividad +","+model.descripcion);
		return ResponseEntity.status(HttpStatus.OK).body(requerimientoAddService.add(model));
	}
}
