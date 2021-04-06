/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Carlos C
 */
public class UsuarioTest {
    
    @Test
    public void testNombreUsuario() {
        System.out.println("nombreUsuario");
        String nombre = "JuanManuel";
        //Usuario instance = new Usuario();
        Usuario hola = new Usuario("JuanManuel","JakdasdhakF","ccalvo@gmail.com");
        boolean expResult = true;
        boolean result = hola.nombreUsuario(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of passwordtrue method, of class Usuario.
     */
    @Test
    public void testPasswordtrue() {
        System.out.println("passwordtrue");
        String password = "";
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.passwordtrue(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emailVerificado method, of class Usuario.
     */
    @Test
    public void testEmailVerificado() {
        System.out.println("emailVerificado");
        String email = "";
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.emailVerificado(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
