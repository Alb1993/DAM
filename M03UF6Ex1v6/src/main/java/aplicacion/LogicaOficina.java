/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Oficina;

/**
 *
 * @author Albert
 */
public class LogicaOficina {
    
    //public static ArrayList<Oficina> oficinaLogic = null;
    
    public LogicaOficina(){
        super();
    }
    
    public static ArrayList<Oficina> getOficina() throws SQLException{
        ArrayList<Oficina> oficinaLogic = datos.OficinaDAO.generaOficina();
        
    return oficinaLogic;
    }
    
}
