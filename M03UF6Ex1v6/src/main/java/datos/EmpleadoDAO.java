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
import modelo.Empleado;
import modelo.Oficina;

/**
 *
 * @author Albert
 */
public class EmpleadoDAO {
    
    public static ArrayList<Empleado> generaEmpleado(String codigoOficina) throws SQLException{
        Connection con = DataSource.getConnection();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
            Statement stmt = con.createStatement();
            String query = "select * from employees where officeCode = " + codigoOficina;
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setId(rs.getString("employeeNumber"));
                empleado.setEmail(rs.getString("email"));
                empleado.setNombreCompleto((rs.getString("firstName")) + " " + (rs.getString("lastName")));
                empleado.setCodiOficina(rs.getString("officeCode"));
                empleado.setListView("",empleado.getId(),empleado.getNombreCompleto(),empleado.getEmail(),empleado.getCodiOficina());
                empleados.add(empleado);
            }
        return empleados;
    }
}
