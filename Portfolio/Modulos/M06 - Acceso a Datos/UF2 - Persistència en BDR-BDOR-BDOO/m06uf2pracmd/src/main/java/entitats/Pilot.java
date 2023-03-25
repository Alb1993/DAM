package entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author FPShare
 */
@Entity
//@Table
public class Pilot extends Soldat implements interficies.TesteableEntity,Serializable {

    private String clavePiloto;
    private float distanciaPilotadaKM;

    //@OneToOne
    //private Pilotada pilotada;    
    
    public Pilot(String clavePiloto, float distanciaPilotadaKM, int edad, String nombreClave, float versionTransmisor, Date fechaAlistamiento, boolean operativo) {
        super(edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
        this.clavePiloto = clavePiloto;
        this.distanciaPilotadaKM = distanciaPilotadaKM;

    }

    public String getClavePiloto() {
        return clavePiloto;
    }

    public void setClavePiloto(String clavePiloto) {
        this.clavePiloto = clavePiloto;
    }

    public float getDistanciaPilotadaKM() {
        return distanciaPilotadaKM;
    }

    public void setDistanciaPilotadaKM(float distanciaPilotadaKM) {
        this.distanciaPilotadaKM = distanciaPilotadaKM;
    }

    @Override
    public Integer getAtributIdentificador() {
        return idSoldado;
    }

    @Override
    public String getAtributString() {
        return nombreClave;
    }

    @Override
    public Float getAtributFloat() {
        return versionTransmisor;
    }

    @Override
    public Date getAtributDate() {
        return fechaAlistamiento;
    }

    @Override
    public Boolean getAtributBoolean() {
        return operativo;
    }

    @Override
    public void setAtributString(String s) {
        this.nombreClave = s;
    }

    @Override
    public void setAtributFloat(Float f) {
        this.versionTransmisor = f;
    }

    @Override
    public void setAtributDate(Date d) {
        this.fechaAlistamiento = d;
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        this.operativo = b;
    }

    @Override
    public String toString() {
        return "Pilot{"+ "idSoldado= "+ idSoldado+ " , nombreClave="+ nombreClave + " , operativo=" + operativo + " , fechaAlistamiento=" + fechaAlistamiento + " , versionTransmisor=" + versionTransmisor + ", clavePiloto=" + clavePiloto + ", distanciaPilotadaKM=" + distanciaPilotadaKM + '}';
    }
    
    

}
