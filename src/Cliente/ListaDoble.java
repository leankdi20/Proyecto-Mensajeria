/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.Scanner;

/**
 *
 * @author solis
 */
public class ListaDoble {

    Scanner sc = new Scanner(System.in);
    nodoListaDoble primero;
    nodoListaDoble ultimo;
    int dato;
    public ListaDoble siguiente;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
    }

    //Metodo para ingresar
    public void ingresar(Cliente cliente) {
        nodoListaDoble nodoNuevo = new nodoListaDoble();

        nodoNuevo.cliente = cliente;

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
        //Solo me muestra el los valores del constructor

        nodoListaDoble actual = ultimo;

        while (actual != null)

        {
            System.out.println(actual.cliente.toString() + "\n");
            actual = actual.anterior;

        }

    }

    public void elimininar(int CEDULA) {
        nodoListaDoble actual = primero;
        nodoListaDoble atras = null;

        while (actual != null)
        {

            if (actual.cliente.getCedula() == CEDULA)
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
            }
            atras = actual;
            actual = actual.siguiente;
        }

    }

    public void buscarYmodificar(int CEDULA, String NOMBRE, int nuevoCedula, int TELEFONO, boolean nuevoEstado, String direccion, String email) {
        nodoListaDoble actual = primero;
        boolean encontrado = false;
        do
        {
            if (actual.cliente.getCedula() == CEDULA)
            {
                actual.cliente.setCedula(nuevoCedula);
                actual.cliente.setNombreCompleto(NOMBRE);
                actual.cliente.setEstado(nuevoEstado);
                actual.cliente.setTelefono(TELEFONO);
                actual.cliente.setEmail(email);
                actual.cliente.setDireccion(direccion);

                encontrado = true;
            }
            actual = actual.siguiente;
        } while (actual != primero && !encontrado);
        if (encontrado)
        {
            System.out.println("Cliente modificado exitosamente");
        }

    }

    public void buscar(int CEDULA) {
        nodoListaDoble actual = primero;
        boolean encontrado = false;

        while (actual != null)
        {
            if (actual.cliente.getCedula() == CEDULA)
            {
                System.out.println("Cliente encontrado");
                System.out.println(actual.cliente.toString());
                encontrado = true;
                break;
            }
            actual = actual.siguiente;

        }
        if (!encontrado)
        {
            System.out.println("El cliente no existe");
        }
    }

    public int buscar_2(int CEDULA) {
        nodoListaDoble actual = primero;

        int estado = 0;

        while (actual != null)
        {
            if (actual.cliente.getCedula() == CEDULA)
            {
                estado = 1;
                break;
            }
            actual = actual.siguiente;
        }
        return estado;
        //FIN DEL METODO BUSCAR_2
    }

    // FIN DE LA CLASE  
}
