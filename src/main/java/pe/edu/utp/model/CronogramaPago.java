package pe.edu.utp.model;

public class CronogramaPago {
    private int idCronograma;
    private double monto;
    private String fechaVencimiento;
    private boolean pagado;
    private int idVenta;

    public CronogramaPago(int idCronograma, double monto, String fechaVencimiento, boolean pagado, int idVenta) {
        this.idCronograma = idCronograma;
        this.monto = monto;
        this.fechaVencimiento = fechaVencimiento;
        this.pagado = pagado;
        this.idVenta = idVenta;
    }

    public CronogramaPago() {
    }

    public int getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(int idCronograma) {
        this.idCronograma = idCronograma;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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

    @Override
    public String toString() {
        return "CronogramaPago{" +
                "idCronograma=" + idCronograma +
                ", monto=" + monto +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", pagado=" + pagado +
                ", idVenta=" + idVenta +
                '}';
    }
}
