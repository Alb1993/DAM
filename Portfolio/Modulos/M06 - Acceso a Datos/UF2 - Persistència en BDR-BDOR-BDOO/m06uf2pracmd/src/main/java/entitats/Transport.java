package entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author FPShare
 */
@Entity
//@Table
public class Transport extends Pilotada implements interficies.TesteableEntity, Serializable {

    private float pesoCarga;

    public Transport(float pesoCarga, Pilot pilotAeronau, int edad_piloto, ArrayList<Mecanic> mecanics, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, ArrayList<Missio> missions) {
        super(pilotAeronau, edad_piloto, mecanics, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
        this.pesoCarga = pesoCarga;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
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
        return "Transport{" + "idNave="+ idNave+ " nombreNave="+ nombreNave + " kmRecorridos="+ kmRecorridos+ " fechaConstruccion= "+ fechaConstruccion + " operativa=" + operativa +" pesoCarga=" + pesoCarga + + '}';
    }
    
    

}
