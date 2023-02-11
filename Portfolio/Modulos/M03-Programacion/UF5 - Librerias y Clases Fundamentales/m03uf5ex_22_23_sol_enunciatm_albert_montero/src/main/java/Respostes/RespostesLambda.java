/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respostes;

import Enunciat.Alumne;
import Enunciat.Turista;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author manel
 */
public class RespostesLambda {
    
    public static List<Turista> respostaLambda1(String inicial, List<Turista> llista){
        
        List<Turista> startsWithN = new ArrayList<Turista>();
        for(Turista name : llista) {
          if(name.getNom().startsWith(inicial)){
            startsWithN.add(name);
          }    
        }
       return startsWithN;
    }
    
   
    public static Predicate<Alumne> respostaLambda2(){   
        return p -> p.getCurs() == 5 || p.getCurs() == 6;
    }
}
