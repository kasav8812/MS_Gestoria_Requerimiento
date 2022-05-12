package com.totalplay.requerimiento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.RequAddonModel;
import java.util.List;

@Service
public class RequerimientoAddService {
	
	@Autowired
	private SelectDao selectDao;

	public RequAddonModel add(RequAddonModel model) {
		selectDao.setAddons(model);
//                Cambia status a Por Autorizar
            selectDao.cambiaEstatusRequerimiento("3",model.getFolio());
                return selectDao.getRequerimientoCompleto(model.getIdRequerimiento().toString()).get(0);
	}
        
}
