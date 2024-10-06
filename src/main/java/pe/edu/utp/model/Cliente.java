package pe.edu.utp.model;

public class Cliente {

    private int idCliente;
    private String nombreCompleto;
    private String dni;
    private String email;
    private String telefono;
    private String direccion;
    private String codigoCliente; // Generado
    private double limiteCredito;
    private double deudaActual;
    private boolean moroso;

    public Cliente(int idCliente, String nombreCompleto, String dni, String email,
                   String telefono, String direccion, String codigoCliente,
                   double limiteCredito, double deudaActual, boolean moroso) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoCliente = codigoCliente;
        this.limiteCredito = limiteCredito;
        this.deudaActual = deudaActual;
        this.moroso = moroso;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getDeudaActual() {
        return deudaActual;
    }

    public void setDeudaActual(double deudaActual) {
        this.deudaActual = deudaActual;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoCliente='" + codigoCliente + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", deudaActual=" + deudaActual +
                ", moroso=" + moroso +
                '}';
    }
}
