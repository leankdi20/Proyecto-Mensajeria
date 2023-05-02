
package Gestor;

import java.util.Scanner;



public  class Persona {
    private String nombreCompleto;
    private int cedula;
    private int telefono;
    
    public Persona (String NOMBRE, int CEDULA, int TELEFONO){
        this.nombreCompleto = NOMBRE;
        this.cedula = CEDULA;
        this.telefono = TELEFONO;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
   public void ingresarDatos(){
       Scanner scanner = new Scanner (System.in);
       System.out.println("Ingrese el nombre completo: ");
        nombreCompleto = scanner.nextLine();
       
       System.out.println("Ingrese la cedula: ");
       cedula = scanner.nextInt();
      
       System.out.println("Ingrese el telefono: ");
       telefono = scanner.nextInt();
   }
    
   
   
    
   
    
}
