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
public class Opinion {
    
    private String usuario;
    private Puntuacion puntuacion;
    private String comentario;
    private int votoPositivo;
    private int votoNegativo;
    
    public Opinion(){
        
    }
    public Opinion (String usuario, Puntuacion puntuacion, String comentario, int votoPositivo, int votoNegativo){
        
        this.usuario = usuario;
        this.puntuacion = puntuacion;
        this.comentario  = comentario;
        this.votoPositivo = votoPositivo;
        this.votoNegativo = votoNegativo;
    }
    
    public void DarVotoPositivo(int votoPositivo){
        if(votoPositivo > 0){
        }
    }
    
}
