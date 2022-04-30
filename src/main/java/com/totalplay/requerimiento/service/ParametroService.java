package com.totalplay.requerimiento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.ComentariosModel;
import com.totalplay.requerimiento.model.ParametroModel;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Transactional
public class ParametroService {

	@Autowired
	SelectDao selectDao;
	
	public List<ParametroModel> getParametros(int id) {
		log.info("getParametros");
		return selectDao.getParametros(id);
	}
        public String addParametro(ParametroModel model){
            selectDao.addParametro(model);
            return "Exito";
        }

}
