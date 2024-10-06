package pe.edu.utp.DAO;

import pe.edu.utp.model.Pago;

public interface PagoDAO {
    void registrarPago(Pago pago); // REQMS-018
    void ingresarMetodoPago(Pago pago); // REQMS-020
    void generarReciboPago(Pago pago); // REQMS-021
    void registrarPagoInicial(Pago pago); // REQMS-015

}
