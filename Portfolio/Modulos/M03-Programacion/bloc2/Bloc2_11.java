package bloc2;

import java.util.Scanner;

public class Bloc2_11 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float n1;

        System.out.println("Introduce una cantidad:");
        n1 = in.nextFloat();
        

        if (n1 > 10000){   
            n1 = n1-(n1/10);
        System.out.println("El precio total es de " + n1 + " euros.");
        }        
                
        else {
            n1 = n1 - (n1/20);
        System.out.println("El precio total es de " + n1 + " euros.");
        }
    }
}
