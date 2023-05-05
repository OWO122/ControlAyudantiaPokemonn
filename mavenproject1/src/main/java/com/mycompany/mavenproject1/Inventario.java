/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Sala-2-11-PC16
 */
public class Inventario {
    
    private int capacidad;
    protected ArrayList<Interactuables> listaObjetos;

    public Inventario(int capacidad, ArrayList<Interactuables> listaObjetos) {
        this.capacidad = capacidad;
        this.listaObjetos = listaObjetos;
    }

    
            
    //crear read update eliminar

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Interactuables> getListaObjetos() {
        return listaObjetos;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaObjetos(ArrayList<Interactuables> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
    
    
    public void crearObjeto(int idObjeto, String nombreObjeto, String tipoObjeto){
        Objeto nuevoObjeto = new Objeto(tipoObjeto, idObjeto, nombreObjeto);
        listaObjetos.add(nuevoObjeto);
    }
    
    
    public boolean leerObjeto(int idObjeto){
        
        for (int i=0; i<listaObjetos.size(); i++){
            
            if(listaObjetos.get(i).getIdObjeto() == idObjeto){
                System.out.println(listaObjetos.get(i).getNombreObjeto());
                Objeto objeto = (Objeto) listaObjetos.get(i);
                System.out.println(objeto.getTipoObjeto());
                return true;
            }
        }
        return false;
    }
    
    
    public boolean actualizarObjeto(int idObjeto, String nombreNuevo, String nuevoTipo){
        
        for (int i=0; i<listaObjetos.size(); i++){
            
            if(listaObjetos.get(i).getIdObjeto() == idObjeto){
                listaObjetos.get(i).setNombreObjeto(nombreNuevo);
                Objeto objeto = (Objeto) listaObjetos.get(i);
                objeto.setTipoObjeto(nuevoTipo);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarObjeto(int idObjeto){
        
        for (int i =0; i<listaObjetos.size();i++){
            
            if (listaObjetos.get(i).getIdObjeto()== idObjeto){
                listaObjetos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
}
