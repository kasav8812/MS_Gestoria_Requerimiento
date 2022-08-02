package com.totalplay.requerimiento.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class ActividadesModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String tpgcacid;
	private String tpgcreqid;
}
