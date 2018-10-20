/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author fede_
 */
public class AnalisisCompejos {
    private int codigo;
    private String nombre;
    private int cantidadUnidadesB;
    private ArrayList <Analisis> listaAnalisis;

    public AnalisisCompejos(int codigo, String nombre, int cantidadUnidadesB, ArrayList listaAnalisis) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadUnidadesB = cantidadUnidadesB;
        this.listaAnalisis = listaAnalisis;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadUnidadesB() {
        return cantidadUnidadesB;
    }

    public ArrayList getListaAnalisis() {
        return listaAnalisis;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadUnidadesB(int cantidadUnidadesB) {
        this.cantidadUnidadesB = cantidadUnidadesB;
    }

    public void setListaAnalisis(ArrayList listaAnalisis) {
        this.listaAnalisis = listaAnalisis;
    }
    
    
    public int costoUnidadesB(){
        int suma = 0;
        for(Analisis  analisis: this.listaAnalisis){
            suma+= analisis.getCantidadUnidadesB();
        }
        return suma;
    }
    
}
