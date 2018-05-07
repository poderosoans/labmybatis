
package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.base.EntidadBase;

public class Marca extends EntidadBase{
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
