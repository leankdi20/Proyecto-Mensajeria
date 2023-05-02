/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia;

import Justificacion.Justificacion;
import Justificacion.Pila_Justificacion;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Pila_Guia {
        Scanner scanner = new Scanner(System.in);
        Guia guia = new Guia(0, "");
        
    Guia[] vectorPila;
    int cima;
    boolean estado = true; // Esto estado me deja activar y desactivar
    // el ingreso de guias. Despues del push van
    // los metodos de activar y desactivar.

    public Pila_Guia(int tamano) {
        vectorPila = new Guia[tamano];
        cima = 0;
    }

    public void limpiarPila(int tamano) {
        vectorPila = new Guia[tamano];
        cima = 0;
    }

    public void push(Guia guia) {
        if (estado)
        { // Me avisa si la guia esta en servicio, deja ingresar datos.
            vectorPila[cima] = guia;
            cima++;
        } else
        {
            System.out.println("La pila se encuentra fuera de servicio. "
                    + "No se puede agregar mas guias. ");
        }

    }

    public void desactivarServicio() {
        estado = false; //cambia el estado de la pila a "fuera de servicio"
        System.out.println("La pila fue desactivada."
                + " No se pueden ingresar mas datos ");
    }

    public void activarServicio() {
        estado = true;//cambia el estado de la pila a "en servicio"
        System.out.println("La pila ha sido activada. Puede agregar datos. ");
    }

    public int Buscar(int IdGuiaBuscada) {
        int posicion = -1; // inicialmente la posición es -1 para indicar que no se encontró la guía
        for (int i = 0; i < cima; i++)
        {
            if (vectorPila[i].getIdGuia() == IdGuiaBuscada)
            {
                posicion = i;  // si encontramos la guía, actualizamos la posición
                break;
            }
        }
        if (posicion == -1)
        {
            System.out.println("La guia con ID " + IdGuiaBuscada + " no se encuentra en la pila.\n");
        } else
        {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("La guia con ID " + IdGuiaBuscada + " se encuentra en la posicion = ! " + posicion + " ! = de la pila!.\n");
            System.out.println("-------------------------------------------------------------------------------------------------");
        }
        return posicion; // retorna el numero de la posicion ubicada
    }

    public Guia pop() {

        Guia eliminar = null;

        if (cima == 0)
        {
            System.out.println("La pila está vacia");
        } else
        {
            cima--;
            eliminar = vectorPila[cima];
            vectorPila[cima] = null;

        }

        return eliminar;

    }
    
     public void modificar(Guia guia) {
    
    System.out.print("Ingrese el número de IdGuia a buscar: ");
    int idGuiaBuscado = scanner.nextInt();

    boolean encontrado = false;
    for (int i = 0; i < cima; i++) {
        if (vectorPila[i].getIdGuia() == idGuiaBuscado) {
            System.out.println("La IdGuia " + idGuiaBuscado + " ha sido encontrada.");
            System.out.print("Ingrese el nuevo ID de Guia: ");
            scanner.nextLine();
            String nuevoEstadoDeGuia = scanner.nextLine();
         
            System.out.print("Ingrese las nuevas observaciones: ");
           // String nuevasObservaciones = scanner.nextLine();
            
            vectorPila[i].setEstadoGuia(nuevoEstadoDeGuia);
            //vectorPila[i].setObservaciones(nuevasObservaciones);
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        if (cima == 5) {
            // Si la pila ya tiene 5 elementos, eliminar los 3 primeros valores
            for (int i = 0; i < 3; i++) {
                pop();
            }
        }
        vectorPila[cima] = guia;
        cima++;
    }
}

    public int tamano() {
        return vectorPila.length;
    }

    public boolean pilaVacia() {
        if (cima == 0)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean pilaLlena(int tamano) {
        System.out.println("");
        System.out.println("Contenido de la pila: ");
        System.out.println("");
        for (int i = cima - 1; i >= 0; i--)
        {
            System.out.println(vectorPila[i].toString());
        }
        return false;

    }
//Muestra todos los numeros de la PILA

    public Guia mostrarPila() {
        Guia valor2 = null;
        String pilaString = "";
        for (int i = cima - 1; i >= 0; i--)
        {
            //System.out.println(vectorPila[i].toString());
            pilaString += vectorPila[i].toString() + "\n";
            valor2 = vectorPila[i];
        }
        System.out.println(pilaString);
        return valor2;
    }

    //Recorre toda la pila hasta mostrar el ultimo numero.
    public Guia mostrarFondo() {
        Guia valor = null;
        while (pilaVacia() == false)
        {
            valor = pop();
        }
        return valor;

    }

    public int tamaño() {

        return cima;

    }

    public int buscarGuia(int numeroGuia) {
        for (int i = 0; i < cima; i++)
        {
            if (vectorPila[i].getIdGuia() == numeroGuia)
            {
                return i;
            }
        }
        return -1;
    }
    





}
