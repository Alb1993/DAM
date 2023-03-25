package entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;


/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase Pilotada para crear aeronaves pilotadas por humanos, extiende de
 * Aeronave.
 */
@Entity
public abstract class Pilotada extends Aeronau {
    
    private int edad_piloto;
    
    @OneToOne
    private Pilot pilotAeronau;
    @OneToMany(mappedBy = "pilotadaMecanic")
    private List<Mecanic> mecanics;

    public Pilotada(Pilot pilotAeronau, int edad_piloto, List<Mecanic> mecanics, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, ArrayList<Missio> missions) {
        super(nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
        this.pilotAeronau = pilotAeronau;
        this.edad_piloto = edad_piloto;
        this.mecanics = mecanics;
    }

    public Pilot getPilotAeronau() {
        return pilotAeronau;
    }

    public void setPilotAeronau(Pilot pilotAeronau) {
        this.pilotAeronau = pilotAeronau;
    }

    public int getEdad_piloto() {
        return edad_piloto;
    }

    public void setEdad_piloto(int edad_piloto) {
        this.edad_piloto = edad_piloto;
    }

    public List<Mecanic> getMecanics() {
        return mecanics;
    }

    public void setMecanics(List<Mecanic> mecanics) {
        this.mecanics = mecanics;
    }

}
