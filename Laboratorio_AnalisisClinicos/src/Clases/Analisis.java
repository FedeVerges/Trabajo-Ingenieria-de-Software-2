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
public class Analisis extends AnalisisCompletos{
    //ver de añadir el stock, o los descartables
    private String nombre;
    private Date fecha_retiro;
    private Boolean consentimiento;

    public Analisis(String nombre, Date fecha_retiro, Boolean consentimiento, Long codigo, String indicacionesPrevias, Integer cantUnidadesBioquimicas) {
        super(codigo, indicacionesPrevias, cantUnidadesBioquimicas);
        this.nombre = nombre;
        this.fecha_retiro = fecha_retiro;
        this.consentimiento = consentimiento;
    }
    
   
   public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_retiro(Date fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
    }

    public void setConsentimiento(Boolean consentimiento) {
        this.consentimiento = consentimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha_retiro() {
        return fecha_retiro;
    }

    public Boolean getConsentimiento() {
        return consentimiento;
    }
   
}
