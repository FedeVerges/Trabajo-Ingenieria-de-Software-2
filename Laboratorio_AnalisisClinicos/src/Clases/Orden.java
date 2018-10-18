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

    public Orden(Date fechaDeIngreso, String Medico) {
        this.fechaDeIngreso = fechaDeIngreso;
        this.Medico = Medico;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public String getMedico() {
        return Medico;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }
    
    
}
