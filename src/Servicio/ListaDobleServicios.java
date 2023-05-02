package Servicio;

import Arbol.arboles;
import Cliente.Cliente;
import Cliente.ListaDoble;
import Cliente.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author frmez
 */
//Esta clase es la que funciona como Centro de acopio ya que el gestor podra agregar servicios al final o al principio, dependiendo la prioridad.
public class ListaDobleServicios {
    
 

    Scanner sc = new Scanner(System.in);

    nodoListaDobleServicios primero;
    nodoListaDobleServicios ultimo;

    public ListaDobleServicios() {
        primero = null;
        ultimo = null;
    }

    public boolean listaVacia() {

        if (primero == null)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public void ingresarDespues(int cedula) {
        nodoListaDobleServicios nodoNuevo = new nodoListaDobleServicios();

        //System.out.println("Ingrese la cédula del cliente al que pertenece el servicio:");
        //nodoNuevo.cedulaCliente = sc.nextInt();
        //CONSULTAR POR COMO HACER PARA LLAMAR LA CEDULA DEL CLIENTE, Y
        //SI LA ENCUENTRA QUE CONTINUE CON EL SERVICIO.
        System.out.println("Ingrese el ID para el nuevo servicio:");
        nodoNuevo.idServicio = sc.nextInt();

        sc.nextLine();
        System.out.println("Ingrese observaciones del nuevo servicio:");
        nodoNuevo.observaciones = sc.nextLine();

        System.out.println("Ingrese instrucciones del nuevo servicio:");
        nodoNuevo.instrucciones = sc.nextLine();
        nodoNuevo.cedulaCliente = cedula;

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
        System.out.println("Se agregó nuevo servicio con menor prioridad.\n");
    }

    public void ingresarAntes(int cedula) {
        nodoListaDobleServicios nodoNuevo = new nodoListaDobleServicios();

        System.out.println("Ingrese el ID para el nuevo servicio:");
        nodoNuevo.idServicio = sc.nextInt();

        sc.nextLine();
        System.out.println("Ingrese observaciones del nuevo servicio:");
        nodoNuevo.observaciones = sc.nextLine();

        System.out.println("Ingrese instrucciones del nuevo servicio:");
        nodoNuevo.instrucciones = sc.nextLine();
        nodoNuevo.cedulaCliente = cedula;

        if (primero == null)
        {
            primero = nodoNuevo;
            primero.siguiente = null;
            ultimo = primero;
        } else
        {
            nodoNuevo.siguiente = primero;
            primero = nodoNuevo;
            ultimo.siguiente = (nodoListaDobleServicios) primero;
        }
        System.out.println("Se agregó un nuevo servicio con mayor prioridad.\n");
    }

    /* public void buscar(int pIdServicio) {
        nodoListaDobleServicios actual = new nodoListaDobleServicios();
        actual = primero;
        while (actual != null) {
            if (actual.idServicio == pIdServicio) {
                System.out.println("nodo encontrado");
            }
            actual = actual.siguiente;
        }
    }*/
    public void eliminar(int pIdServicio, arboles a) {
        if (primero == null)
        {
            System.out.println("La lista está vacía.");
            return;
        }
        nodoListaDobleServicios actual = primero;
        nodoListaDobleServicios anterior = null;

        boolean encontrado = false;

        while (actual != null && encontrado != true)
        {
            if (actual.idServicio == pIdServicio)
            {
                if (actual == primero)
                {
                    primero = primero.siguiente;
                    if (primero != null)
                    {
                        primero.anterior = null;
                    }
                    if (actual == ultimo)
                    {
                        ultimo = null;
                    }
                } else if (actual == ultimo)
                {
                    ultimo = anterior;
                    anterior.siguiente = null;
                } else
                {
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }
                // Pedir justificacion
                
                System.out.println("\nIngrese la justificacion por que se elimina el servicio: \n");
                String justificacion = sc.nextLine();

                //aca ingreso el servicio eliminado para mandar al arbol
                
                a.insertar(pIdServicio, justificacion);
                
                System.out.println("Servicio eliminado con éxito.\n");
                a.imprimirPre();
                
                 //arbol.retornarAltura();
                encontrado = true;
            } else
            {
                anterior = actual;
                actual = actual.siguiente;
            }
        }
        if (!encontrado)
        {
            System.out.println("El servicio no se encontró en la lista.");
        }
    }

    public void mostrarLista(Cliente cliente) {
        if (primero == null)
        {
            System.out.println("La lista de servicios está vacía.");
        } else
        {
            nodoListaDobleServicios aux = primero;

            while (aux != null)
            {
                System.out.println("A continuacion se muestra la lista de servicios por ID: "
                        + "\n ID de servicio " + aux.idServicio
                        + "\nCedula de cliente : " + aux.cedulaCliente
                        + "\nInstrucciones : " + aux.instrucciones
                        + "\nObservaciones: " + aux.observaciones + "\n" + "\n");
                aux = aux.siguiente;
            }
            System.out.println("\nFin de la lista\n");
        }
    }

}
