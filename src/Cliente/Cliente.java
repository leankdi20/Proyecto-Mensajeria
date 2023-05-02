/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.Scanner;

public class Cliente extends Persona implements interfacePersona {

    //CREACION DE VARIABLES
    private String email;

    private boolean estado; //Puede ser actio o inactivo
    private String direccion; //La cual es para saber donde tiene que recoger los paquetes el mensajero.

    //CONSTRUCTORES
    public Cliente(String NOMBRE, int CEDULA, int TELEFONO, String email, boolean estado, String direccion) {

        super(NOMBRE, CEDULA, TELEFONO);

        this.email = email;

        this.estado = estado;
        this.direccion = direccion;
    }

    //GET Y SET
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public String toString() {
        return "Nombre: " + getNombreCompleto() + "\n"
                + "\n__________________________________________________\n"
                + "\nCédula: " + getCedula()
                + "\n__________________________________________________\n"
                + "\nTeléfono: " + getTelefono()
                + "\n__________________________________________________\n"
                + "\nEmail: " + email
                + "\n__________________________________________________\n"
                + "\nDirección: " + direccion
                + "\n__________________________________________________\n"
                + "\nEstado: " + estado
                + "\n__________________________________________________\n"
                + "\n__________________________________________________\n"
                + "\n__________________________________________________\n";

    }

}
