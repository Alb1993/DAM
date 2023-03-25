/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author FPShare
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Soldat implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    protected int idSoldado;
    protected int edad;
    protected String nombreClave;
    protected float versionTransmisor;
    protected Date fechaAlistamiento;
    protected boolean operativo;

    public Soldat(int edad, String nombreClave, float versionTransmisor, Date fechaAlistamiento, boolean operativo) {
        this.edad = edad;
        this.nombreClave = nombreClave;
        this.versionTransmisor = versionTransmisor;
        this.fechaAlistamiento = fechaAlistamiento;
        this.operativo = operativo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public float getVersionTransmisor() {
        return versionTransmisor;
    }

    public void setVersionTransmisor(float versionTransmisor) {
        this.versionTransmisor = versionTransmisor;
    }

    public Date getFechaAlistamiento() {
        return fechaAlistamiento;
    }

    public void setFechaAlistamiento(Date fechaAlistamiento) {
        this.fechaAlistamiento = fechaAlistamiento;
    }

    public boolean isOperativo() {
        return operativo;
    }

    public void setOperativo(boolean operativo) {
        this.operativo = operativo;
    }

}
