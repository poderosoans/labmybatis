package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Producto;

public interface ProductoRepositorio {

    Producto buscar(Long id);

    //solo para pruebas
    List<Producto> obtenerTodos();

    List<Producto> obtenerPorCategoria(Long idCategoria);

    List<Producto> obtenerPorCategoriaCriteriaApi(Long idCategoria);
}
