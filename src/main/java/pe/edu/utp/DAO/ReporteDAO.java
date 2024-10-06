package pe.edu.utp.DAO;

import pe.edu.utp.model.Cliente;
import pe.edu.utp.model.Reporte;
import java.util.List;

public interface ReporteDAO {
    List<Cliente> generarListadoClientesConDeuda(); // REQMS-022
    Reporte generarReporteDetalladoDeuda(); // REQMS-023
    void exportarReporteDeuda(); // REQMS-024
    List<Cliente> generarListadoClientesMorosos(); // REQMS-025
    Reporte generarReporteDetalladoMora(); // REQMS-026
    void exportarReporteMora(); // REQMS-027
    void exportarInforme(); // REQMS-031
}
