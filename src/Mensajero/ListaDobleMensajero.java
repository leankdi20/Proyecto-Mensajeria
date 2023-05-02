/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensajero;

import java.util.Scanner;

/**
 *
 * @author solis
 */
public class ListaDobleMensajero {

    Scanner sc = new Scanner(System.in);
    nodoListaDoble primero;
    nodoListaDoble ultimo;
    int dato;

    public ListaDobleMensajero() {
        this.primero = null;
        this.ultimo = null;
    }

    //Metodo para ingresar
    public void ingresar(Mensajero mensajero) {
        nodoListaDoble nodoNuevo = new nodoListaDoble();

        nodoNuevo.mensajero = mensajero;

        if (primero == null)
        {
            primero = nodoNuevo;
            primero.siguiente = null;
            primero.anterior = null;
            ultimo = primero;
        } else
        {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.anterior = ultimo;
            nodoNuevo.siguiente = null;
            ultimo = nodoNuevo;
        }
        
    }

    //Ingresar datos antes
    public void mostrarDoble() {

        nodoListaDoble actual = ultimo;;
        
        while (actual != null)
        {
            System.out.println(actual.mensajero.toString());
            actual = actual.anterior;
        }

    }

    public void elimininar(int CEDULA) {

        nodoListaDoble actual = primero;
        nodoListaDoble atras = null;

        while (actual != null)
        {
            if (actual.mensajero.getCedula() == CEDULA)
            {
                if (actual == primero)
                {
                    primero = primero.siguiente;
                    if (primero != null)
                    {
                        primero.anterior = null;
                    }
                    //primero.anterior = primero;
                } else
                {
                    atras.siguiente = actual.siguiente;
                    if (actual.siguiente != null)
                    {
                        actual.siguiente.anterior = atras;
                    }
                    //actual.siguiente.anterior = actual.siguiente;
                }
                break;
            }
            atras = actual;
            actual = actual.siguiente;
        }
    }

    public void buscarYmodificar(String NOMBRE, int CEDULA, int nuevoCodigo, int TELEFONO, String nacionalidad, boolean estado) {
        nodoListaDoble actual = primero;
        boolean encontrado = false;
        do
        {
            if (actual.mensajero.getCedula() == CEDULA)
            {

                actual.mensajero.setNombreCompleto(NOMBRE);
                actual.mensajero.setEstado(estado);
                actual.mensajero.setTelefono(TELEFONO);
                actual.mensajero.setNacionalidad(nacionalidad);
                actual.mensajero.setCodigo(nuevoCodigo);
                
                encontrado = true;
            }
            actual = actual.siguiente;
        } while (actual != primero && !encontrado);
        if (encontrado)
        {
            System.out.println("Mensajero modificado exitosamente");
        } else
        {
            System.out.println("El mensajero no se encuentra");
        }

    }

    public void buscar(int CEDULA) {
        nodoListaDoble actual = new nodoListaDoble();

        actual = primero;
        while (actual != null)
        {
            if (actual.mensajero.getCedula() == CEDULA)
            {
                System.out.println("Mensajero encontrado");
                System.out.println(actual.mensajero.toString());
                return;
            } 
            actual = actual.siguiente;
        }
         System.out.println("El mensajero no existe");
    }

}
