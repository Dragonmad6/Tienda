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
public class Opinion implements Comparable{
    
    private String usuario;
    private Puntuacion puntuacion;
    private String comentario;
    private int votoPositivo;
    private int votoNegativo;
    
    public Opinion(){
        votoPositivo = 0;
        votoNegativo = 0;
    }
    public Opinion (String usuario, Puntuacion puntuacion, String comentario, int votoPositivo, int votoNegativo){
        
        this.usuario = usuario;
        this.puntuacion = puntuacion;
        this.comentario  = comentario;
        votoPositivo = 0;
        votoNegativo = 0;
    }

    public Puntuacion getPuntuacion() {
        return puntuacion;
    }
    
    //Methods
    public void votoPositivo(){
        this.votoPositivo++;
    }
    
    public void votoNegativo(){
        this.votoNegativo++;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario=").append(usuario);
        sb.append("\npuntuacion=").append(puntuacion);
        sb.append("\ncomentario=").append(comentario);
        sb.append("\npositivos=").append(votoPositivo);
        sb.append("\nnegativos=").append(votoNegativo);        
        
        return sb.toString();
    }

    @Override
    public int compareTo(Opinion o) {
        //Horrible, Fatal, Regular, Superable, Bien, Notable, Excelente
        //this.Puntuacion = Puntuacion.BIEN --> mayor que REGULAR, MAL.
    }
    
}
