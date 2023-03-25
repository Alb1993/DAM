package entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase Dron que extiende de la Clase Autonoma y implementa la interfaz de
 * TesteableEntity
 */
@Entity
//@Table
public class Dron extends Autonoma implements interficies.TesteableEntity, Serializable {

    private Date fechaProximoMantimiento;
    private boolean tieneArmas;
    private String tipoDeDron;

    public Dron(Date fechaProximoMantimiento, boolean tieneArmas, String tipoDeDron, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        super(nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
        this.fechaProximoMantimiento = fechaProximoMantimiento;
        this.tieneArmas = tieneArmas;
        this.tipoDeDron = tipoDeDron;
    }

    public Date getFechaProximoMantimiento() {
        return fechaProximoMantimiento;
    }

    public void setFechaProximoMantimiento(Date fechaProximoMantimiento) {
        this.fechaProximoMantimiento = fechaProximoMantimiento;
    }

    public boolean isTieneArmas() {
        return tieneArmas;
    }

    public void setTieneArmas(boolean tieneArmas) {
        this.tieneArmas = tieneArmas;
    }

    public String getTipoDeDron() {
        return tipoDeDron;
    }

    public void setTipoDeDron(String tipoDeDron) {
        this.tipoDeDron = tipoDeDron;
    }

    @Override
    public Integer getAtributIdentificador() {
        return idNave;
    }

    @Override
    public String getAtributString() {
        return nombreNave;
    }

    @Override
    public Float getAtributFloat() {
        return kmRecorridos;
    }

    @Override
    public Date getAtributDate() {
        return fechaConstruccion;
    }

    @Override
    public Boolean getAtributBoolean() {
        return operativa;
    }

    @Override
    public void setAtributString(String s) {
        this.nombreNave = s;
    }

    @Override
    public void setAtributFloat(Float f) {
        this.kmRecorridos = f;
    }

    @Override
    public void setAtributDate(java.sql.Date d) {
        this.fechaConstruccion = d;
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        this.operativa = b;
    }

    @Override
    public String toString() {
        return "Dron{" + "idNave="+ idNave + " , nombreNave="+ nombreNave + " , kmRecorridos="+ kmRecorridos + " , fechaConstruccion="+ fechaConstruccion + " , operativa="+ operativa + " , fechaProximoMantimiento=" + fechaProximoMantimiento + ", tieneArmas=" + tieneArmas + ", tipoDeDron=" + tipoDeDron + '}';
    }
    
    

}
