/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.campitos.autenticar.maven.java.patos;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author campitos
 */
public class Imagen implements Serializable{
    
   private File file;
   private String  nombre;

    public Imagen(File file, String nombre) {
        this.file = file;
        this.nombre = nombre;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
