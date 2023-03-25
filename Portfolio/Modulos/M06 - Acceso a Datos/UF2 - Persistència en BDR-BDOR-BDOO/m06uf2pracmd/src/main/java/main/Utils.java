/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Date;

/**
 *
 * @author Albert
 */
public class Utils {
    
    public static java.sql.Date convertirSqlDate(java.util.Date fecha){
    java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
    return fechaSql;
    }
    
}
