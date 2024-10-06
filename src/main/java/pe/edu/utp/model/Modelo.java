package pe.edu.utp.model;

public class Modelo {

    private int idModelo;
    private String nombreModelo;
    private int idMarca;

    public Modelo(int idModelo, String nombreModelo, int idMarca) {
        this.idModelo = idModelo;
        this.nombreModelo = nombreModelo;
        this.idMarca = idMarca;
    }

    public Modelo() {
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "idModelo=" + idModelo +
                ", nombreModelo='" + nombreModelo + '\'' +
                ", idMarca=" + idMarca +
                '}';
    }
}
