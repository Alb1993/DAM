/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enunciat;

import java.util.Objects;

/**
 *
 * @author manel
 */
public class Persona {
    
    String dni;
    String nom;
    String cognom1;
    String cognom2;
    Integer edat;

    /**
     *
     * @param dni
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param edat
     */
    public Persona(String dni, String nom, String cognom1, String cognom2, Integer edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.edat = edat;
    }

    /**
     *
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getCognom1() {
        return cognom1;
    }

    /**
     *
     * @param cognom1
     */
    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    /**
     *
     * @return
     */
    public String getCognom2() {
        return cognom2;
    }

    /**
     *
     * @param cognom2
     */
    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    /**
     *
     * @return
     */
    public Integer getEdat() {
        return edat;
    }

    /**
     *
     * @param edat
     */
    public void setEdat(Integer edat) {
        this.edat = edat;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("dni=").append(dni);
        sb.append(", nom=").append(nom);
        sb.append(", cognom1=").append(cognom1);
        sb.append(", cognom2=").append(cognom2);
        sb.append(", edat=").append(edat);
        sb.append('}');
        return sb.toString();
    }
}
