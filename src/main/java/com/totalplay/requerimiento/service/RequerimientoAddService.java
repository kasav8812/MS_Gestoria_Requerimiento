package com.totalplay.requerimiento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.RequAddonModel;

@Service
public class RequerimientoAddService {
	
	@Autowired
	private SelectDao selectDao;

	public RequAddonModel add(RequAddonModel model) {
		selectDao.setAddons(model);
//                Cambia status a Por Autorizar
           // selectDao.cambiaEstatusRequerimiento("4",model.getFolio());
                return selectDao.getRequerimientoCompleto(model.getIdRequerimiento().toString()).get(0);
	}
	
	
	
	public RequAddonModel updateAddon(RequAddonModel model){
		selectDao.updateRequerimientoAddon(model);
		
        return selectDao.getRequerimientoCompleto(model.getIdRequerimiento().toString()).get(0);
	}
	
	
	public List<RequAddonModel> getListRequerimientoByUser(String id){
		return selectDao.getListRequerimientoByUser(id);
	}
     
}
