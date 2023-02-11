/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enunciat;

/**
 *
 * @author manel
 */
public class Alumne extends Persona{
    
    Integer idAlumne;
    Integer curs;

    /**
     *
     * @param idAlumne
     * @param curs
     * @param dni
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param edat
     */
    public Alumne(Integer idAlumne, Integer curs, String dni, String nom, String cognom1, String cognom2, Integer edat) {
        super(dni, nom, cognom1, cognom2, edat);
        this.idAlumne = idAlumne;
        this.curs = curs;
    }

    /**
     *
     * @return
     */
    public Integer getIdAlumne() {
        return idAlumne;
    }

    /**
     *
     * @param idAlumne
     */
    public void setIdAlumne(Integer idAlumne) {
        this.idAlumne = idAlumne;
    }

    /**
     *
     * @return
     */
    public Integer getCurs() {
        return curs;
    }

    /**
     *
     * @param curs
     */
    public void setCurs(Integer curs) {
        this.curs = curs;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Alumne{");
        sb.append("idAlumne=").append(idAlumne);
        sb.append(", curs=").append(curs);
        sb.append('}');
        return sb.toString();
    }

    
    
}
