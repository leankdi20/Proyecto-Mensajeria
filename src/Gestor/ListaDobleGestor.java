/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor;

import java.util.Scanner;

/**
 *
 * @author solis
 */
public class ListaDobleGestor {

    //LISTA QUEMADA DE GESTOR
    Scanner scanner = new Scanner(System.in);
    nodoListaDoble primero;
    nodoListaDoble ultimo;
    int dato;

    public ListaDobleGestor() {
        this.primero = null;
        this.ultimo = null;
    }

    //Metodo para ingresar
    public void ingresar(Gestor gestor) {
        nodoListaDoble nodoNuevo = new nodoListaDoble();

        nodoNuevo.gestor = gestor;

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

        nodoListaDoble actual;
        actual = ultimo;
        while (actual != null)
        {
            System.out.println(actual.gestor.toString());
            actual = actual.anterior;
        }

    }

    public void elimininar(int cedula) {
        nodoListaDoble actual = primero;
        nodoListaDoble atras = null;

        while (actual != null)
        {

            if (actual.gestor.getCedula() == cedula)
            {
                if (actual == primero)
                {
                    primero = primero.siguiente;
                    if (primero != null)
                    {
                        primero.anterior = null;
                    }

                } else
                {
                    atras.siguiente = actual.siguiente;
                    if(actual.siguiente != null){
                    actual.siguiente.anterior = atras;
                    }
                }
            }
            atras = actual;
            actual = actual.siguiente;
        }

    }

    public void buscarYmodificar(int cedula, int nuevoCedula, int telefono, String tipoGestor, boolean estado) {
        nodoListaDoble actual = primero;
        boolean encontrado = false;
        while (actual != null)
        {
            if (actual.gestor.getCedula() == cedula)
            {
                actual.gestor.setCedula(nuevoCedula);
                actual.gestor.setTelefono(telefono);
                actual.gestor.setTipoGestor(tipoGestor);
                actual.gestor.setEstado(estado);
                System.out.println("\nGestor modificado exitosamente\n");
                System.out.println("");
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        }
        if (!encontrado)
        {
            System.out.println("\nNO SE ENCONTRO NINGUN GESTOR CON LA CEDULA INGRESADA\n");
        }
    }

    public void buscar(int CEDULA) {
        nodoListaDoble actual = primero;

        boolean encontrado = false;
        while (actual != null)
        {
            if (actual.gestor.getCedula() == CEDULA)
            {
                System.out.println("\nGestor encontrado\n");
                System.out.println(actual.gestor.toString());
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        }
        if (!encontrado)
        {
            System.out.println("El Gestor no existe");
        }
    }

    public boolean autenticarGestor(int cedula) {

        // buscar gestor en la lista
        nodoListaDoble actual = primero;
        boolean encontrado = false;
        while (actual != null)
        {
            if (actual.gestor.getCedula() == cedula)
            {
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        }

        // si se encuentra el gestor, permitir acceso al menú privado
        if (encontrado)
        {

            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$    $$$$$$$$$$$$$$$$$$$$$$$$     $$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$        $$$$$$$$$$$$$$$$$$$$         $$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$      $$$$$$$$$$$$$$$$$$$$$$        $$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$    $$$$$$$$$$$$$$$$$$$$$$$$     $$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$  $$$  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$                                    $$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$                                    $$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$                                   $$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$                               $$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$            $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

            System.out.println("-----------------------------------------------------------------");
            System.out.println("_________________________________________________________________");
            System.out.println("\nBienvenido(a), " + actual.gestor.getNombreCompleto() + " " + "!\n");
            System.out.println("_________________________________________________________________");
            System.out.println("-----------------------------------------------------------------");
            return true;
        } else
        {
            System.out.println("\nNo se encontro ningun gestor con el numero de cedula proporcionado.\n");
            return false;
        }
    }
}
