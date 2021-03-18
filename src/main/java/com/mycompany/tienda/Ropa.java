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
public class Ropa extends Articulo implements Reciclable {
    
    //Variables
    String color;
    int talla;
    int reciclaje;
    
    //constructor vacio
public Ropa(){ 
}    
//Constructor con parametros
public Ropa(String color, int talla,String codigo, String nombre, float precio, int stock){
    super(codigo, nombre, precio, stock);
    this.color = color;
    this.talla = talla;
    this.reciclaje = reciclaje;
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

    public int getReciclaje() {
        return reciclaje;
    }

    public void setReciclaje(int reciclaje) {
        this.reciclaje = reciclaje;
    }
    

//Metodo ToString
@Override
public String toString(){
    return super.toString()+"\nColor:"+color+"\nTalla:"+talla+"\n";
}


    @Override
    public void applypromo(String codigopromo) {
        if (codigopromo.equals("ROPAPROMO"))
            this.setPrecio(((float)this.getPrecio()*0.8));
    }

    @Override
    //La ropa solo es recicable 2 veces
    public boolean esReciclable() {
        if(reciclaje > 2){
            return false;            
        }else{
            return true;
        }
    }
    /*La ropa reciclada tien qeu tener un descuento del 50%
      Además de aplicar el descuento, modifica el atributo de que ha sido reciclada*/
    @Override
    public void applyDiscount() {
        if(reciclaje > 0){
          this.setPrecio((float)this.getPrecio()*0.5);
          return 
        }
    }
}
