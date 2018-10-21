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
public class Paciente {
    private String nombre;
    private String apellido;
    private int dni;
    private Long telefono;
    private Date fechaNacimiento;
    private Integer edad;
    private String sexo;
    private Obra_Social obraSocial;
    private Orden orden;

    public Paciente(String nombre, String apellido, int dni, Long telefono, Date fechaNacimiento, int edad, String sexo, Obra_Social obraSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.sexo = sexo;
        this.obraSocial = obraSocial;
    }

    public int getDni() {
        return dni;
    }

    public Obra_Social getObraSocial() {
        return obraSocial;
    }

    public Orden getOrden() {
        return orden;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getTelefono() {
        return telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setObraSocial(Obra_Social obraSocial) {
        this.obraSocial = obraSocial;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    

    
    
}
