/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

import Servicio.ListaDobleServicios;

/**
 *
 * @author Leandro
 */
public class arboles {

    nodoArboles raiz;
    int cant;
    int altura;

    public arboles() {
        raiz = null;
    }

    public boolean esVacio() {
        return (raiz == null);
    }

    public void insertar(int info, String justificaciones) {
        if (!existe(info))
        {
            nodoArboles nuevo = new nodoArboles();
            nuevo.info = info;
            nuevo.justificacion = justificaciones;
            nuevo.izq = null;
            nuevo.der = null;
            if (raiz == null)
            {
                raiz = nuevo;
                System.out.println("Arbol vacio. Se ha agregado la justificacion\n");
            } else
            {
                nodoArboles anterior = null, reco = raiz;
                
                while (reco != null)
                {
                    anterior = reco;
                    if (info < reco.info)
                    {
                        reco = reco.izq;
                    } else
                    {
                        reco = reco.der;
                    }
                }
                if (info < anterior.info)
                {
                    anterior.izq = nuevo;
                } else
                {
                    anterior.der = nuevo;
                }
            }
        }
    }

    public boolean existe(int info) {
        nodoArboles reco = raiz;
        while (reco != null)
        {
            if (info == reco.info)
            {
                return true;
            } else if (info > reco.info)
            {
                reco = reco.der;
            } else
            {
                reco = reco.izq;
            }
        }
        return false;
    }

    private void imprimirPre(nodoArboles reco) {
        if (reco != null)
        {
            System.out.print(reco.toString() + " ");
            imprimirPre(reco.izq);
            imprimirPre(reco.der);
        }
    }

    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }

    public boolean eliminar(int dato) {
        nodoArboles auxiliar = raiz;
        nodoArboles padre = raiz;
        boolean eshijoIzq = true;
        while (auxiliar.info != dato)
        {
            padre = auxiliar;
            if (dato < auxiliar.info)
            {
                eshijoIzq = true;
                auxiliar = auxiliar.izq;
            } else
            {
                eshijoIzq = false;
                auxiliar = auxiliar.der;
            }
            if (auxiliar == null)
            {
                return false;
            }
        }//fin del while
        if (auxiliar.izq == null && auxiliar.der == null)
        {
            if (auxiliar == raiz)
            {
                raiz = null;
            } else if (eshijoIzq)
            {
                padre.izq = null;
            } else
            {
                padre.der = null;
            }
        } else if (auxiliar.der == null)
        {
            if (auxiliar == raiz)
            {
                raiz = auxiliar.izq;
            } else if (eshijoIzq)
            {
                padre.izq = auxiliar.izq;
            } else
            {
                padre.der = auxiliar.izq;
            }
        } else if (auxiliar.der == null)
        {
            if (auxiliar == raiz)
            {
                raiz = auxiliar.der;
            } else if (eshijoIzq)
            {
                padre.izq = auxiliar.der;
            } else
            {
                padre.der = auxiliar.izq;
            }
        } else
        {
            nodoArboles reemplazo = obtenerNodoRemplazo(auxiliar);
            if (auxiliar == raiz)
            {
                raiz = reemplazo;
            } else if (eshijoIzq)
            {
                padre.izq = reemplazo;
            } else
            {
                padre.der = reemplazo;
            }
            reemplazo.izq = auxiliar.izq;
        }
        return true;
    }

    public nodoArboles obtenerNodoRemplazo(nodoArboles nodoReemp) {
        nodoArboles reemplazarPadre = nodoReemp;
        nodoArboles reemplazo = nodoReemp;
        nodoArboles auxiliar = nodoReemp.der;
        while (auxiliar != null)
        {
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.izq;
        }
        if (reemplazo != nodoReemp.der)
        {
            reemplazarPadre.izq = reemplazo.der;
            reemplazo.der = nodoReemp.der;
        }
        System.out.println("el nodo es " + reemplazo);
        return reemplazo;
    }

    private void retornarAltura(nodoArboles reco, int nivel) {
        if (reco != null)
        {
            retornarAltura(reco.izq, nivel + 1);
            if (nivel > altura)
            {
                altura = nivel;
            }
            retornarAltura(reco.der, nivel + 1);
        }
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

}
