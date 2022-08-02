package com.totalplay.requerimiento.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_EMPTY)
public class FechaVigenciaModel implements Serializable  {
	private static final long serialVersionUID = 1L;
    private int id;
    private String idReq;
    private String vigencia;
    private String unidad;
    private String fechaReq;
    private String fechaVigencia;
}

