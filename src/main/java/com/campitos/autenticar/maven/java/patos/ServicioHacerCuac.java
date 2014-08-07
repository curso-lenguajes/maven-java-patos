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
public class ServicioHacerCuac {
    ComportamientoHacerCuac cuac;

    public ServicioHacerCuac(ComportamientoHacerCuac cuac) {
        this.cuac = cuac;
    }
    
    public void servicioCuac(){
        cuac.hacerCuac();
    }
    
}
