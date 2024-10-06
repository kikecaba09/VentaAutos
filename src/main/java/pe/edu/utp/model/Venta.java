package pe.edu.utp.model;

public class Venta {

    private int idVenta;
    private String fecha;
    private double montoInicial;
    private double montoTotal;
    private int idAuto;
    private int idCliente;

    public Venta(int idVenta, String fecha, double montoInicial, double montoTotal,
                 int idAuto, int idCliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.montoInicial = montoInicial;
        this.montoTotal = montoTotal;
        this.idAuto = idAuto;
        this.idCliente = idCliente;
    }

    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", fecha='" + fecha + '\'' +
                ", montoInicial=" + montoInicial +
                ", montoTotal=" + montoTotal +
                ", idAuto=" + idAuto +
                ", idCliente=" + idCliente +
                '}';
    }
}
