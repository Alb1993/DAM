/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Albert
 */
public class Empleado {
    
    private String id;
    private String nombreCompleto;
    private String email;
    private String codiOficina;
    private String listView;
    
    public String getListView() {
        return listView;
    }

    public void setListView(String listView) {
        this.listView = listView;
    }
    
    public void setListView(String listView, String id, String nombreCompleto, String email, String codiOficina) {
        this.listView = "" + id + ";" + nombreCompleto + ";" + email + ";" + codiOficina + ";";
    }

    public Empleado(String listView) {
        this.listView = listView;
    }


    public String getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getCodiOficina() {
        return codiOficina;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodiOficina(String codiOficina) {
        this.codiOficina = codiOficina;
    }

    public Empleado(String id, String nombreCompleto, String email, String codiOficina, String listView) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.codiOficina = codiOficina;
        this.listView = listView;
    }
    public Empleado() {
        this.id = "";
        this.nombreCompleto = "";
        this.email = "";
        this.codiOficina = "";
        this.listView = "";
    }


}
