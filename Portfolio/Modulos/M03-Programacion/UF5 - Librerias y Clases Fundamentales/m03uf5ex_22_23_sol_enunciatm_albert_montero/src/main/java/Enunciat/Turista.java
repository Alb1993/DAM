/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enunciat;

/**
 *
 * @author manel
 */
public class Turista extends Persona {
    
    /***
     * L'ordre de compra determina el moment de temps en el qual 
     * el turista ha comprat el tiquet. 
     * Un turista que ha comprat abans tindrà un ordre menor que un 
     * turista que ha comprat més tard.
     */
    Integer ordreDeCompra;
    
    /***
     * Un tiquet de turista pot ser de tres tipus: 1 = VIP, 2 = plus, 3 = bàsic
     */
    Integer tipusTicket;

    /**
     *
     * @param dni
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param edat
     * @param tipusTicket
     * @param ordreDeCompra
     */
    public Turista( String dni, String nom, String cognom1, String cognom2, Integer edat, Integer tipusTicket, Integer ordreDeCompra ) {
        super(dni, nom, cognom1, cognom2, edat);
        this.ordreDeCompra = ordreDeCompra;
        this.tipusTicket = tipusTicket;
    } 

    /**
     *
     * @return
     */
    public Integer getOrdreDeCompra() {
        return ordreDeCompra;
    }

    /**
     *
     * @param ordreDeCompra
     */
    public void setOrdreDeCompra(Integer ordreDeCompra) {
        this.ordreDeCompra = ordreDeCompra;
    }

    /**
     *
     * @return
     */
    public Integer getTipusTicket() {
        return tipusTicket;
    }

    /**
     *
     * @param tipusTicket
     */
    public void setTipusTicket(Integer tipusTicket) {
        this.tipusTicket = tipusTicket;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Turista{");
        sb.append("ordreDeCompra=").append(ordreDeCompra);
        sb.append(", tipusTicket=").append(tipusTicket);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
