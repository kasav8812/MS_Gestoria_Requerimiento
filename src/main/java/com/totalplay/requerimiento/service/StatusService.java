package com.totalplay.requerimiento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.StatsuVo;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Transactional
public class StatusService {

	@Autowired
	SelectDao selectDao;
	
	public StatsuVo getStatus() {
		log.info("getSattus");
		return selectDao.getStatus();
	}
	
	 public String recibirRequerimiento(String id){
         selectDao.cambiaEstatusRequerimiento("2",id);
         return "Exito";
     }
	 
	 public String cerrarRequerimiento(String id){
         selectDao.cambiaEstatusRequerimiento("4",id);
         return "Exito";
	 }
	 
	 public String porAutorizarRequerimiento(String id){
         selectDao.cambiaEstatusRequerimiento("3",id);
         return "Exito";
     }
	 
        public String autorizaRequerimiento(String id){
            selectDao.cambiaEstatusRequerimiento("5",id);
            return "Exito";
        }
        public String cancelaRequerimiento(String id){
            selectDao.cambiaEstatusRequerimiento("7",id);
            return "Exito";
        }

}
