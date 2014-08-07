/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.campitos.autenticar.maven.java.patos;

/**
 *
 * @author campitos
 */
public class PatoVivo extends Pato implements ComportamientoHacerCuac {

    @Override
    public void hacerCuac() {
     System.out.println("Estoy vivo y hago cuac");
    }
    
}
