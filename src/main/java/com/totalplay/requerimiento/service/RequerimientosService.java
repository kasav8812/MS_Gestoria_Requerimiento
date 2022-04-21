package com.totalplay.requerimiento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.RequerimientoModel;
import com.totalplay.requerimiento.model.RequerimientosModel;

@Service
public class RequerimientosService {
	
	@Autowired
	private SelectDao selectDao;

	public List<RequerimientosModel> getRequerimiento() {
		return selectDao.getRequerimeiinto(null);
	}

	public List<RequerimientosModel>  getRequerimiento(String id) {		
		return selectDao.getRequerimeiintoFilter(id, isNumeric(id));
	}

	@Transactional
	public RequerimientosModel setRequerimiento(RequerimientoModel req) {
		selectDao.setRequerimiento(req);
		return selectDao.getRequerimeiinto(req.getId().toString()).get(0);
	}
	
	private boolean isNumeric(String str) {
		return str.chars().allMatch( Character::isDigit );
	}
        public List<RequerimientosModel> getRequerimientoPorVencer(String id) {
		return selectDao.getRequerimientoPorVencer(id);
	}
        
        public List<RequerimientosModel> requerimientosVencidos(String id) {
		return selectDao.getRequerimientosVencidos(id);
	}
        
        @Transactional
	public List<RequerimientosModel> getRequerimientoEstado(String id) {
		return selectDao.getRequerimientoEstado(id);
	}
}
