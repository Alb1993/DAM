package bloc3;

import java.util.Scanner;

public class bloc3_19 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        String cadena;
    
        System.out.println("Introduce una frase:");
        cadena = in.nextLine();
    
        for(int i = cadena.length()-1; i >= 0; i--){
    
            if (cadena.charAt(i) == 'a'){
            contA = contA + 1;
            
            }else if ( cadena.charAt(i) == 'e'){
            
            contE=contE + 1;
            
            }else if ( cadena.charAt(i) == 'i'){
            
            contI = contI + 1;
                   
            
            }else if ( cadena.charAt(i) == 'o'){
            
            contO = contO + 1;
            
            }else if ( cadena.charAt(i) == 'u'){
            
            contU = contU + 1;
            }
        }            
        System.out.println("Numero de apariciones letra A:" + contA);
        System.out.println("Numero de apariciones letra E:" + contE);
        System.out.println("Numero de apariciones letra I:" + contI);
        System.out.println("Numero de apariciones letra O:" + contO);
        System.out.println("Numero de apariciones letra U:" + contU);
    }
}
   
