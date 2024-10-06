package pe.edu.utp.DAO;

import pe.edu.utp.model.Cliente;
import java.util.List;

public interface ClienteDAO {
    void registrarCliente(Cliente cliente); // REQMS-006
    void actualizarCliente(Cliente cliente); // REQMS-007
    String generarCodigoCliente(); // REQMS-008
    boolean validarDatosCliente(Cliente cliente); // REQMS-009
    void evaluarLineaCredito(int idCliente); // REQMS-010
    double calcularLimiteCredito(int idCliente); // REQMS-011
    void actualizarLimiteCredito(int idCliente, double nuevoLimite); // REQMS-012
}
