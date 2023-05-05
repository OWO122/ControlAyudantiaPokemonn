/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Sala-2-11-PC16
 */
public class Mochila extends Inventario{

    public Mochila(int capacidad, ArrayList<Interactuables> listaObjetos) {
        super(capacidad, listaObjetos);
    }
    
    public boolean usarObjeto(int idObjeto){
        
        for(int i=0; i<listaObjetos.size(); i++){
            
            if(listaObjetos.get(i).getIdObjeto() == idObjeto){
                return true;
            }
        }
        return false;
    }
    
}
