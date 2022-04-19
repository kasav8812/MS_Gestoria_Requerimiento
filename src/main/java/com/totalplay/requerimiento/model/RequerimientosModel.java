package com.totalplay.requerimiento.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class RequerimientosModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String permiso;
	private String ubicacion;
	private String municipio;
	private String vigencia;
	private String area;
	private String fechareq;
	private String fechavencimiento;
	private String estado;
	private Integer idestado;
} 
