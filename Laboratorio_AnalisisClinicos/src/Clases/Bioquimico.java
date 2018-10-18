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
public class Bioquimico extends Persona{
 private String cuil;

public Bioquimico(String cui,String nom,String ape,Long dni){
    super(nom,ape,dni);
    this.cuil=cui;
}

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
   
}
