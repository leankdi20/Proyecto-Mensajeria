package Mensajero;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensajero extends Persona implements interfacePersona {
    //Variables

    private int codigo;
    private String nacionalidad;

    private boolean estado; //Activo o Inactivo

    //Constructores
    public Mensajero(int codigo, String nacionalidad, boolean estado, String NOMBRE, int CEDULA, int TELEFONO) {
        super(NOMBRE, CEDULA, TELEFONO);
        this.codigo = codigo;
        this.nacionalidad = nacionalidad;

        this.estado = estado;
    }

    //Gett and Sett
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public boolean setEstado(boolean estado) {
        this.estado = estado;
        System.out.println("Su estado es: " + estado);
        return estado;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        super.ingresarDatos();

        System.out.println("Ingrese el codigo del mensajero");
        this.codigo = scanner.nextInt();
        System.out.println("Ingrese la nacionalidad");
        this.nacionalidad = scanner.next();
        System.out.println("Ingrese el telefono");
        // this.telefono = scanner.nextInt();
        System.out.println("Su estado es: " + estado);
        this.estado = scanner.nextBoolean();

        //this.estado = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "\nNombre completo: " + getNombreCompleto()
                + "\n__________________________________________________\n"
                + "\nCedula:  " + getCedula()
                + "\n__________________________________________________\n"
                + "\nTelefono: " + getTelefono()
                + "\n__________________________________________________\n"
                + "\nCodigo: " + codigo
                + "\n__________________________________________________\n"
                + "\nNacionalidad: " + nacionalidad
                + "\n__________________________________________________\n"
                + "\nEstado: " + estado
                + "\n__________________________________________________\n"
                + "\n__________________________________________________\n"
                + "\n__________________________________________________\n";
    }

}
