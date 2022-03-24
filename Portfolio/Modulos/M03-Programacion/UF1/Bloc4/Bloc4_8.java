package Bloc4;

import java.util.Scanner;


public class Bloc4_8 {
 
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        int numero, numero1=1, numero2, suma=0;
        
        System.out.println("Introduce numero");
        numero = in.nextInt();
        
        for(int n=1; n<numero; n++){
            if(n%numero==0){
                suma = suma + n;    
            }
            else{
                    
            }
        }    
        if(suma==numero){
            System.out.println("El numero " + numero + " es perfecto.");
        }
    }
}

