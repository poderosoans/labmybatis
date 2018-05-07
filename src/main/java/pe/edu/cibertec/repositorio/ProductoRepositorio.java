package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;

public interface ProductoRepositorio {

    Producto buscar(Long id);
    void crear (Producto producto);
    void actualizar(Producto producto);
    void eliminar(Producto producto);

    //solo para pruebas
    List<Producto> obtenerTodos();

    List<Producto> obtenerPorCategoria(Long idCategoria);
    
    //Integer crear(Producto producto);
    
    List<Producto> obtenerProductosTop (BusquedaProductoTop busquedaProductoTop);
    
    //List<Producto> procedureProductoTop (BusquedaProductoTop busquedaProductoTop);

}
