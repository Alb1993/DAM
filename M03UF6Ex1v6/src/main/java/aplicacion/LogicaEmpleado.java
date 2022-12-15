/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author Albert
 */
public class LogicaEmpleado {
    
    //public ArrayList<Empleado> empleadoLogic;
    
    public LogicaEmpleado(){
        super();
    }
    
    public static ArrayList<Empleado> getEmpleado(String codigoOficina) throws SQLException{
        
        ArrayList<Empleado> empleadoLogic = datos.EmpleadoDAO.generaEmpleado(codigoOficina);
        
    return empleadoLogic;
    }
    
}
