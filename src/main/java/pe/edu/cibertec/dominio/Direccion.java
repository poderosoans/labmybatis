
package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.base.EntidadBase;


public class Direccion extends EntidadBase{

    private Usuario usuario; 
    private TipoDireccion tipoDireccion;
    private Distrito distrito;
    private String direccion;
    private String lote;
    private String departamento;
    private String utbanizacion;
    private String referencia;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getUtbanizacion() {
        return utbanizacion;
    }

    public void setUtbanizacion(String utbanizacion) {
        this.utbanizacion = utbanizacion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
}
