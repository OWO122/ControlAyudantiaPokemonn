/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Sala-2-11-PC16
 */
public class Objeto extends Interactuables{
    
    private String tipoObjeto;

    public Objeto(String tipoObjeto, int idObjeto, String nombreObjeto) {
        super(idObjeto, nombreObjeto);
        this.tipoObjeto = tipoObjeto;
    }
    

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }
    
    
}
