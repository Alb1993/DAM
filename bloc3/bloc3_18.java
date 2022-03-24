package bloc3;

import java.util.Scanner;

public class bloc3_18 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String cadena;
        char caracter;
        int letra = 0;
        
        System.out.println("Introduce una palabra o frase:");
        cadena = in.nextLine();
        
        System.out.println("Introduce una letra:");
        caracter = in.next().charAt(0);
    
        for ( int i = cadena.length()-1; i >= 0; i--){
    
            if (cadena.charAt(i) == caracter){
                letra = letra + 1;
            }            
        }  
        System.out.println("La letra " + caracter + " ha aparecido en total " + letra + " veces.");
    }
}
