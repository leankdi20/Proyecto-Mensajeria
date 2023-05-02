/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Justificacion;

import java.time.LocalDate;

/**
 *
 * @author Leandro
 */
public class Justificacion {
      // Variables
    private int idJustificacion;
    private int IdGuia;
    private String observaciones;
    private LocalDate fecha;
    
    

    //Constructores
    public Justificacion(int idJustificacion, String observaciones, int idGuia) {
        this.idJustificacion = idJustificacion;
        this.observaciones = observaciones;
        this.fecha = LocalDate.now();
        this.IdGuia = idGuia;
         

    }
     public Justificacion(int IdGuia) {
        
        this.IdGuia = IdGuia;
         

    }

  
    //Getters and Setters
    public int getIdJustificacion() {
        return idJustificacion;
    }

    public void setIdJustificacion(int idJustificacion) {
        this.idJustificacion = idJustificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdGuia() {
        return IdGuia;
    }

    public void setIdGuia(int IdGuia) {
        this.IdGuia = IdGuia;
    }

   @Override
public String toString() {
    return "\n Id Justificación: " + "\n"+ idJustificacion + "\n"+
            "\n"+"Observaciones: " + "\n"+observaciones +"\n"+
            "\n"+ "Fecha: " +"\n"+ fecha.toString() + "\n"+
            "\n"+ "Id Guía: " +"\n"+ IdGuia;
}

@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true; // los objetos son iguales
    }

    if (!(obj instanceof Justificacion)) {
        return false; // el objeto no es una Justificación, entonces no son iguales
    }

    // casteamos el objeto a una Justificación para poder compararlo
    Justificacion justificacion = (Justificacion) obj;

    // comparamos todos los atributos de la justificación actual con la otra justificación
    return idJustificacion == justificacion.idJustificacion && 
           observaciones.equals(justificacion.observaciones) && 
           fecha.equals(justificacion.fecha) && 
           IdGuia == justificacion.IdGuia;
}

}
