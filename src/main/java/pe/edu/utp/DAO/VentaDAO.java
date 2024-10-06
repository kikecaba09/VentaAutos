package pe.edu.utp.DAO;

import pe.edu.utp.model.Venta;
import java.util.List;

public interface VentaDAO {
    void registrarVenta(Venta venta); // REQMS-014
    List<Venta> generarVentasPorMes(int mes, int año); // REQMS-028
    List<Venta> generarDetallesVentasPorMes(int mes, int año); // REQMS-029
    List<Venta> filtrarVentasPorAñoYMes(int año, int mes); // REQMS-030
    void generarContratoVenta(Venta venta); // REQMS-016
}
