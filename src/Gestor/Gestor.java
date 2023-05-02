package Gestor;

import java.util.Scanner;

/**
 *
 * @author solis
 */
public class Gestor extends Persona implements interfacePersona {

    Persona persona = new Persona("", 0, 0);
    private String tipoGestor; // puede ser "Gestor", "administrador" o "Contacto"
    private boolean estado; // puede ser "Activo" o "Inactivo"

    //CONSTRUCTORES
    public Gestor(String NOMBRE, int CEDULA, int TELEFONO, String tipoGestor, boolean estado) {
        super(NOMBRE, CEDULA, TELEFONO);

        this.tipoGestor = tipoGestor;
        this.estado = true;
    }

    public Gestor(String tipoGestor, boolean estado, String NOMBRE, int CEDULA, int TELEFONO) {
        super(NOMBRE, CEDULA, TELEFONO);
        this.tipoGestor = tipoGestor;
        this.estado = estado;
    }

    // getters y setters
    public String getTipoGestor() {
        return tipoGestor;
    }

    public void setTipoGestor(String tipoGestor) {
        this.tipoGestor = tipoGestor;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void ingresarDatos() {
        super.ingresarDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el tipo de gestor: \"Gestor\", \"administrador\" o \"Contacto");
        tipoGestor = scanner.next();
        System.out.println("Digite el estado del gestor, Activo/Inactivo");
        // estado = scanner.nextLine();

    }

    public String toString() {
        return "\n__________________________________________________\n"
                + "\nNombre completo: " + getNombreCompleto()
                + "\n__________________________________________________\n"
                + "\nCedula:  " + getCedula()
                + "\n__________________________________________________\n"
                + "\nTelefono: " + getTelefono()
                + "\n__________________________________________________\n"
                + "\nTipo gestor: " + tipoGestor
                + "\n__________________________________________________\n"
                + "\nEstado: " + estado
                + "\n__________________________________________________\n"
                + "\n__________________________________________________\n"
                + "\n__________________________________________________\n";
    }
}
