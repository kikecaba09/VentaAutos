package pe.edu.utp.DAO;

import pe.edu.utp.model.Modelo;
import java.util.List;

public interface ModeloDAO {
    void agregarModelo(Modelo modelo); // REQMS-002
    List<Modelo> obtenerModelosPorMarca(int idMarca); // REQMS-002
    void actualizarModelo(Modelo modelo); // REQMS-002
    void eliminarModelo(int idModelo); // REQMS-002
}
