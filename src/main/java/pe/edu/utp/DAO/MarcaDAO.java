package pe.edu.utp.DAO;

import pe.edu.utp.model.Marca;
import java.util.List;

public interface MarcaDAO {
    void agregarMarca(Marca marca); // REQMS-001
    List<Marca> obtenerMarcas(); // REQMS-001
    void actualizarMarca(Marca marca); // REQMS-001
    void eliminarMarca(int idMarca);
}
