package pe.edu.utp.model;

public class Auto {

    private int idAuto;
    private String color;
    private double precio;
    private int añoFabricacion;
    private boolean disponible;
    private String placa;
    private int idModelo;

    public Auto(int idAuto, String color, double precio, int añoFabricacion,
                boolean disponible, String placa, int idModelo) {
        this.idAuto = idAuto;
        this.color = color;
        this.precio = precio;
        this.añoFabricacion = añoFabricacion;
        this.disponible = disponible;
        this.placa = placa;
        this.idModelo = idModelo;
    }

    public Auto() {
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "idAuto=" + idAuto +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", añoFabricacion=" + añoFabricacion +
                ", disponible=" + disponible +
                ", placa='" + placa + '\'' +
                ", idModelo=" + idModelo +
                '}';
    }
}
