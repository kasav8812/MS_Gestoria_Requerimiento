/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalplay.requerimiento.model;

import lombok.Data;

/**
 *
 * @author Branchbit
 */
@Data
public class ReqVencidosYPorVencer {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String folioVencido;
    private String folioNuevo;
    private String fecha;
    private String user;
    private Integer vencida;

}
