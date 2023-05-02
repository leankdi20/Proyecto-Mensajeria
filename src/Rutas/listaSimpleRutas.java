/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rutas;

/**
 *
 * @author Leandro
 */
public class listaSimpleRutas {

    private nodoListaSimpleRutas primero;
    private nodoListaSimpleRutas ultimo;

    ControlRuta ruta = new ControlRuta(0, "", "", "", "");

    public listaSimpleRutas() {
        primero = null;
        ultimo = null;

    }

    public boolean Vacia() {

        if (primero == null)
        {
            return true;
        } else

        {
            return false;
        }
    }

    public void ingresarFinal(ControlRuta rutas) {
        nodoListaSimpleRutas nodoNuevo = new nodoListaSimpleRutas();

        nodoNuevo.rutas = rutas;
        if (primero == null)
        {
            primero = nodoNuevo;
            primero.siguiente = null;
            ultimo = primero;
        } else
        {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            ultimo = nodoNuevo;
        }
    }

    public void mostrarLista() {
        if (primero == null)
        {
            System.out.println("La lista esta vacia");
            return;
        }
        nodoListaSimpleRutas aux = primero;
        while (aux != null)
        {
            ControlRuta ruta = aux.rutas;
            System.out.println("Lista de rutas: " + ruta.toString());
            aux = aux.siguiente;
        }
    }

    public void mostrarMedio() {

        nodoListaSimpleRutas aux;
        aux = primero.siguiente;

        while (aux.siguiente != null)
        {
            System.out.println(aux.rutas);
            aux = aux.siguiente;

        }

    }

    public void buscar(int id) {
        nodoListaSimpleRutas actual = primero;

        while (actual != null)
        {
            if (actual.rutas.getidRuta() == id)
            {   
                System.out.println("");
                System.out.println("RUTA ENCONTRADA\n");
                System.out.println(actual.rutas.toString());
            }
            actual = actual.siguiente;
        }
    }

    public void eliminar(int id) {
        nodoListaSimpleRutas actual = primero;
        nodoListaSimpleRutas anterior = null;

        while (actual != null)
        {
            if (actual.rutas.getidRuta() == id)
            {
                if (actual == primero)
                { //Si es el primero nodo de la lista
                    primero = actual.siguiente;
                } else
                {
                    anterior.siguiente = actual.siguiente;
                    return; // Termina el metodo luego de eliminar el nodo
                }
            }else{
                System.out.println("No se encontro ruta con id " +id);
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        System.out.println("RUTA ELIMINADA CON EXITO");
    }

    public void modificarRuta(int id, String distrito, String canton, String provincia, String direccion) {
        nodoListaSimpleRutas aux = primero;
        while (aux != null)
        {
            System.out.println("Se encontró el ID, puede modifiar: \n");
            if (aux.rutas.getidRuta() == id)
            {

                // Se encontró la ruta con el id indicado, actualizar los atributos
                aux.rutas.setDistritoRuta(distrito);
                aux.rutas.setCantonRuta(canton);
                aux.rutas.setProvinciaRuta(provincia);
                aux.rutas.setDireccionRuta(direccion);
                System.out.println("Ruta actualizada con éxito.\n");
                return;
            }
            aux = aux.siguiente;
        }
        // Si se llega aquí es porque no se encontró la ruta con el id indicado
        System.out.println("No se encontró una ruta con el id indicado.");
        // Fin metodo modificar
    }

    // FIn de metodos Lista   
}
