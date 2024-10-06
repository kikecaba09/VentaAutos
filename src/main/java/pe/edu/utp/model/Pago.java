package pe.edu.utp.model;

public class Pago {

    private int idPago;
    private double monto;
    private String metodoPago; // Efectivo, tarjeta, etc.
    private boolean pagado;
    private int idVenta; // Relación con Venta
    private String reciboGenerado;

    public Pago(int idPago, double monto, String metodoPago, boolean pagado, int idVenta, String reciboGenerado) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.pagado = pagado;
        this.idVenta = idVenta;
        this.reciboGenerado = reciboGenerado;
    }

    public Pago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getReciboGenerado() {
        return reciboGenerado;
    }

    public void setReciboGenerado(String reciboGenerado) {
        this.reciboGenerado = reciboGenerado;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "idPago=" + idPago +
                ", monto=" + monto +
                ", metodoPago='" + metodoPago + '\'' +
                ", pagado=" + pagado +
                ", idVenta=" + idVenta +
                ", reciboGenerado='" + reciboGenerado + '\'' +
                '}';
    }
}
