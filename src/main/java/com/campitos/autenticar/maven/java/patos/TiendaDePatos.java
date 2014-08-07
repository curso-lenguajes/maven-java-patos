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
public class TiendaDePatos {
public static void main(String args[]){
 
        ServicioHacerCuac servicio=new ServicioHacerCuac(new PatoJuguete());
        servicio.servicioCuac();
    
}    
}
