package Producto;

public class TipoProducto {

    //Variable
    private int idTipoProducto;
    private double monto;
    private String observaciones;
    private String estado;

    //Constructor
    public TipoProducto(int idTipoProducto, double monto, String observaciones, String estado) {
        this.idTipoProducto = idTipoProducto;
        this.monto = monto;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    //Getters and Setters
    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoProducto\n"
                +"_________________________________________\n"
                + "idTipoProducto= " + idTipoProducto + "\n"
                + "________________________________________\n"
                + "monto= " + monto + "\n"
                + "_________________________________________\n"
                + "observaciones = " + observaciones + "\n"
                + "_________________________________________\n"
                + "Estado= " + estado + "\n"
                + "_________________________________________\n";
    }

}
