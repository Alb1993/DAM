/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Albert
 */
public class Oficina {
    
    private String idOficina;
    private String ciudad;
    private String telefono;
    private String direccion1;
    private String pais;
    private String codigo_postal;
    private String listView;

    public String getListView() {
        return listView;
    }


    public void setIdOficina(String idOficina) {
        this.idOficina = idOficina;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getIdOficina() {
        return idOficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public Oficina(String idOficina, String ciudad, String telefono, String direccion1, String pais, String codigo_postal, String listView) {
        this.idOficina = idOficina;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
        this.listView = listView;
    }
    
    public Oficina() {
        this.idOficina = "";
        this.ciudad = "";
        this.telefono = "";
        this.direccion1 = "";
        this.pais = "";
        this.codigo_postal = "";
        this.listView = "";
    }

    public void setListView(String listView, String idOficina, String ciudad, String telefono, String direccion1, String pais, String codigo_postal) {
        this.listView = "" + idOficina + ";" + ciudad + ";" + direccion1 + ";" + codigo_postal + ";" + pais + ";" + telefono + ";";
    }
    
    
}


