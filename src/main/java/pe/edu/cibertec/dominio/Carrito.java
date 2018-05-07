package pe.edu.cibertec.dominio;

import java.math.BigDecimal;
import java.util.List;
import pe.edu.cibertec.dominio.base.EntidadBase;

public class Carrito extends EntidadBase {

    private BigDecimal total;
    private Integer activo;
    private List<DetalleCarrito> detalleCarritoList;
    private Usuario usuario;

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<DetalleCarrito> getDetalleCarritoList() {
        return detalleCarritoList;
    }

    public void setDetalleCarritoList(List<DetalleCarrito> detalleCarritoList) {
        this.detalleCarritoList = detalleCarritoList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
