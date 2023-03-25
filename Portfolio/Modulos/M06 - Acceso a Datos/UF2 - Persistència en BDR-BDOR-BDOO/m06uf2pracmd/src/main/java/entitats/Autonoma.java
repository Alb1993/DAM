package entitats;

import jakarta.persistence.Entity;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author FPShare
 */
@Entity
public abstract class Autonoma extends Aeronau implements Serializable{


    public Autonoma(String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        super(nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
    }

}
