/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enunciat;

import java.time.LocalTime;

/**
 *
 * @author manel
 */
public class Accio {
       
    private LocalTime timeStamp;
    private TipusAccio accio;
    private String propietari;

    public Accio(LocalTime timeStamp, TipusAccio accio, String propietari) {
        this.timeStamp = timeStamp;
        
        this.accio = accio;
        this.propietari = propietari;
    }

    public LocalTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public TipusAccio getAccio() {
        return accio;
    }

    public void setAccio(TipusAccio accio) {
        this.accio = accio;
    }

    public String getPropietari() {
        return propietari;
    }

    public void setPropietari(String propietari) {
        this.propietari = propietari;
    }
    
    

    @Override
    public String toString() {
        return "Accio{" + "timeStamp=" + timeStamp + ", accio=" + accio + ", propietari=" + propietari + '}';
    }

}
