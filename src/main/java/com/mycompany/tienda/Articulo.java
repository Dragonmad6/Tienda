/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import java.util.ArrayList;

/**
 *
 * @author ccalv
 */
public abstract class Articulo {
    	private String codigo;
	private String nombre;
	private float precio;
	private int stock;
	private ArrayList <Opinion> opiniones;
        
	public Articulo() {
	}
	
	public Articulo(String codigo, String nombre, float precio, int stock) {
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
                ArrayList <Opinion> opiniones = new ArrayList <Opinion>(); 
	}
        
        public abstract void applypromo(String codigopromo);
	//Getters
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	//Setters
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	//Metodos
	@Override
	public String toString() {
		return "Codigo: "+this.codigo+"\nNombre: "+this.nombre+"\nPrecio: "+this.precio+"€\nStock: "+this.stock+"\n";
	}
	@Override
	
	public boolean equals (Object o) {
		if (o == null)
			return false;
		if (this.getClass()!= o.getClass())
			return false;
		else
		{
			Articulo a = (Articulo) o;
			if (this.codigo.equals(a.getCodigo()))
				return true;
			else
				return false;
		}
	}
	
	public boolean disponible(int cantidad) {
		return cantidad < stock;
	}
	
	public void ajustarStock (int cantidad) {
		this.stock += cantidad;
	}
        
        public void addOpinion(Opinion op){
            opiniones.add(op);
        }
        public String verOpiniones(){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<opiniones.size();i++){
                sb.append(opiniones.get(i).toString());
                sb.append("\n");
            }
            return sb.toString();
        }
        private float mediaOpinion(){
            float nota = 0;
          for(int i=0; i <opiniones.size(); i++){
            if(opiniones.get(i).getPuntuacion() == Puntuacion.Horrible){
              nota = nota + 1;
            }
            if(opiniones.get(i).getPuntuacion()== Puntuacion.Fatal){
                nota = nota + 2;
            }
            if(opiniones.get(i).getPuntuacion()== Puntuacion.Regular){
                nota = nota + 3;
            }
            if(opiniones.get(i).getPuntuacion()== Puntuacion.Superable){
                nota = nota + 4;
            }
            if(opiniones.get(i).getPuntuacion()== Puntuacion.Bien){
                nota = nota + 5;
            }
            if(opiniones.get(i).getPuntuacion()== Puntuacion.Notable){
                 nota = nota + 6;               
            }
            if(opiniones.get(i).getPuntuacion()== Puntuacion.Excelente){
                 nota = nota + 5;               
            }
          }
            return nota;
        }
 }