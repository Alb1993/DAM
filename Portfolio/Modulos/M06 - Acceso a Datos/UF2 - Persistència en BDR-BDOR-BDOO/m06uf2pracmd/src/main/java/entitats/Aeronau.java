package entitats;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase Aeronave para la creación de Aeronaves y después utilizarla en clases
 * inferiores.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Aeronau implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    protected int idNave;
    
    protected String nombreNave;
    
    protected float kmRecorridos;
    
    protected Date fechaConstruccion;
    
    protected boolean operativa;
    
    protected int estado;
    
   @ManyToMany(mappedBy = "aeronaus", cascade = {CascadeType.ALL})
    protected List<Missio> missions;

    public Aeronau(String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        this.nombreNave = nombreNave;
        this.kmRecorridos = kmRecorridos;
        this.fechaConstruccion = fechaConstruccion;
        this.operativa = operativa;
        this.estado = estado;
        this.missions = missions;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public float getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(float kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public boolean isOperativa() {
        return operativa;
    }

    public void setOperativa(boolean operativa) {
        this.operativa = operativa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Missio> getMissions() {
        return missions;
    }

    public void setMissions(List<Missio> missions) {
        this.missions = missions;
    }

}
