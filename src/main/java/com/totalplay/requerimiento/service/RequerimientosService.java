package com.totalplay.requerimiento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.ReqVencidosYPorVencer;
import com.totalplay.requerimiento.model.RequAddonModel;
import com.totalplay.requerimiento.model.RequerimientoModel;
import com.totalplay.requerimiento.model.RequerimientosModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class RequerimientosService {

    @Autowired
    private SelectDao selectDao;

    public List<RequerimientosModel> getRequerimiento() {
        return selectDao.getRequerimeiinto(null);
    }

    public List<RequerimientosModel> getRequerimiento(String id) {
        return selectDao.getRequerimeiintoFilter(id, isNumeric(id));
    }

    @Transactional
    public RequerimientosModel setRequerimiento(RequerimientoModel req) {
        selectDao.setRequerimiento(req);
        return selectDao.getRequerimeiinto(req.getId().toString()).get(0);
    }

    private boolean isNumeric(String str) {
        return str.chars().allMatch(Character::isDigit);
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

    public List<RequAddonModel> getRequerimientoCompleto(String id) {
        List<RequAddonModel> lista = selectDao.getRequerimientoCompleto(id);
        for(RequAddonModel r:lista){
            System.err.println(r.getPaydate());
            r.setPaydate(r.getPaydate().split(" ")[0]);
            System.err.println(r.getPaydate());
        }
        System.out.println(lista);
        return lista;
    }
    
    @Transactional
    public String setRequerimientoRelacion(ReqVencidosYPorVencer req) {
        selectDao.setRequerimientoRelacion(req);
        return "";
    }
    
    @Transactional
    public RequerimientosModel setRequerimientoReac(String id) {
        selectDao.setRequerimientoReact(id);
        return selectDao.getRequerimeiinto(null).get(0);
    }
    
    public List<RequerimientosModel> getRequermientoIds(String id) {
        return selectDao.getRequermientoIds(id);
    }
    
    @Transactional
    public RequerimientosModel updateRequerimiento(RequerimientoModel req) {
        selectDao.updateRequerimiento(req);
        return selectDao.getRequerimeiinto(req.getId().toString()).get(0);
    }
}
