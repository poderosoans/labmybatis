package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;

public interface ProductoRepositorio {

    Producto buscar(Long id);

    //solo para pruebas
    List<Producto> obtenerTodos();

    List<Producto> obtenerPorCategoria(Long idCategoria);
    
    Integer crear(Producto producto);
    
    List<Producto> obtenerProductosTop (BusquedaProductoTop busquedaProductoTop);
    
    //List<Producto> procedureProductoTop (BusquedaProductoTop busquedaProductoTop);

}
