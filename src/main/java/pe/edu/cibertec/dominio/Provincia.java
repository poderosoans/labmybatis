
package pe.edu.cibertec.dominio;


import pe.edu.cibertec.dominio.base.EntidadBase;


public class Provincia extends EntidadBase{
    private String descripcion;
    private Departamento departamento;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
     
}
