package com.totalplay.requerimiento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.ComentariosModel;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Transactional
public class ComentarioService {

	@Autowired
	SelectDao selectDao;
	
	public List<ComentariosModel> getComentarios(int id) {
		log.info("getComentarios");
		return selectDao.getComentarios(id);
	}
        public String addComentario(ComentariosModel model){
            selectDao.addComentario(model);
            return "Exito";
        }

}
