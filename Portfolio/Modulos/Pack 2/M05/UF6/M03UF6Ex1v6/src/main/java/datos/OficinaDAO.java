/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Oficina;

/**
 *
 * @author Albert
 */
public class OficinaDAO{
    
    public static ArrayList<Oficina> generaOficina() throws SQLException{
    
        Connection con = DataSource.getConnection();
        ArrayList<Oficina> oficinas = new ArrayList<Oficina>();
            Statement stmt = con.createStatement();
            String query = "select * from offices";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Oficina oficina = new Oficina();
                oficina.setIdOficina(rs.getString("officeCode"));
                oficina.setCiudad(rs.getString("city"));
                oficina.setCodigo_postal(rs.getString("postalCode"));
                oficina.setPais(rs.getString("country"));
                oficina.setDireccion1(rs.getString("addressLine1"));
                oficina.setTelefono(rs.getString("phone"));
                oficina.setListView("",oficina.getIdOficina(),oficina.getCiudad(),oficina.getTelefono(),oficina.getDireccion1(),oficina.getPais(),oficina.getCodigo_postal());
                oficinas.add(oficina);
            }
        return oficinas;
    }
}
