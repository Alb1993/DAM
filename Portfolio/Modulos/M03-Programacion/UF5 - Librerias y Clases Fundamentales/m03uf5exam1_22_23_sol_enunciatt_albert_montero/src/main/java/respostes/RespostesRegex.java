/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respostes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author manel
 */
public class RespostesRegex {  
    
    public static Integer respostaRegex3(String txt)
    {
        Pattern pattern = Pattern.compile("--[a-zA-Z]{3}[0-9]{3}[a-zA-Z]{3}[0-9]{3}[a-zA-Z]{3}[0-9]{3}--");
        Matcher matcher = pattern.matcher(txt);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    
   
    public static List<String> respostaRegex5(String txt)
    {
        //Valida DNI
        Pattern pattern = Pattern.compile("[0-9]{8}[A-Za-z]");
        Matcher matcher = pattern.matcher(txt);
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            String dni = matcher.group();
            if (isValidDNI(dni)) {
                result.add(dni);
            }
        }
        return result;
    }
    
    //Compueba DNI
    private static boolean isValidDNI(String dni) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int mod = Integer.parseInt(dni.substring(0, 8)) % 23;
        return letters.charAt(mod) == dni.charAt(8);
    }
}
