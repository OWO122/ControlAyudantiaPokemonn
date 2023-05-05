/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pokedex extends Inventario{

    public Pokedex(int capacidad, ArrayList<Interactuables> listaObjetos) {
        super(capacidad, listaObjetos);
    }
    
    public boolean elegirPokemon(int idObjeto){
        
        for (int i=0; i<listaObjetos.size();i++){
            
            if (listaObjetos.get(i).getIdObjeto()==idObjeto)
                return true;
        }
        return false;
    }
    
}
