package com.totalplay.requerimiento.dao;

import com.totalplay.requerimiento.model.ComentariosModel;
import com.totalplay.requerimiento.model.ParametroModel;
import com.totalplay.requerimiento.model.ReqVencidosYPorVencer;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.totalplay.requerimiento.model.RequAddonModel;
import com.totalplay.requerimiento.model.RequerimientoModel;
import com.totalplay.requerimiento.model.RequerimientosModel;
import com.totalplay.requerimiento.model.StatsuVo;
import com.totalplay.requerimiento.model.FechaVigenciaModel;
import com.totalplay.requerimiento.model.ActividadesModel;




@Mapper
public interface SelectDao {

	public StatsuVo getStatus();
	
	public List<RequerimientosModel> getRequerimeiinto(@Param("id") String id);

	public void setRequerimiento(@Param("req") RequerimientoModel req);

	public List<RequerimientosModel> getRequerimeiintoFilter(@Param("id") String id, @Param("numeric") boolean numeric);

	public void setAddons( @Param("req") RequAddonModel req);
        
        public List<RequerimientosModel> getRequerimientoPorVencer(@Param("id") String id);
        
        public List<RequerimientosModel> getRequerimientosVencidos(@Param("id") String id);
        
	public List<RequerimientosModel> getRequerimientoEstado(@Param("id") String id);

        public List<RequAddonModel> getRequerimientoCompleto(@Param("id") String id);

        public void setRequerimientoRelacion(@Param("req") ReqVencidosYPorVencer req);

        public void setRequerimientoReact(@Param("id") String id);

        public void cambiaEstatusRequerimiento(@Param("idEstatus") String idEstatus,@Param("id") String id);
        
        public List<ComentariosModel> getComentarios(@Param("id") int id);
        
        public void addComentario(@Param("req") ComentariosModel comentario);
        
        public void addParametro(@Param("req") ParametroModel parametro);

        public List<ParametroModel> getParametros(@Param("id") int id);
        
        
	public List<RequerimientosModel> getRequermientoIds(@Param("id") String id);
        
        public void updateRequerimiento(@Param("req") RequerimientoModel req);
	
        public void updateRequerimientoAddon(@Param("req")RequAddonModel req);
        
    	public void setFechaVigencia( @Param("req") FechaVigenciaModel req);
    	
        public List<FechaVigenciaModel> getFechasVigencia(@Param("id") String id);
  
        public void updateFechaVigencia(@Param("id")String id);

        public void deleteFechaVigencia(@Param("id")String id);
        
        public Integer setActividades(@Param("act") ActividadesModel act);

 }
