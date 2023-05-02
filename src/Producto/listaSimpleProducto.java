package Producto;

import Rutas.ControlRuta;
import Rutas.nodoListaSimpleRutas;

/**
 *
 * @author Leandro
 */
public class listaSimpleProducto {

   private nodoListaSimpleProducto primero;
   private nodoListaSimpleProducto ultimo;

    public listaSimpleProducto() {
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

    public void ingresarFinal(TipoProducto producto) {
        nodoListaSimpleProducto nodoNuevo = new nodoListaSimpleProducto();

        nodoNuevo.producto = producto;
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
        nodoListaSimpleProducto aux = primero;
        while (aux != null)
        {
            TipoProducto producto = aux.producto;
            System.out.println("Lista de rutas: " + producto.toString());
            aux = aux.siguiente;
        }
    }
    
    public void mostrarMedio(){
        
         nodoListaSimpleProducto aux;
         aux = primero.siguiente;
         
         while(aux.siguiente != null){
         System.out.println(aux.producto);
         aux = aux.siguiente;
         
         }
        
    }
    
    public void buscar(int id)
    {
        nodoListaSimpleProducto actual = primero;
        
        while (actual != null){
            if (actual.producto.getIdTipoProducto() == id)
            {
                System.out.println("");
                System.out.println("PRODUCTO ENCONTRADO\n");
                System.out.println(actual.producto.toString());
            }
            actual = actual.siguiente;
        }
    }
    
    public void eliminar(int id){
        nodoListaSimpleProducto actual = primero;
        nodoListaSimpleProducto anterior = null;
               
        while (actual != null)
        {
            if (actual.producto.getIdTipoProducto() == id){
                if (actual == primero)
                {
                    primero = actual.siguiente;
                }else{
                    anterior.siguiente = actual.siguiente;   
                    return;
                }               
            }
             anterior = actual;
             actual = actual.siguiente;
        }
        System.out.println("PRODUCTO ELIMINADO");
    }
    
    public void modificarProducto (int id ,double monto, String observaciones, String estado){
        nodoListaSimpleProducto aux = primero;
        while (aux != null)
        {
            System.out.println("Se enconto el ID, puede modificar");
            if(aux.producto.getIdTipoProducto() == id){
                //Se encontro el Producto
                aux.producto.setMonto(monto);
                aux.producto.setObservaciones(observaciones);
                aux.producto.setEstado(estado);
                System.out.println("PRODUCTO ACTUALIZADO CON EXITO");
                return;
            }
            aux = aux.siguiente;
        }
        System.out.println("No se encontro el PRODUCTO CON "+ id);
        //Fin del metodo modificarProducto
    }

    
}
