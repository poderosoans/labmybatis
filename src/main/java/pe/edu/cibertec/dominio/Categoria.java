package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.base.EntidadBase;

public class Categoria extends EntidadBase {

    private String nombre;
    private String imagen;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return String.format("{ \"id\": %d, \"nombre\": \"%s\"}", getId(), getNombre());
    }
}
