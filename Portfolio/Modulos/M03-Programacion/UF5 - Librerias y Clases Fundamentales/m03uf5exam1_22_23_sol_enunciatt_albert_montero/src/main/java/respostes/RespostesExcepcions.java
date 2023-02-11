/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respostes;

import enunciat.Treballador;

/**
 *
 * @author manel
 */
public class RespostesExcepcions {
    
   
    public static void respostaExcepcions2(Treballador t) throws SouBrutException, CategoriaException
    {
        
       if((t.getSouBrut()<0)||(t.getSouBrut()>9999)){
        throw new SouBrutException("aaaaaa");
       
       }else{
               
            if(t.getCategoria()==1){
                if(t.getSouBrut()<1000){
                    throw new CategoriaException("aaaa");
                }
            }else{
                if(t.getCategoria()==2){
                    if(t.getSouBrut()<2000){
                        throw new CategoriaException("aaaa");
                    }
                }
                else{
                    if(t.getCategoria()==3){
                        if(t.getSouBrut()<3000){
                            throw new CategoriaException("aaaa");
                        }
                    }
           
                }
            }
               
               
        }    

    }
    
    
   
    public static Double repostaExcepcions3(String p1, String p2)
    {
        try {
            double n1 = Double.parseDouble(p1);
            double n2 = Double.parseDouble(p2);
            if (n2 == 0) {
                return -1.0;
            }
            return n1 / n2;
        } catch (NumberFormatException e) {
            return -1.0;
        }
    }
    
    
        private static class SouBrutException extends Exception {

            public SouBrutException(String n) {
                System.out.print(n);
            }
        }
    
        private static class CategoriaException extends Exception {

            public CategoriaException(String n) {
                System.out.print(n);
            }
        }
}
