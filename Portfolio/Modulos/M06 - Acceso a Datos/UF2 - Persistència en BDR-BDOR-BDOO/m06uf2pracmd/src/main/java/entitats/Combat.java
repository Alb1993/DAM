package entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase para la creación de aeronaves pilotadas por humanos de combate,
 * extiende de la clase pilotada y implementa la interficie de TesteableEntity.
 */
@Entity
//@Table
public class Combat extends Pilotada implements interficies.TesteableEntity, Serializable {
    
    private float versionArmamento;
    

    public Combat(float versionArmamento, Pilot pilotAeronau, int edad_piloto, ArrayList<Mecanic> mecanics, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, ArrayList<Missio> missions) {
        super(pilotAeronau, edad_piloto, mecanics, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
        this.versionArmamento = versionArmamento;
    }

    public float getVersionArmamento() {
        return versionArmamento;
    }

    public void setVersionArmamento(float versionArmamento) {
        this.versionArmamento = versionArmamento;
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
    public void setAtributDate(Date d) {
        this.fechaConstruccion = d;
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        this.operativa = b;
    }

    @Override
    public String toString() {
        return "Combat{" + "versionArmamento=" + versionArmamento + " idNave=" +  idNave + " nombreNave=" + nombreNave+ " kmRecorridos=" +kmRecorridos + " fechaConstruccion="+ fechaConstruccion + " operativa=" + operativa +'}';
    }
    
    

}
