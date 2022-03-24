package bloc2;

import java.util.Scanner;

public class bloc2_4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int valor;

        System.out.println("Escriu un valor:");
        valor = in.nextInt();

        if (valor % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}

    
