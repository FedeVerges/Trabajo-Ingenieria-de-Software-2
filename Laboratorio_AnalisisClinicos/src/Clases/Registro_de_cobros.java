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
public class Registro_de_cobros {
    private Float ingresos;
    private Float precioPorUnidadBParticular;

    public Registro_de_cobros(Float ingresos, Float precioPorUnidadBParticular) {
        this.ingresos = ingresos;
        this.precioPorUnidadBParticular = precioPorUnidadBParticular;
    }

    public Float getIngresos() {
        return ingresos;
    }

    public Float getPrecioPorUnidadBParticular() {
        return precioPorUnidadBParticular;
    }

    public void setIngresos(Float ingresos) {
        this.ingresos = ingresos;
    }

    public void setPrecioPorUnidadBParticular(Float precioPorUnidadBParticular) {
        this.precioPorUnidadBParticular = precioPorUnidadBParticular;
    }
    
    
}
