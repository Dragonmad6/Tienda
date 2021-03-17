/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author ccalv
 */
public class Ropa extends Articulo {
    
    //Variables
    String color;
    int talla;
    
    //constructor vacio
public Ropa(){ 
}    
//Constructor con parametros
public Ropa(String color, int talla,String codigo, String nombre, float precio, int stock){
    super(codigo, nombre, precio, stock);
    this.color = color;
    this.talla = talla;   
}
//Getter and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

//Metodo ToString
@Override
public String toString(){
    return super.toString()+"\nColor:"+color+"\nTalla:"+talla+"\n";
}

@Override

public void applyPromo (String codigopromo){
    //Si el codigo promocional es "ROPAPROMO" aplico un 20% 
    if (codigopromo.equals("ROPAPROMO"))
        this.setPrecio(((float)this.getPrecio()*0.8));
    
}

}
