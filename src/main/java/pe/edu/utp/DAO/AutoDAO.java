package pe.edu.utp.DAO;

import pe.edu.utp.model.Auto;
import java.util.List;

public interface AutoDAO {
    void registrarAuto(Auto auto); // REQMS-003
    List<Auto> verificarDisponibilidad(); // REQMS-004
    List<Auto> buscarAutosPorCaracteristicas(String color, double precio, int anioFabricacion); // REQMS-005
    void actualizarDisponibilidad(int idAuto, boolean disponibilidad); // REQMS-017
    double cotizarAuto(int idAuto); // REQMS-013
}
