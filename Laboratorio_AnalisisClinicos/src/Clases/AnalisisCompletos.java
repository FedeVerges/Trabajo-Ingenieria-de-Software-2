/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author fede_
 */
public class AnalisisCompletos {
    private Long codigo;
    private String nombre;
    private String indicacionesPrevias;
    private Integer cantUnidadesBioquimicas;

    public AnalisisCompletos(Long codigo, String nombre, String indicacionesPrevias, Integer cantUnidadesBioquimicas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.indicacionesPrevias = indicacionesPrevias;
        this.cantUnidadesBioquimicas = cantUnidadesBioquimicas;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIndicacionesPrevias() {
        return indicacionesPrevias;
    }

    public Integer getCantUnidadesBioquimicas() {
        return cantUnidadesBioquimicas;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIndicacionesPrevias(String indicacionesPrevias) {
        this.indicacionesPrevias = indicacionesPrevias;
    }

    public void setCantUnidadesBioquimicas(Integer cantUnidadesBioquimicas) {
        this.cantUnidadesBioquimicas = cantUnidadesBioquimicas;
    }
    
        
}
