/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author fede_
 */
public class Obra_Social {
  private  String nombre;
  private Integer telefono;
  private Float precio_unidad_bioquimica;

    public Obra_Social(String nombre, Integer telefono, Float precio_unidad_bioquimica) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precio_unidad_bioquimica = precio_unidad_bioquimica;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public Float getPrecio_unidad_bioquimica() {
        return precio_unidad_bioquimica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setPrecio_unidad_bioquimica(Float precio_unidad_bioquimica) {
        this.precio_unidad_bioquimica = precio_unidad_bioquimica;
    }
  
 
}
