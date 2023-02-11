/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enunciat;

/**
 * @author manel
 */
public class AlumneCicleInfantil extends Alumne{
    
    /***
     * És el tutor/a legal de l'alumne, en cas que sigui menor d'edat
     */
    Persona tutorLegal;

    /**
     * @param idAlumne
     * @param curs
     * @param dni
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param edat
     * @param tutorLegal
     */
    public AlumneCicleInfantil( Integer idAlumne, Integer curs, String dni, String nom, String cognom1, String cognom2, Integer edat, Persona tutorLegal) {
        super(idAlumne, curs, dni, nom, cognom1, cognom2, edat);
        this.tutorLegal = tutorLegal;
    }
    
    /**
     *
     * @return
     */
    public Persona getTutorLegal() {
        return tutorLegal;
    }

    /**
     *
     * @param tutorLegal
     */
    public void setTutorLegal(Persona tutorLegal) {
        this.tutorLegal = tutorLegal;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("AlumneCicleInfantil{");
        sb.append("tutorLegal=").append(tutorLegal);
        sb.append('}');
        return sb.toString();
    }
}
