/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enunciat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author manel
 */
public class Logic {
    
    public static boolean validaPropietariAccio(Accio a)
    {
       String regex = "^U:[A-Z]{4}[0-9]{6}$";
       if(a.getPropietari().matches(regex)){
        return true;
       }
       
       return false;
    }
    
    
    public static List<Integer> extrauAdrecesIP(Pagina p)
    {
        String IP_REGEX = "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9]"
                + "[0-9]?)\\.(25[0-5]|2[0-4]"
                + "[0-9]|[01]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[01]?"
                + "[0-9][0-9]?)\\.(25[0-5]|2[0-4]"
                + "[0-9]|[01]?[0-9][0-9]?)\\b";
        Pattern IP_PATTERN = Pattern.compile(IP_REGEX);
        List<Integer> posiciones = new ArrayList<>();
        Matcher matcher = IP_PATTERN.matcher(p.text);
        while (matcher.find()) {
            posiciones.add(matcher.start());
        }
        return posiciones;
    }
    
    public static List<String> metode_1(List<String> llista)
    {
        
        List<String> startsWithN = new ArrayList<String>();
        for(String name : llista) {
          if(name.startsWith("M")&&(!name.endsWith("y"))){
            startsWithN.add(name);
          }    
        }
       return startsWithN;
    }
       
        
    
    
    public static List<String> metode_2(List<String> llista)
    {   
        List<String> llista2 = new ArrayList<String>();
         String regex = "^[0-9a-zA-Z]{5}$";
         for(int i=0; i<llista.size();i++){
             if(llista.get(i).matches(regex)){
             llista2.add(llista.get(i));
             }
         }
         Collections.sort(llista2);
         return llista2;
    }

}
