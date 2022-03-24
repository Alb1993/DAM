package Bloc4;

import java.util.Scanner;

public class Bloc4_15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        
        int n1=0;
        System.out.println("Introduce numero:");
        n1=in.nextInt();

        for(int i=1;i<n1;i++){
        System.out.println("Numero al cuadrado: " + Math.pow(i,2));
        }
        for(int j=1;j<n1;j++){
        System.out.println("Numero al cubo: " + Math.pow(j,3));
        }
    }
}





