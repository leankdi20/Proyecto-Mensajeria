package Rutas;

public class ControlRuta {

    //Variables
    private int idRuta;
    private String DistritoRuta;
    private String CantonRuta;
    private String ProvinciaRuta;
    private String DireccionRuta;

    //Constructores
    public ControlRuta(int idRuta, String DistritoRuta, String CantonRuta, String ProvinciaRuta,
            String DireccionRuta) {
        this.idRuta = idRuta;
        this.DistritoRuta = DistritoRuta;
        this.CantonRuta = CantonRuta;
        this.ProvinciaRuta = ProvinciaRuta;
        this.DireccionRuta = DireccionRuta;
    }

    //Gets and Sets
    public int getidRuta() {
        return idRuta;
    }

    public void setidRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getDistritoRuta() {
        return DistritoRuta;
    }

    public void setDistritoRuta(String DistritoRuta) {
        this.DistritoRuta = DistritoRuta;
    }

    public String getCantonRuta() {
        return CantonRuta;
    }

    public void setCantonRuta(String CantonRuta) {
        this.CantonRuta = CantonRuta;
    }

    public String getProvinciaRuta() {
        return ProvinciaRuta;
    }

    public void setProvinciaRuta(String ProvinciaRuta) {
        this.ProvinciaRuta = ProvinciaRuta;
    }

    public String getDireccionRuta() {
        return DireccionRuta;
    }

    public void setDireccionRuta(String DireccionRuta) {
        this.DireccionRuta = DireccionRuta;
    }

    @Override
    public String toString() {
        return "ControlRuta \n"
                + "------------------------------------------\n"
                + "\n1-idRuta =  " + idRuta + "\n"
                + "------------------------------------------\n"
                + "\n2-DistritoRuta =  " + DistritoRuta + "\n"
                + "------------------------------------------\n"
                + "\n3-CantonRuta =  " + CantonRuta + "\n"
                + "------------------------------------------\n"
                + "\n4-ProvinciaRuta =  " + ProvinciaRuta + "\n"
                + "------------------------------------------\n"
                + "\n5-DireccionRuta =  " + DireccionRuta + "\n"
                + "------------------------------------------\n"
                + "------------------------------------------\n"
                + "------------------------------------------\n";

    }

}
