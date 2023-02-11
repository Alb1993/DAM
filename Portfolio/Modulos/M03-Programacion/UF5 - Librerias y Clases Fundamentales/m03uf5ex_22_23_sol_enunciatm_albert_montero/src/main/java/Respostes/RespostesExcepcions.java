/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respostes;

import Enunciat.AlumneCicleInfantil;

/**
 *
 * @author manel
 */
public class RespostesExcepcions {

    public static void respostaExcepcions1(AlumneCicleInfantil a) throws AlumneException {  
        if(a.getTutorLegal() == null){
             throw new AlumneException("La edad debe ser positiva");
        }else{
            if(a.getTutorLegal().getEdat()<18){
                throw new AlumneException("La edad debe ser positiva");
            }

        }    
    }

    public static String respostaExcepcions4(String p1, String p2) {
        String n = "";
        
        if((isNumeric(p1))&&(isNumeric(p2))){
            int a = Integer.parseInt(p1);
            int b = Integer.parseInt(p2);
            int i = a * b;
            n=i+"";
        }else{
            n = "ERROR";
        }
        return n;
    }

    private static class AlumneException extends Exception {

        public AlumneException(String n) {
            System.out.print(n);
        }
    }
    
    public static boolean isNumeric(String s){
        if (s == null || s.equals("")) {
            return false;
        }
 
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
 

}
