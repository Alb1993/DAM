/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respostes;

import enunciat.Turista;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author manel
 */
public class RespostesColeccions {
    
    public static Turista respostaColeccions2(Map<String,Turista> dades, String c)
    {
       return dades.get(c);

    }
    
    public static List<Turista> respostaColeccions3(List<Turista> elements)
    {    
      elements.sort((o1, o2) -> o1.getTipusTicket().compareTo(o2.getTipusTicket()));
    return elements;
        
    }
}
