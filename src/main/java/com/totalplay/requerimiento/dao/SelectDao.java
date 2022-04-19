package com.totalplay.requerimiento.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.totalplay.requerimiento.model.RequAddonModel;
import com.totalplay.requerimiento.model.RequerimientoModel;
import com.totalplay.requerimiento.model.RequerimientosModel;
import com.totalplay.requerimiento.model.StatsuVo;


@Mapper
public interface SelectDao {

	public StatsuVo getStatus();
	
	public List<RequerimientosModel> getRequerimeiinto(@Param("id") String id);

	public void setRequerimiento(@Param("req") RequerimientoModel req);

	public List<RequerimientosModel> getRequerimeiintoFilter(@Param("id") String id, @Param("numeric") boolean numeric);

	public void setAddons(RequAddonModel model);
	
}
