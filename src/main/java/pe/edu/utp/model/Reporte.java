package pe.edu.utp.model;

public class Reporte {
    private int idReporte;
    private double montoTotal;
    private String fechaGeneracion;
    private int idCliente;

    public Reporte(int idReporte, double montoTotal, String fechaGeneracion, int idCliente) {
        this.idReporte = idReporte;
        this.montoTotal = montoTotal;
        this.fechaGeneracion = fechaGeneracion;
        this.idCliente = idCliente;
    }

    public Reporte() {
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "idReporte=" + idReporte +
                ", montoTotal=" + montoTotal +
                ", fechaGeneracion='" + fechaGeneracion + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
