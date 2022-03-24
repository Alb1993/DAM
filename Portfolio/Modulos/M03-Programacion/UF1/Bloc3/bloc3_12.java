package bloc3;

import java.util.Scanner;

public class bloc3_12 {
 
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int suma=0;
        
        for(int i=0;i<20;i++){
            if((i%5==0)||(i%7==0)){
            suma=suma+i;
            }
        }
        System.out.println("La suma de los 20 primeros numeros es: " +  suma);
    }    
}
