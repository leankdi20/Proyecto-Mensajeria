/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Date;

/**
 *
 * @author frmez
 */
public class nodoListaDobleServicios {
    int idServicio;
    Date fechaServicio;
    String observaciones;
    String instrucciones;
    int cedulaCliente;//Del cliente que lo hizo
    String nombreCliente; // Nombre del cliente
    //private int idTipoProducto;
    nodoListaDobleServicios siguiente;
    nodoListaDobleServicios anterior;
}


