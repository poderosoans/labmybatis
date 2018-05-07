package pe.edu.cibertec.dominio.base;

import java.io.Serializable;
import java.util.Date;

public abstract class EntidadBase implements Serializable {

    protected Long id;
    protected Date fechaReg;
    protected Date fechaMod;
    protected Integer estado;

    public Date getFecha_reg() {
        return fechaReg;
    }

    public void setFecha_reg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Date getFecha_mod() {
        return fechaMod;
    }

    public void setFecha_mod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
