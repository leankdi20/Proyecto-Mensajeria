/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia;

import Justificacion.Justificacion;

/**
 *
 * @author Leandro
 */
public class Guia {
   
    private int IdGuia;
    private String estadoGuia;
   

    public Guia(int idGuia, String estadoGuia) {
        this.IdGuia = idGuia;
        this.estadoGuia = estadoGuia;
        
    }

   
    // Getters y Setters
    public int getIdGuia() {
        return IdGuia;
    }

    public void setIdGuia(int idGuia) {
        this.IdGuia = idGuia;
    }

    public String getEstadoGuia() {
        return estadoGuia;
    }

    public void setEstadoGuia(String estadoGuia) {
        this.estadoGuia = estadoGuia;
    }

   @Override
    public String toString() {
        return "ID: " + this.IdGuia + "\nEstado: " + this.estadoGuia;
    }
}


    

