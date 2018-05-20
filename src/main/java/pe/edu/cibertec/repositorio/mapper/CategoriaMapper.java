
package pe.edu.cibertec.repositorio.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import pe.edu.cibertec.dominio.Categoria;

public interface CategoriaMapper {
    // @Results{}
    
    @Select("SELECT id, nombre FROM categoria")
    List<Categoria> obtenerTodos();
}
