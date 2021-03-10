/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Carlos C
 */
public class Electrodomestico extends Articulo{
    
    private ClaseE clasificacionEnergetica;
    private String gama;
    
    public Electrodomestico(){
    
}
    public Electrodomestico (String gama, ClaseE clasificacionEnergetica, String codigo, String nombre,float precio, int stock){
        
        super (codigo, nombre, precio, stock); //SUPER es para llaar al constructor de la clase padre(articulo).
        this.gama = gama;
        this.clasificacionEnergetica = clasificacionEnergetica;
        
    }

    /**
     * @return the cenergetica
     */
    public ClaseE getCenergetica() {
        return clasificacionEnergetica;
    }

    /**
     * @param cenergetica the cenergetica to set
     */
    public void setCenergetica(ClaseE cenergetica) {
        this.clasificacionEnergetica = cenergetica;
    }

    /**
     * @return the gama
     */
    public String getGama() {
        return gama;
    }

    /**
     * @param gama the gama to set
     */
    public void setGama(String gama) {
        this.gama = gama;
    }
    
    public ClaseE getClasificacionEnergetica(){
        return clasificacionEnergetica;
    }
    
    public void setClasificacion (ClaseE clasificacionEnergetica){
        this.clasificacionEnergetica = clasificacionEnergetica;
    }
    
    @Override
    public String toString(){
        return  super.toString() + "Gama:" + getGama() + "Clase Electrodomestico: " + getClasificacionEnergetica();
    }    
}