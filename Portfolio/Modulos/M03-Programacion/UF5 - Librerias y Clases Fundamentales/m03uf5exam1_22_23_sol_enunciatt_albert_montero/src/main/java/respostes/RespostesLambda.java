/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respostes;

import enunciat.Persona;
import enunciat.Turista;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 * @author manel
 */
public class RespostesLambda {

    public static Supplier respostaLambda3() {
        Persona persona = new Persona("45858467D", "Albert", "Montero", "Villar", 29);

        return () -> persona;
    }

    public static List<Turista> respostaLambda4(List<Turista> llista) {
        
        
            return llista.stream()
            .filter(t -> t.getNom().matches("^[AEIOU].*"))
            .filter(t -> t.getTipusTicket() == 2 || t.getTipusTicket() == 3)
            .filter(t -> t.getEdat() >= 18)
            .collect(Collectors.toList());
            
    }
}
