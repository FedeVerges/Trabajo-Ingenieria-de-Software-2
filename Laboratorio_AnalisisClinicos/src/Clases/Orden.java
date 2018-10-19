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
public class Orden {
    private Date fechaDeIngreso;
    private String Medico;
    private Paciente paciiente;
    private Analisis analisis;
    private Obra_Social obraSocial;
    private Registro_de_cobros ingresos;
    private Bioquimico bioquimico;

    public Orden(Date fechaDeIngreso, String Medico, Paciente paciiente, Analisis analisis, Obra_Social obraSocial, Registro_de_cobros ingresos, Bioquimico bioquimico) {
        this.fechaDeIngreso = fechaDeIngreso;
        this.Medico = Medico;
        this.paciiente = paciiente;
        this.analisis = analisis;
        this.obraSocial = obraSocial;
        this.ingresos = ingresos;
        this.bioquimico = bioquimico;
    }
    
    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public String getMedico() {
        return Medico;
    }

    public Paciente getPaciiente() {
        return paciiente;
    }

    public Analisis getAnalisis() {
        return analisis;
    }

    public Obra_Social getObraSocial() {
        return obraSocial;
    }

    public Registro_de_cobros getIngresos() {
        return ingresos;
    }

    public Bioquimico getBioquimico() {
        return bioquimico;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public void setPaciiente(Paciente paciiente) {
        this.paciiente = paciiente;
    }

    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }

    public void setObraSocial(Obra_Social obraSocial) {
        this.obraSocial = obraSocial;
    }

    public void setIngresos(Registro_de_cobros ingresos) {
        this.ingresos = ingresos;
    }

    public void setBioquimico(Bioquimico bioquimico) {
        this.bioquimico = bioquimico;
    }
    
    
    
    
}
