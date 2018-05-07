
package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.base.EntidadBase;

public class Departamento extends EntidadBase{
    
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
