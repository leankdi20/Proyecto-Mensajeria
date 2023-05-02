package Servicio;

import java.util.Date;
import java.util.List;

public class Servicio {
   
    private int idServicio;
    private Date fechaServicio;
    private String observaciones;
    private String instrucciones;
    private String cedulaCliente;//Del cliente que lo hace
    private int idTipoProducto;

    //Constructores
    public Servicio(int idServicio, Date fechaServicio, 
                    String observaciones, String instrucciones, String cedulaCliente, int idTipoProducto) {
        this.idServicio = idServicio;
        this.fechaServicio = fechaServicio;
        this.observaciones = observaciones;
        this.instrucciones = instrucciones;
        this.cedulaCliente = cedulaCliente;
        this.idTipoProducto = idTipoProducto;
             // Inicializar las pilas
    }
    
    //Gett and Sett
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }
    
    public List<Servicio> listarServicios() {
        // Lógica para obtener una lista de todos los servicios registrados en el sistema
        return null;
    }
    
     @Override
    public String toString() {
        return "Servicio [idServicio=" + idServicio + ", fechaServicio=" + fechaServicio + ", observaciones=" + observaciones
                + ", instrucciones=" + instrucciones + ", cedulaCliente=" + cedulaCliente + ", idTipoProducto=" + idTipoProducto + "]";
    }
   

}
