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
    
   private byte[] datosImage;
   private String  titulo;
   private String descripcion;

    public Imagen(byte[] datosImage, String titulo, String descripcion) {
        this.datosImage = datosImage;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Imagen() {
    }

    public byte[] getDatosImage() {
        return datosImage;
    }

    public void setDatosImage(byte[] datosImage) {
        this.datosImage = datosImage;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}