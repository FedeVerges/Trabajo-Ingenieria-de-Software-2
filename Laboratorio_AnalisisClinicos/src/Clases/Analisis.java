/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;



/**
 *
 * @author fede_
 */
public class Analisis{
    private int codigo;
    private String nombre;
    private String indicacionesPrevias;
    private int cantidadUnidadesB;
    private Boolean consentimiento;
    private int costoDescartables; // cantidad de descartables consumidos. 

    public Analisis(int codigo, String nombre, String indicacionesPrevias, int cantidadUnidadesB, Boolean consentimiento, int costoDescartables) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.indicacionesPrevias = indicacionesPrevias;
        this.cantidadUnidadesB = cantidadUnidadesB;
        this.consentimiento = consentimiento;
        this.costoDescartables = costoDescartables;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIndicacionesPrevias() {
        return indicacionesPrevias;
    }

    public int getCantidadUnidadesB() {
        return cantidadUnidadesB;
    }

    public Boolean getConsentimiento() {
        return consentimiento;
    }

    public int getCostoDescartables() {
        return costoDescartables;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIndicacionesPrevias(String indicacionesPrevias) {
        this.indicacionesPrevias = indicacionesPrevias;
    }

    public void setCantidadUnidadesB(int cantidadUnidadesB) {
        this.cantidadUnidadesB = cantidadUnidadesB;
    }

    public void setConsentimiento(Boolean consentimiento) {
        this.consentimiento = consentimiento;
    }

    public void setCostoDescartables(int costoDescartables) {
        this.costoDescartables = costoDescartables;
    }
    




}