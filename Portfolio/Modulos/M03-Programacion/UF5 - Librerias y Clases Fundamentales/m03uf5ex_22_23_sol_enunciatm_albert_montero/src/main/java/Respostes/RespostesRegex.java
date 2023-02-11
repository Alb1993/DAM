/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respostes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author manel
 */
public class RespostesRegex {
    
    
    public static List<Integer> respostaRegex4(String txt)
    {
        String IP_REGEX = "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9]"
                + "[0-9]?)\\.(25[0-5]|2[0-4]"
                + "[0-9]|[01]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[01]?"
                + "[0-9][0-9]?)\\.(25[0-5]|2[0-4]"
                + "[0-9]|[01]?[0-9][0-9]?)\\b";
        Pattern IP_PATTERN = Pattern.compile(IP_REGEX);
        List<Integer> posiciones = new ArrayList<>();
        Matcher matcher = IP_PATTERN.matcher(txt);
        while (matcher.find()) {
            posiciones.add(matcher.start());
        }
        return posiciones;
    }
    
    
    public static boolean respostaRegex6(String txt)
    {  
           String REGEX = "^[0-9]{4}[A-Z]{3}$";
           Pattern PATTERN = Pattern.compile(REGEX);
           return PATTERN.matcher(txt).matches();
    }
}
