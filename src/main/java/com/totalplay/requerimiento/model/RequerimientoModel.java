package com.totalplay.requerimiento.model;

import java.io.Serializable;

import com.google.gson.Gson;

import lombok.Data;

@Data
public class RequerimientoModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer tipoRequerimineto;
	private Integer ubicacionEstado;
	private Integer municipio;
	private String vigencia;
	private Integer umedida;
	private Integer area;
	private String fechaRequerimiento;
	private String fechaVencimiento;
	private String idUser;

	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}