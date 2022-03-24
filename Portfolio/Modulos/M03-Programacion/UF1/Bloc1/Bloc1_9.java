package bloc1;

import java.util.Scanner;

import java.lang.Math;

public class Bloc1_9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double cateto1, cateto2;
        

        System.out.println("Intro primer costado");
        cateto1 = in.nextDouble();
        System.out.println("Intro segundo costado");
        cateto2 = in.nextDouble();
        
        cateto1=Math.pow(cateto1,2);
        cateto2=Math.pow(cateto2,2);
        
        double hypo = Math.sqrt(cateto1 + cateto2);
        
        System.out.println("La hipotenusa es " + hypo);
    }

}


