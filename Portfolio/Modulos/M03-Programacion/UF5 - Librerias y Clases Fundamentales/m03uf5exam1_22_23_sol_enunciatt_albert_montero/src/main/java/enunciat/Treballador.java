/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enunciat;

/**
 *
 * @author manel
 */
public class Treballador extends Persona{
    
    // sou brut del treballador en euros
    Integer souBrut;
    
    /***
     * Categoria del treballador. La categoria pot ser 1, 2 o 3
     * 
     */
    Integer categoria;

    /**
     *
     * @param dni
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param edat
     * @param souBrut
     * @param categoria
     */
    public Treballador( String dni, String nom, String cognom1, String cognom2, Integer edat, Integer souBrut, Integer categoria) {
        super(dni, nom, cognom1, cognom2, edat);
        
        this.souBrut = souBrut;
        this.categoria = categoria;
    }
    
    /**
     *
     * @return
     */
    public Integer getSouBrut() {
        return souBrut;
    }

    /**
     *
     * @param souBrut
     */
    public void setSouBrut(Integer souBrut) {
        this.souBrut = souBrut;
    }

    /**
     *
     * @return
     */
    public Integer getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Treballador{");
        sb.append("souBrut=").append(souBrut);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }
}
