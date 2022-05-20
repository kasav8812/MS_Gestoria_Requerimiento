package com.totalplay.requerimiento.controller;

import com.totalplay.requerimiento.model.ReqEstado;
import com.totalplay.requerimiento.model.ReqVencidosYPorVencer;
import com.totalplay.requerimiento.model.RequAddonModel;
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
                if(model.getId()!=null){
                    return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.updateRequerimiento(model));
                }else{
                    return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.setRequerimiento(model));
                }
	}
        
        @PostMapping("/porVencer")
	public ResponseEntity<List<RequerimientosModel>> getRequerimientoPorVencer(@RequestBody ReqEstado model) throws Exception {
		log.info("getRequerimientoPorVencer");
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.getRequerimientoPorVencer(model.getId()));
	}
        
        @PostMapping("/vencidos")
	public ResponseEntity<List<RequerimientosModel>> requerimientosVencidos(@RequestBody ReqEstado model) throws Exception {
		log.info("requerimientosVencidos");
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.requerimientosVencidos(model.getId()));
	}
        
        @PostMapping("/requerimientosEstado")
	public ResponseEntity<List<RequerimientosModel>> getRequerimientoEstado(@RequestBody ReqEstado model) throws Exception {
		log.info("setRequerimiento: " + model.toString());
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.getRequerimientoEstado(model.getId()));
	}
        @PostMapping("/completo")
	public ResponseEntity<List<RequAddonModel>> getRequerimientoCompleto(@RequestBody ReqEstado model) throws Exception {
		log.info("getRequerimiento",model.getId());
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.getRequerimientoCompleto(model.getId()));
	}
        @PostMapping("/addRelacion")
	public ResponseEntity<String> setRequerimientoRelacion(@RequestBody ReqVencidosYPorVencer model) throws Exception {
            System.err.println("model");
            System.err.println(model.toString());
		log.info("getRequerimiento",model.toString());
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.setRequerimientoRelacion(model));
	}
        @PostMapping("/reactivar")
	public ResponseEntity<RequerimientosModel> setRequerimientoReactivar(@RequestBody ReqEstado model) throws Exception {
		log.info("setRequerimiento: " + model.toString());
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.setRequerimientoReac(model.getId()));
	}
        @PostMapping("/getId")
	public ResponseEntity<List<RequerimientosModel>> getRequermientoIds(@RequestBody ReqEstado model) throws Exception {
		log.info("getRequerimiento/"+model.getId());
		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.getRequermientoIds(model.getId()));
	}
        
        @PostMapping("/updateRequerimiento")
    	public ResponseEntity<RequerimientosModel> updateRequerimiento(@RequestBody RequerimientoModel model) throws Exception {
    		log.info("updateRequerimiento: " + model.toString());
    		return ResponseEntity.status(HttpStatus.OK).body(requerimientosService.updateRequerimiento(model));
    	}
}
