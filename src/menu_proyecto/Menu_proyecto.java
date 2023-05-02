package menu_proyecto;

import java.util.Scanner;
import java.io.IOException;
import Justificacion.Pila_Justificacion;
import Justificacion.Justificacion;
import Guia.Guia;
import Guia.Pila_Guia;
import Cliente.Cliente;
import Cliente.ListaDoble;
import Cliente.Persona;
import Cliente.interfacePersona;
import Cliente.nodoListaDoble;
import Gestor.Gestor;
import Gestor.ListaDobleGestor;
import Mensajero.ListaDobleMensajero;
import Mensajero.Mensajero;
import Producto.TipoProducto;
import Producto.listaSimpleProducto;
import Rutas.ControlRuta;
import Rutas.listaSimpleRutas;
import Servicio.ListaDobleServicios;
import java.util.InputMismatchException;
import Arbol.arboles;
import Arbol.nodoArboles;
import Producto.TipoProducto;
import Producto.listaSimpleProducto;
import Producto.nodoListaSimpleProducto;

/**
 *
 * @author Leandro
 */
public class Menu_proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        // Limpiar la consola
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        //Instanticas Justificacion//
        Pila_Justificacion pila = new Pila_Justificacion(15);

        //Instancia Guia//
        Pila_Guia pilaG = new Pila_Guia(15);
        Guia guia1 = new Guia(111, "En envio\n");
        Guia guia2 = new Guia(222, "En envio\n");
        Guia guia3 = new Guia(333, "En envio\n");
        Guia guia4 = new Guia(444, "En envio\n");
        Guia guia5 = new Guia(555, "En envio\n");

        pilaG.push(guia1);
        pilaG.push(guia2);
        pilaG.push(guia3);
        pilaG.push(guia4);
        pilaG.push(guia5);

        //INSTANCIA CLIENTE//
        ListaDoble Lista = new ListaDoble();
        //CREACION CLIENTE
        Cliente nuevoCliente = new Cliente("Alberto Hernandez", 1, 86405631,
                "ahernandez22@ulacit.ed.cr", true, "San josé");
        Cliente nuevoCliente2 = new Cliente("Daniela Garcia", 2, 86405654,
                "dGarcia12@ulacit.ed.cr", true, "Cartago");
        Cliente nuevoCliente3 = new Cliente("Esteban Quito", 3, 86405655,
                "equito@ulacit.ed.cr", true, "San jose");
        Cliente nuevoCliente4 = new Cliente("Fabian Cordero", 4, 86405654,
                "fcordero@ulacit.ed.cr", true, "Lomas");
        Cliente nuevoCliente5 = new Cliente("Facundo Contreras", 5, 87405677,
                "fcontreras@ulacit.ed.cr", true, "Limon");
        Cliente nuevoCliente6 = new Cliente("Catalina Herrera", 6, 86705609,
                "cherrera@ulacit.ed.cr", true, "Candelaria");
        Lista.ingresar(nuevoCliente);
        Lista.ingresar(nuevoCliente2);
        Lista.ingresar(nuevoCliente3);
        Lista.ingresar(nuevoCliente4);
        Lista.ingresar(nuevoCliente5);
        Lista.ingresar(nuevoCliente6);

        //Instancia GESTOR
        ListaDobleGestor ListaG = new ListaDobleGestor();
        //Instancia SERVICIO
        ListaDobleServicios ListaS = new ListaDobleServicios();
        //CREACION DE ADMINISTRADORES
        Gestor Admin = new Gestor("Administrador    ", true, "Leandro Emanuel Varela    ", 35874050, 86304521);
        Gestor Admin2 = new Gestor("Administrador   ", true, "Fabricio Solis Calderon   ", 119230058, 84555098);
        Gestor Admin3 = new Gestor("Administrador   ", true, "Franciny Zamora Hernández ", 304680208, 87510652);
        Gestor Admin4 = new Gestor("Administrador   ", true, "Oliver Pérez Sánchez      ", 115870881, 87066943);

        ListaG.ingresar(Admin);
        ListaG.ingresar(Admin2);
        ListaG.ingresar(Admin3);
        ListaG.ingresar(Admin4);
        //------------------------------------------------------------//
        //Instancia Mensajero
        ListaDobleMensajero ListaM = new ListaDobleMensajero();
        //--------------CREACION DE MENSAJEROS------------------------//
        Mensajero mensajero1 = new Mensajero(1, "Panameño     ", true, "Franchesco Santino  ", 22, 22345622);
        Mensajero mensajero2 = new Mensajero(2, "Ecuatoriano  ", true, "Esteban Falco       ", 23, 223456754);
        Mensajero mensajero3 = new Mensajero(3, "Costarricense", true, "Josefina Lujan      ", 55, 2234456);
        Mensajero mensajero4 = new Mensajero(4, "Colombiano   ", true, "Flavia Campos       ", 63, 22345657);
        Mensajero mensajero5 = new Mensajero(5, "Guatemalteco ", true, "Estefania Salomon   ", 30, 22343672);

        ListaM.ingresar(mensajero5);
        ListaM.ingresar(mensajero4);
        ListaM.ingresar(mensajero3);
        ListaM.ingresar(mensajero2);
        ListaM.ingresar(mensajero1);
        //------------------------------------------------------------//
        //Instancia Control de Rutas
        listaSimpleRutas listaRuta = new listaSimpleRutas();

        //----------------------------------------------------------//
        //Instancia de Productos//
        listaSimpleProducto listaPro = new listaSimpleProducto();
        TipoProducto producto1 = new TipoProducto(1, 700000, "TV Samsung", "Fragil");
        TipoProducto producto2 = new TipoProducto(2, 600000, "TV Philip", "Fragil");
        TipoProducto producto3 = new TipoProducto(3, 60000, "Escritorio", "Fragil");
        TipoProducto producto4 = new TipoProducto(4, 30000, "Plancha ", "Fragil");
        TipoProducto producto5 = new TipoProducto(5, 300000, "Cocina", "Pesado");

        listaPro.ingresarFinal(producto1);
        listaPro.ingresarFinal(producto2);
        listaPro.ingresarFinal(producto3);
        listaPro.ingresarFinal(producto4);
        listaPro.ingresarFinal(producto5);

        //----------------------------------------------------------//
        //Instanca servicios//
        //ListaDobleServicios servicioA = new ListaDobleServicios();
        //----------------------------------------------------------//
        //Instancia Arbol
        arboles arbol = new arboles();

        //-----------------------------------------//
        Scanner scanner = new Scanner(System.in);
        int opcionPrincipal, opcionSubMenu, opcionSubMenu2;

        boolean mostrarMenuAnterior = false;
        boolean estado_b = false;

        //MENU PRINCIPAL//
        try
        {
            do
            {
                if (!mostrarMenuAnterior)
                {
                    System.out.println("*******************************************");
                    System.out.println("**************|                |***********");
                    System.out.println("**************| MENU PRINCIPAL |***********");
                    System.out.println("**************|                |***********");
                    System.out.println("*******************************************");
                    System.out.println("------------------------------------------|");
                    System.out.println("      1.           Gestor                  ");
                    System.out.println("------------------------------------------|");
                    System.out.println("-                                         -");
                    System.out.println("------------------------------------------|");
                    System.out.println("      0.           Salir                   ");
                    System.out.println("------------------------------------------|");
                    System.out.print("          Ingrese una opcion: ");
                }
                opcionPrincipal = scanner.nextInt();
                System.out.println("\n-----------------------------------------------");
                scanner.nextLine();

                switch (opcionPrincipal)
                {

                    case 1:

                        System.out.println("*********************************************");
                        System.out.println("_____________________________________________");
                        System.out.println("**********                           ********");
                        System.out.println("---------          ATENCION           -------");
                        System.out.println("********* ESTA INGRESANDO COMO GESTOR *******");
                        System.out.println("**********___________________________********");
                        System.out.println("*********************************************");
                        System.out.println("*********************************************");
                        System.out.println("_____________________________________________");
                        System.out.println("        Ingrese su numero de cedula:         ");
                        System.out.println("---------------------------------------------");
                        System.out.print("          Cedula: ");
                        int cedula = scanner.nextInt();
                        System.out.println("---------------------------------------------");
                        if (ListaG.autenticarGestor(cedula))
                        {

                            do
                            {
                                System.out.println("***************************************************");
                                System.out.println("******                                     ********");
                                System.out.println("******---   Menu para gestores privados  --********");
                                System.out.println("******                                     ********");
                                System.out.println("***************************************************");
                                System.out.println("---------------------------------------------------");
                                System.out.println("---------------------------------------------------");
                                System.out.println("1.             Mantenimiento de clientes           ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("2.             Mantenimiento de mensajeros         ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("3.             Mantenimiento de gestores           ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("4.             Crear un nuevo servicio             ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("5.             Mantenimiento de guías              ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("6.             Mantenimiento de justificaciones    ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("7.             Mantenimiento de rutas              ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("8.             Seccion de productos                ");
                                System.out.println("---------------------------------------------------");
                                System.out.println("-                                                 -");
                                System.out.println("---------------------------------------------------");
                                System.out.println("0.                Cerrar sesion                    ");
                                System.out.println("---------------------------------------------------");
                                System.out.print("Seleccione una opcion: ");

                                opcionSubMenu2 = scanner.nextInt();

                                switch (opcionSubMenu2)
                                {
                                    case 1:
                                        //-------------------------------------//
                                        //MANTENIMIENTO DE CLIENTE//
                                        //---------------------------------------//
                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("***************************");
                                                System.out.println("******Menu Cliente*********");
                                                System.out.println("***************************");
                                                System.out.println("1.    Crear cliente       |");
                                                System.out.println("---------------------------");
                                                System.out.println("2.    Eliminar cliente    |");
                                                System.out.println("---------------------------");
                                                System.out.println("3.    Modificar cliente   |");
                                                System.out.println("---------------------------");
                                                System.out.println("4.    Buscar cliente      |");
                                                System.out.println("---------------------------");
                                                System.out.println("5.    Lista cliente       |");
                                                System.out.println("---------------------------");
                                                System.out.println("-                         -");
                                                System.out.println("---------------------------");
                                                System.out.println("0.       Volver           |");
                                                System.out.println("---------------------------");
                                                System.out.print("   Seleccione una opción:");

                                            }

                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Nuevo cliente");
                                                        //Ingresar gestor
                                                        scanner.nextLine();
                                                        System.out.println("\nIngrese el nombre completo");
                                                        String NOMBRE = scanner.nextLine();
                                                        System.out.println("\nIngrese el numero de cedula");
                                                        int CEDULA = scanner.nextInt();
                                                        System.out.println("\nIngrese el numero de telefono");
                                                        int TELEFONO = scanner.nextInt();
                                                        System.out.println("\nIngrese el email del cliente");
                                                        String email = scanner.next();
                                                        System.out.println("\nIngrese el estado del cliente. Activo/Inactivo");
                                                        scanner.nextLine();
                                                        String estado = scanner.nextLine();
                                                        estado = estado.toLowerCase();
                                                        if (estado.equals("activo"))
                                                        {
                                                            estado_b = true;
                                                            System.out.println("Estado: Activo");

                                                        } else
                                                        {
                                                            estado_b = false;
                                                            System.out.println("Estado: Inactivo");
                                                        }
                                                        System.out.println("\nIngrese la direccion del cliente");
                                                        String direccion = scanner.nextLine();

                                                        Cliente cliente = new Cliente(NOMBRE, CEDULA, TELEFONO, email, estado_b, direccion);

                                                        Lista.ingresar(cliente);
                                                        System.out.println("SE HA CREADO NUEVO CLIENTE");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 2:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese la cedula del cliente que desea eliminar");

                                                        int CEDULA = scanner.nextInt();
                                                        Lista.elimininar(CEDULA);

                                                        System.out.println("El cliente se ha eliminado correctamente");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 3:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese el numero de CEDULA del cliente");
                                                        cedula = scanner.nextInt();

                                                        System.out.println("Ingrese la nueva cedula del cliente: ");
                                                        int nuevaCedula = scanner.nextInt();
                                                        scanner.nextLine();
                                                        System.out.println("Ingrese el nombre completo: ");
                                                        String nombreC = scanner.nextLine();

                                                        System.out.println("Ingrese el nuevo estado: ");
                                                        String estado = scanner.nextLine();
                                                        estado = estado.toLowerCase();
                                                        if (estado.equals("activo"))
                                                        {
                                                            estado_b = true;
                                                            System.out.println("Estado: Activo");

                                                        } else
                                                        {
                                                            estado_b = false;
                                                            System.out.println("Estado: Inactivo");
                                                        }
                                                        System.out.println("Ingrese el nuevo E-mail: ");
                                                        String email = scanner.nextLine();

                                                        System.out.println("Ingrese la nueva Direccion: ");
                                                        String direccion = scanner.nextLine();

                                                        System.out.println("Ingrese el nuevo numero de Telefono: ");
                                                        int telefono = scanner.nextInt();

                                                        Lista.buscarYmodificar(cedula, nombreC, nuevaCedula, telefono, estado_b, direccion, email);
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 4:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Buscar cliente: ");
                                                        System.out.println("\nIngrese el numero de cedula\n");
                                                        Lista.buscar(scanner.nextInt());
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 5:
                                                    System.out.println("------------------------");
                                                    System.out.println("\nVer lista de cliente\n");
                                                    Lista.mostrarDoble();
                                                    System.out.println("");
                                                    System.out.println("------------------------");

                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu != 0);
                                        break;
                                    case 2:
                                        //------------------------//
                                        //Mantenimiento mensajero///

                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("*****************************");
                                                System.out.println("****** Menu Mensajero *******");
                                                System.out.println("*****************************");
                                                System.out.println("1.    Crear Mensajero       |");
                                                System.out.println("-----------------------------");
                                                System.out.println("2.    Eliminar Mensajero    |");
                                                System.out.println("-----------------------------");
                                                System.out.println("3.    Modificar Mensajero   |");
                                                System.out.println("-----------------------------");
                                                System.out.println("4.    Buscar Mensajero      |");
                                                System.out.println("-----------------------------");
                                                System.out.println("5.    Lista Mensajero       |");
                                                System.out.println("-----------------------------");
                                                System.out.println("-                           -");
                                                System.out.println("-----------------------------");
                                                System.out.println("0.         Volver           |");
                                                System.out.println("-----------------------------");
                                                System.out.print("   Seleccione una opción:");

                                            }
                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        //Ingresar
                                                        System.out.println("Ingrese el nombre del mensajero");
                                                        String NOMBRE = scanner.nextLine();
                                                        scanner.nextLine();
                                                        System.out.println("Ingrese el telefono");
                                                        int TELEFONO = scanner.nextInt();
                                                        System.out.println("Ingrese la cedula");
                                                        int CEDULA = scanner.nextInt();
                                                        System.out.println("Ingrese el codigo del mensajero");
                                                        int codigo = scanner.nextInt();
                                                        scanner.nextLine();
                                                        System.out.println("Ingrese la nacionalidad");
                                                        String nacionalidad = scanner.nextLine();

                                                        System.out.println("Ingrese el estado");
                                                        String estado = scanner.nextLine();
                                                        estado = estado.toLowerCase();
                                                        if (estado.equals("activo"))
                                                        {
                                                            estado_b = true;
                                                            System.out.println("Estado: Activo");

                                                        } else
                                                        {
                                                            estado_b = false;
                                                            System.out.println("Estado: Inactivo");
                                                        }

                                                        Mensajero mensajero = new Mensajero(codigo, nacionalidad, estado_b, NOMBRE, CEDULA, TELEFONO);

                                                        ListaM.ingresar(mensajero);
                                                        System.out.println("SE HA CREADO NUEVO MENSAJERO");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 2:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.print("Introduce la CEDULA del mensajero: ");
                                                        int CEDULA = scanner.nextInt();
                                                        ListaM.elimininar(CEDULA);
                                                        System.out.println("");
                                                        System.out.println("Mensajero Eliminado");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 3:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("\n ");

                                                        System.out.println("Ingrese la cedula del mensajero que quiere modificar");
                                                        cedula = scanner.nextInt();
                                                        scanner.nextLine();

                                                        System.out.println("\nIngrese los nuevos datos del mensajero\n");
                                                        System.out.println("Ingrese el nombre del mensajero");
                                                        String NOMBRE = scanner.nextLine();

                                                        System.out.println("Ingrese nuevo codigo del mensajero");
                                                        int nuevaCodigo = scanner.nextInt();

                                                        System.out.println("Ingrese el telefono");
                                                        int TELEFONO = scanner.nextInt();
                                                        scanner.nextLine();
                                                        System.out.println("\nIngrese la nacionalidad del mensajero");
                                                        String nacionalidad = scanner.nextLine();

                                                        System.out.println("Ingrese su nuevo estado (Activo/Inactivo)");
                                                        String estado = scanner.nextLine();
                                                        estado = estado.toLowerCase();
                                                        if (estado.equals("activo"))
                                                        {
                                                            estado_b = true;
                                                            System.out.println("Estado: Activo");

                                                        } else
                                                        {
                                                            estado_b = false;
                                                            System.out.println("Estado: Inactivo");
                                                        }

                                                        ListaM.buscarYmodificar(NOMBRE, cedula, nuevaCodigo, TELEFONO, nacionalidad, estado_b);

                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 4:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Buscar Mensajero");
                                                        System.out.println("Introduzca el numero de cedula del mensajero");
                                                        int CEDULA = scanner.nextInt();
                                                        ListaM.buscar(CEDULA);
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 5:
                                                    System.out.println("------------------------");
                                                    System.out.println("Ver lista de Mensajero");
                                                    ListaM.mostrarDoble();
                                                    System.out.println("");
                                                    System.out.println("------------------------");

                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu != 0);

                                        break;
                                    case 3:
                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("***************************");
                                                System.out.println("******Menu Gestor *********");
                                                System.out.println("***************************");
                                                System.out.println("1.    Crear Gestor        |");
                                                System.out.println("---------------------------");
                                                System.out.println("2.    Eliminar Gestor     |");
                                                System.out.println("---------------------------");
                                                System.out.println("3.    Modificar Gestor    |");
                                                System.out.println("---------------------------");
                                                System.out.println("4.    Buscar Gestor       |");
                                                System.out.println("---------------------------");
                                                System.out.println("5.    Lista Gestor        |");
                                                System.out.println("---------------------------");
                                                System.out.println("-                         -");
                                                System.out.println("-                         -");
                                                System.out.println("---------------------------");
                                                System.out.println("0.       Volver           |");
                                                System.out.println("---------------------------");
                                                System.out.println("Seleccione una opción:");
                                                System.out.println(": ");
                                            }
                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Nuevo Gestor");
                                                        //Ingresar gestor
                                                        scanner.nextLine();
                                                        System.out.println("\nIngrese el nombre completo");
                                                        String NOMBRE = scanner.nextLine();
                                                        System.out.println("\nIngrese el numero de cedula");
                                                        int CEDULA = scanner.nextInt();
                                                        System.out.println("\nIngrese el numero de telefono");
                                                        int TELEFONO = scanner.nextInt();
                                                        System.out.println("Ingrese el tipo de gestor: \"Gestor\", \"administrador\" o \"Contacto");
                                                        String tipoGestor = scanner.next();
                                                        System.out.println("\nIngrese el estado del Gestor. Activo/Inactivo");
                                                        scanner.nextLine();
                                                        String estado = scanner.nextLine();
                                                        estado = estado.toLowerCase();
                                                        if (estado.equals("ACTIVO"))
                                                        {
                                                            estado_b = true;
                                                        } else
                                                        {
                                                            estado_b = false;
                                                        }

                                                        Gestor gestor = new Gestor(tipoGestor, estado_b, NOMBRE, CEDULA, TELEFONO);

                                                        ListaG.ingresar(gestor);
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 2:// METODO ELIMINAR
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        //Eliminar   
                                                        System.out.println("Ingrese la cedula del gestor que desea eliminar");

                                                        int CEDULA = scanner.nextInt();
                                                        ListaG.elimininar(CEDULA);
                                                        System.out.println("\nGESTOR ELIMINADO\n");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 3:// METODO MODIFICAR
                                                    System.out.println("------------------------");
                                                    //Modificar gestor
                                                    try
                                                    {
                                                        System.out.println("Ingrese la cédula del gestor a buscar:");
                                                        cedula = scanner.nextInt();
                                                        System.out.println("Ingrese la nueva cedula del gestor:");
                                                        int nuevoCedula = scanner.nextInt();
                                                        scanner.nextLine();
                                                        System.out.println("Ingrese el nuevo estado del gestor (Activo/Inactivo):");
                                                        String nuevoEstado = scanner.nextLine();
                                                        nuevoEstado = nuevoEstado.toLowerCase();
                                                        if (nuevoEstado.equals("ACTIVO"))
                                                        {
                                                            estado_b = true;
                                                        } else
                                                        {
                                                            estado_b = false;
                                                        }
                                                        System.out.println("Ingrese el nuevo telefono del gestor:");
                                                        int nuevoTelefono = scanner.nextInt();
                                                        scanner.nextLine();
                                                        System.out.println("Ingrese el nuevo tipo de gestor:");
                                                        String nuevoTipoGestor = scanner.nextLine();
                                                        ListaG.buscarYmodificar(cedula, nuevoCedula, nuevoTelefono, nuevoTipoGestor, estado_b);
                                                    } catch (Exception e)
                                                    {
                                                        System.out.println("Error en ingresar el dato.");
                                                    }
                                                    System.out.println("------------------------");

                                                    break;
                                                case 4:// METODO BUSCAR
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese la cedula del gestor que quiera buscar");
                                                        int CEDULA = scanner.nextInt();
                                                        ListaG.buscar(CEDULA);
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 5:// VER LISTA
                                                    System.out.println("------------------------");
                                                    System.out.println("Ver lista de Gestor");
                                                    ListaG.mostrarDoble();
                                                    System.out.println("");
                                                    System.out.println("------------------------");
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu
                                                != 0);

                                        break;
                                    case 4:
                                        // Crear servicio
                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("*****************************************");
                                                System.out.println("**********Menu Crear Servicio************");
                                                System.out.println("*****************************************");
                                                System.out.println("1.   Crear servicio con mayor prioridad |");
                                                System.out.println("-----------------------------------------");
                                                System.out.println("2.   Crear servicio con menor prioridad |");
                                                System.out.println("-----------------------------------------");
                                                System.out.println("3.         Eliminar Servicio            |");
                                                System.out.println("-----------------------------------------");
                                                System.out.println("4.         Mostrar  Servicios           |");
                                                System.out.println("-----------------------------------------");
                                                System.out.println("5.   Mostrar Arbol de eliminacion       |");
                                                System.out.println("-----------------------------------------");
                                                System.out.println("-                                       -");
                                                System.out.println("-----------------------------------------");
                                                System.out.println("0.               Volver                 |");
                                                System.out.println("-----------------------------------------");
                                                System.out.println("Seleccione una opción:");
                                                System.out.println(": ");
                                            }
                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:// METODO mayor prioridad
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("1.   Crear servicio con mayor prioridad ");
                                                        System.out.println("\nCedula del cliente para crear servicio: ");
                                                        int cedulaNueva = scanner.nextInt();
                                                        int test2 = Lista.buscar_2(cedulaNueva);
                                                        Cliente cliente2 = new Cliente("", cedula, test2, "", estado_b, "");

                                                        System.out.println(cliente2.getNombreCompleto());
                                                        // if si
                                                        if (test2 == 1)
                                                        {

                                                            System.out.println("Cliente encontrado, continuar:\n ");

                                                            System.out.println("-----------------------------------");
                                                            ListaS.ingresarAntes(cedulaNueva);
                                                        } else
                                                        {
                                                            System.out.println("El cliente no se encontró");
                                                        }
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());
                                                }
                                                break;
                                                case 2:// METODO menor prioridad
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("1.   Crear servicio con menor prioridad ");
                                                        System.out.println("\nCedula del cliente para crear servicio: ");
                                                        int cedulaNueva2 = scanner.nextInt();
                                                        int test = Lista.buscar_2(cedulaNueva2);
                                                        // if si
                                                        if (test == 1)
                                                        {
                                                            System.out.println("Cliente encontrado, continuar:\n ");
                                                            System.out.println("-----------------------------------");
                                                            ListaS.ingresarDespues(cedulaNueva2);
                                                        } else
                                                        {
                                                            System.out.println("El cliente no se encontró");
                                                        }
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());
                                                }
                                                break;
                                                case 3:// METODO Eliminar
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("   Eliminar Servicio  \n ");
                                                        System.out.println("Escriba el ID del servicio que quiere eliminar:");
                                                        int pIdServicio = scanner.nextInt();

                                                        ListaS.eliminar(pIdServicio, arbol);
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;

                                                case 4:// METODO mostrar
                                                    System.out.println("------------------------");
                                                    System.out.println("Mostrar Servicios");
                                                    {
                                                        Cliente cliente = new Cliente("", 0, 0, "", estado_b, "");
                                                        ListaS.mostrarLista(cliente);
                                                    }
                                                    System.out.println("------------------------");
                                                    break;

                                                case 5:
                                                    System.out.println("\n Justificaciones de Eliminacion:\n");

                                                    arbol.imprimirPre();

                                                    System.out.println("\n Los niveles son: ( " + arbol.retornarAltura() + " )");

                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu
                                                != 0);

                                        break;

                                    case 5:

                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("******************************");
                                                System.out.println("*********  Menu GUIA    ******");
                                                System.out.println("******************************");
                                                System.out.println("1.    Ingresar Guia          |");
                                                System.out.println("------------------------------");
                                                System.out.println("2.    Eliminar Guia          |");
                                                System.out.println("------------------------------");
                                                System.out.println("3.    Modificar Guia         |");
                                                System.out.println("------------------------------");
                                                System.out.println("4.    Buscar Guia            |");
                                                System.out.println("------------------------------");
                                                System.out.println("5.    Lista Guia             |");
                                                System.out.println("------------------------------");
                                                System.out.println("6.    Tamaño Guia            |");
                                                System.out.println("------------------------------");
                                                System.out.println("7.    Solicitar posicion     |");
                                                System.out.println("------------------------------");
                                                System.out.println("8.    DESACTIVAR servicio    |");
                                                System.out.println("------------------------------");
                                                System.out.println("9.    ACTIVAR servicio       |");
                                                System.out.println("------------------------------");
                                                System.out.println("10.   Limpiar Pila           |");
                                                System.out.println("------------------------------");
                                                System.out.println("-                            -");
                                                System.out.println("------------------------------");
                                                System.out.println("0.       Volver              |");
                                                System.out.println("------------------------------");
                                                System.out.println("Seleccione una opción:");
                                                System.out.println(": ");
                                            }
                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:
                                                try
                                                    {
                                                        System.out.println("-----------------------------------------------------------");
                                                        System.out.println("Ingrese el ID de la Guia: ");

                                                        int idGuia = scanner.nextInt();
                                                        scanner.nextLine();
                                                        System.out.println("Ingrese el estado: ");
                                                        String estado = scanner.nextLine();

                                                        // scanner.nextLine();
                                                        Guia guia = new Guia(idGuia, estado);
                                                        pilaG.push(guia);
                                                        System.out.println("");
                                                        System.out.println("GUIA CREADA");
                                                        System.out.println("");
                                                        System.out.println("------------------------------------------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 2:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        Guia eliminada = pilaG.pop();
                                                        if (eliminada != null)
                                                        {
                                                            System.out.println("Guia eliminada: " + eliminada.toString());
                                                        }
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 3:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Modificar Guia ");
                                                        Guia guia = new Guia(0, "");
                                                        pilaG.modificar(guia);
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 4:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese el numero de GUIA que desea buscar");
                                                        int idGuia = scanner.nextInt();
                                                        pilaG.Buscar(idGuia);
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 5:
                                                    System.out.println("------------------------");
                                                    System.out.println("Contenido de Guia: ");
                                                    System.out.println("");
                                                    pilaG.mostrarPila();
                                                    System.out.println("");
                                                    System.out.println("------------------------");

                                                    break;
                                                case 6:
                                                    int tamano = pilaG.tamaño();
                                                    System.out.println("--------------------------------------\n");
                                                    System.out.println("El tamaño de la pila es de : " + tamano);
                                                    System.out.println("--------------------------------------\n");
                                                    System.out.println("");
                                                    break;
                                                case 7:
                                                    System.out.println("Ingresar numero de posicion: ");
                                                    int numeroGuia = scanner.nextInt();

                                                    int posicion = pilaG.buscarGuia(numeroGuia);

                                                    if (posicion == -1)
                                                    {
                                                        System.out.println("La guía no está en la pila.");
                                                    } else
                                                    {
                                                        System.out.println("--------------------------------------------------------------\n");
                                                        System.out.println("La guia esta en la posicion = ! " + posicion + " ! = de la pila.\n");
                                                        System.out.println("--------------------------------------------------------------\n");
                                                    }
                                                    break;
                                                case 8:
                                                    pilaG.desactivarServicio();
                                                    break;
                                                case 9:
                                                    pilaG.activarServicio();
                                                    break;
                                                case 10:
                                                    pilaG.limpiarPila(pilaG.tamano());/* Introduciendo "tamano" como
                                                                                         parametro, me deja la pila vacia.*/
                                                    System.out.println("----------");
                                                    System.out.println("Pila Vacia");
                                                    System.out.println("----------");
                                                    break;

                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu != 0);
                                        break;

                                    case 6:

                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("******************************");
                                                System.out.println("****  Menu Justificacion *****");
                                                System.out.println("******************************");
                                                System.out.println("1.    Ingresar Justificacion |");
                                                System.out.println("------------------------------");
                                                System.out.println("2.    Eliminar Justificacion |");
                                                System.out.println("------------------------------");
                                                System.out.println("3.    Modificar Justificacion|");
                                                System.out.println("------------------------------");
                                                System.out.println("4.    Buscar Justificacion   |");
                                                System.out.println("------------------------------");
                                                System.out.println("5.    Lista Justificacion    |");
                                                System.out.println("------------------------------");
                                                System.out.println("6.    Tamaño de Justificacion|");
                                                System.out.println("------------------------------");
                                                System.out.println("7.    Limpiar pila            ");
                                                System.out.println("------------------------------");
                                                System.out.println("-                            -");
                                                System.out.println("------------------------------");
                                                System.out.println("0.          Volver           |");
                                                System.out.println("------------------------------");
                                                System.out.println("Seleccione una opción:");
                                                System.out.println(": ");
                                            }
                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:
                                                try
                                                    {
                                                        // Buscar el ID de la guia en la pilaGuia
                                                        System.out.println("Ingrese el ID de la Guia a justificar:");
                                                        int idGuiaBuscada = scanner.nextInt();
                                                        scanner.nextLine();

                                                        int posicionGuia = pilaG.Buscar(idGuiaBuscada);

                                                        // Si se encontró la guia, pedir los datos para la justificación
                                                        if (posicionGuia != -1)
                                                        {

                                                            System.out.println("Ingrese el ID de la Justificacion:");
                                                            int idJustificacion = scanner.nextInt();
                                                            scanner.nextLine();

                                                            System.out.println("Ingrese las observaciones:");
                                                            String observaciones = scanner.nextLine();

                                                            // Crear una instancia de Justificacion y agregarla a la pilaJustificacion
                                                            Justificacion justificacion = new Justificacion(idJustificacion, observaciones, idGuiaBuscada);
                                                            pila.push(justificacion);

                                                            System.out.println("La justificación ha sido agregada exitosamente a la pila.\n");

                                                        } else
                                                        {
                                                            System.out.println("La guia con ID " + idGuiaBuscada + " no se encuentra en la pila.");
                                                        }
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }

                                                break;
                                                case 2:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        Justificacion eliminada = pila.pop();
                                                        if (eliminada != null)
                                                        {
                                                            System.out.println("Justificacion eliminada: " + eliminada.toString());
                                                        }
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 3:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Modificar justificacion ");
                                                        Justificacion pila2 = new Justificacion(0);
                                                        pila.modificar(pila2);
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 4:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese el IdJustificaciones que desea buscar: ");
                                                        int IdGuia = scanner.nextInt();
                                                        Justificacion[] justificacionEncontrada = pila.buscar2(IdGuia);
                                                        if (justificacionEncontrada == null)
                                                        {
                                                            System.out.println("No se encontraron justificaciones para el IdGuia ingresado.\n");
                                                            System.out.println("-------------------------------------------------------------");
                                                        } else
                                                        {
                                                            System.out.println("Justificaciones encontradas:\n");
                                                            System.out.println("----------------------------");
                                                            for (Justificacion j : justificacionEncontrada)
                                                            {
                                                                System.out.println(j);
                                                            }
                                                        }

                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 5:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Contenido de justificacion: ");
                                                        System.out.println("");
                                                        pila.mostrarPila();
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 6:
                                                try
                                                    {
                                                        int tamano = pila.tamaño();
                                                        System.out.println("El tamaño de la pila es de :( " + tamano + " )\n");
                                                        System.out.println("----------------------------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 7:
                                                    try{
                                                    pila.limpiarPila(cedula);
                                                    System.out.println("Pila Vacia");
                                                    }catch(Exception e){
                                                        System.out.println("Error");
                                                        
                                                    }
                                                    break;

                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu != 0);
                                        break;

                                    case 7:
                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("******************************");
                                                System.out.println("****  Menu Control de Ruta ***");
                                                System.out.println("******************************");
                                                System.out.println("1.    Ingresar Ruta          |");
                                                System.out.println("------------------------------");
                                                System.out.println("2.    Eliminar Ruta          |");
                                                System.out.println("------------------------------");
                                                System.out.println("3.    Modificar Ruta         |");
                                                System.out.println("------------------------------");
                                                System.out.println("4.    Buscar Ruta por ID     |");
                                                System.out.println("------------------------------");
                                                System.out.println("5.    Lista Ruta             |");
                                                System.out.println("------------------------------");
                                                System.out.println("6.                           |");
                                                System.out.println("------------------------------");
                                                System.out.println("0.          Volver           |");
                                                System.out.println("------------------------------");
                                                System.out.println("Seleccione una opción:");
                                                System.out.println(": ");
                                            }
                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese el id de la ruta:");
                                                        int id = scanner.nextInt();
                                                        scanner.nextLine(); // Limpia el cambio de int a string

                                                        System.out.println("Ingrese el distrito de la ruta:");
                                                        String distrito = scanner.nextLine();

                                                        System.out.println("Ingrese el cantón de la ruta:");
                                                        String canton = scanner.nextLine();

                                                        System.out.println("Ingrese la provincia de la ruta:");
                                                        String provincia = scanner.nextLine();

                                                        System.out.println("Ingrese la dirección de la ruta:");
                                                        String direccion = scanner.nextLine();

                                                        ControlRuta ruta = new ControlRuta(id, distrito, canton, provincia, direccion);
                                                        listaRuta.ingresarFinal(ruta);
                                                        System.out.println("------------------------");
                                                        System.out.println("RUTA CREADA CON EXITO");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 2:
                                                try
                                                    {
                                                        System.out.println("------------------------------------");
                                                        System.out.println("Ingrese el numero de ID para eliminar");
                                                        int Id = scanner.nextInt();
                                                        listaRuta.eliminar(Id);
                                                        System.out.println("------------------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 3:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese el id de la ruta a modificar:");
                                                        int id = scanner.nextInt();
                                                        scanner.nextLine(); // Limpia el cambio de int a string

                                                        System.out.println("Ingrese el nuevo distrito de la ruta:");
                                                        String distrito = scanner.nextLine();

                                                        System.out.println("Ingrese el nuevo cantón de la ruta:");
                                                        String canton = scanner.nextLine();

                                                        System.out.println("Ingrese la nueva provincia de la ruta:");
                                                        String provincia = scanner.nextLine();

                                                        System.out.println("Ingrese la nueva dirección de la ruta:");
                                                        String direccion = scanner.nextLine();

                                                        listaRuta.modificarRuta(id, distrito, canton, provincia, direccion);
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 4:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Introduce el Id de la ruta");
                                                        int Id = scanner.nextInt();
                                                        listaRuta.buscar(Id);
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 5:
                                                    System.out.println("------------------------");
                                                    listaRuta.mostrarLista();
                                                    System.out.println("------------------------");

                                                    break;
                                                case 6:

                                                    break;

                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu != 0);

                                        break;

                                    case 8:
                                        do
                                        {
                                            if (!mostrarMenuAnterior)
                                            {
                                                System.out.println("******************************");
                                                System.out.println("****  Menu Control de Ruta ***");
                                                System.out.println("******************************");
                                                System.out.println("1.    Ingresar Producto      |");
                                                System.out.println("------------------------------");
                                                System.out.println("2.    Eliminar Producto      |");
                                                System.out.println("------------------------------");
                                                System.out.println("3.    Modificar Producto     |");
                                                System.out.println("------------------------------");
                                                System.out.println("4.    Buscar Producto por ID |");
                                                System.out.println("------------------------------");
                                                System.out.println("5.    Lista Producto         |");
                                                System.out.println("------------------------------");
                                                System.out.println("                             |");
                                                System.out.println("------------------------------");
                                                System.out.println("0.          Volver           |");
                                                System.out.println("------------------------------");
                                                System.out.print("    Seleccione una opción:");

                                            }
                                            opcionSubMenu = scanner.nextInt();

                                            switch (opcionSubMenu)
                                            {
                                                case 1:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Ingrese el id del PRODUCTO: ");
                                                        int id = scanner.nextInt();

                                                        System.out.println("Ingrese el monto del PRODUCTO:");
                                                        double monto = scanner.nextInt();
                                                        scanner.nextLine(); // Limpia el cambio de int a string

                                                        System.out.println("Ingrese las observaciones del PRODUCTO:");
                                                        String observaciones = scanner.nextLine();

                                                        System.out.println("Ingrese el estado del PRODUCTO:");
                                                        String estado = scanner.nextLine();

                                                        TipoProducto producto = new TipoProducto(id, monto, observaciones, estado);
                                                        listaPro.ingresarFinal(producto);
                                                        System.out.println("------------------------");
                                                        System.out.println("PRODUCTO CREADO CON EXITO");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 2:
                                                try
                                                    {
                                                        System.out.println("------------------------------------");
                                                        System.out.println("Ingrese el numero de ID para eliminar");
                                                        int Id = scanner.nextInt();
                                                        listaPro.eliminar(Id);
                                                        System.out.println("------------------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 3:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.print("Ingrese el id del PRODUCTO a modificar:");
                                                        int id = scanner.nextInt();

                                                        System.out.print("Ingrese el nuevo monto:");
                                                        int monto = scanner.nextInt();
                                                        scanner.nextLine(); // Limpia el cambio de int a string

                                                        System.out.print("Ingrese la nueva observacion: ");
                                                        String observaciones = scanner.nextLine();

                                                        System.out.print("Ingrese el nuevo estado: ");
                                                        String estado = scanner.nextLine();

                                                        listaPro.modificarProducto(id, monto, observaciones, estado);
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 4:
                                                try
                                                    {
                                                        System.out.println("------------------------");
                                                        System.out.println("Introduce el Id del PRODUCTO");
                                                        int Id = scanner.nextInt();
                                                        listaPro.buscar(Id);
                                                        System.out.println("------------------------");
                                                } catch (Exception e)
                                                {
                                                    System.out.println("Ha ocurrido un error: " + e.getMessage());

                                                }
                                                break;
                                                case 5:
                                                    System.out.println("------------------------");
                                                    listaPro.mostrarLista();
                                                    System.out.println("------------------------");

                                                    break;
                                                case 6:

                                                    break;

                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opción inválida");
                                            }
                                        } while (opcionSubMenu != 0);

                                        //Mantenimiento de Productos
                                        break;
                                    default:
                                        System.out.println("Opcion invalida. Intente de nuevo.\n");
                                        break;
                                }
                            } while (opcionSubMenu2 != 0);

                        }

                        break;

                    case 0:
                        System.out.println("GRACIAS POR UTILIZAR EL SERVICIO");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }

            } while (opcionPrincipal != 0);

        } catch (Exception e)
        {
            System.out.println("Ha ocurrido un error: " + e.getMessage());

        }

    }
}
