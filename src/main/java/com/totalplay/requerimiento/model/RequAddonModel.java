package com.totalplay.requerimiento.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class RequAddonModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idRequerimiento;
	private String folio;
	private String importe;
	private String paydate;
	private String registroContable;
	private String nombreContacto;
	private String proveedor;
	private String sistema;
	private String tipoSolicitud;
	private String folioEgreso;
	private Integer area;
	private String cc;
	private String nombreCc;
	private String postFin;
	private String incluidoPermiso;
	private String horario;
	private String perNeg;
	private Integer catidad;
	private Integer vigencia;
	private Integer uMedida;
	private String formaPago;
	private Integer cobertura;
	private String actividad;
	private String descripcion;
	private Integer idEstado;
}