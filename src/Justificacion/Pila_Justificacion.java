/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Justificacion;
//import Menu_proyecto;
import java.time.LocalDate;
import java.util.Scanner;
import Guia.Pila_Guia;
import Guia.Guia;

/**
 *
 * @author Leandro
 */
public class Pila_Justificacion {
Scanner scanner = new Scanner(System.in);
    Justificacion[] vectorPila;
    
    int cima;

    public Pila_Justificacion(int tamano) {
        vectorPila = new Justificacion[tamano];
        cima = 0;
    }

    public void limpiarPila(int tamano) {
        vectorPila = new Justificacion[tamano];
        cima = 0;
    }

    public void push(Justificacion justificacion) {
        if (cima == 5) {
        // Si la pila ya tiene 15 elementos, eliminar los 10 primeros valores
        for (int i = 0; i < 3; i++) {
            pop();
            //Hice como el profesor me dijo. Estaba bien que 
            //cumpla con borrar 10 de 15, pero lo bajamos a 
            // 5 el tamaño de la pila. Si tiene 5, borra las 3 primeras.
        }
    }
        vectorPila[cima] = justificacion;
        cima++;

    }
    
    public void modificar(Justificacion justificacion) {
    
    System.out.print("Ingrese el número de IdGuia a buscar: ");
    int idGuiaBuscado = scanner.nextInt();

    boolean encontrado = false;
    for (int i = 0; i < cima; i++) {
        if (vectorPila[i].getIdGuia() == idGuiaBuscado) {
            System.out.println("La Justificación con IdGuia " + idGuiaBuscado + " ha sido encontrada.");
            System.out.print("Ingrese el nuevo ID de idJustificacion: ");
            int nuevoIdJustificacion = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese las nuevas observaciones: ");
            String nuevasObservaciones = scanner.nextLine();
            
            vectorPila[i].setIdJustificacion(nuevoIdJustificacion);
            vectorPila[i].setObservaciones(nuevasObservaciones);
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
        vectorPila[cima] = justificacion;
        cima++;
    }
}


    
  
   public Justificacion[] buscar2(int idJustificacion) {
    Justificacion[] justificaciones = new Justificacion[cima];
    int contador = 0;
    for (int i = cima - 1; i >= 0; i--) {
        if (vectorPila[i].getIdJustificacion()== idJustificacion) {
            justificaciones[contador] = vectorPila[i];
            contador++;
        }
    }
    if (contador == 0) {
        return null;
    } else {
        Justificacion[] resultado = new Justificacion[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = justificaciones[i];
        }
        return resultado;
    }
}

    public Justificacion pop() {

        Justificacion eliminar = null;

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

    public Justificacion mostrarPila() {
        Justificacion valor2 = null;
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
    public Justificacion mostrarFondo() {
        Justificacion valor = null;
        while (pilaVacia() == false)
        {
            valor = pop();
        }
        return valor;

    }
    
    public int tamaño(){
        
        return cima;
        
    }

}
