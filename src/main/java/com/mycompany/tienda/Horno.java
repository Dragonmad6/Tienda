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
public class Horno extends Electrodomestico {
    
    //Variables
    private String color;
    private String consumoElectrico;
    
    //Constructor vacio
    public Horno(){
    }
    //Constructor con parametros
    public Horno (String color, String consumoElectrico,String gama, ClaseE clasificacionEnergetica, String codigo, String nombre,float precio, int stock){
        super(gama,clasificacionEnergetica,codigo, nombre, precio, stock);
        this.color = color;
        this.consumoElectrico = consumoElectrico;
    }
    //Getters
    public String getColor() {
         return color;
    }
     public String getConsumoElectrico() {
        return consumoElectrico;
    }   
    //Setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setConsumoElectrico(String consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }
    
    //Method toString
    public String toString(){
        return super.toString()+ "Color:" + getColor()+ "Tipo electrico: " + getConsumoElectrico();
    }

}
