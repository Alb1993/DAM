package bloc1;

import java.util.Scanner;
import java.lang.Math;

public class Bloc1_8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        double radi, resultat;
        
        System.out.println("Introduce el radio");
        radi = in.nextDouble();
        resultat = 2 * Math.PI * radi;
        
        System.out.println("Resultat " + resultat);
        

    }

}

