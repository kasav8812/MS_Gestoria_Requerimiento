/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalplay.requerimiento.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Branchbit
 */
@Data
public class ParametroModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String tipo;
    private String valor;
    private int enabled;
    private Date fechaCreacion;
}
