package Bloc4;

import java.util.Scanner;

public class Bloc4_9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1;
        boolean esPrimo = true;

        System.out.println("Introduce numero:");
        n1 = in.nextInt();

        for (int i = 0; i < n1; i++) {
            if ((i == 1) && (n1 % i == n1)) {
                if ((i > 1) && (i < n1) && (n1 % i == 0)) {
                    esPrimo = false;
                } else {
                    if (n1 % i == n1) {
                        esPrimo = true;
                    }
                }
            } else {
                esPrimo = false;
            }

        }

        if (esPrimo = true) {
            System.out.println("El numero " + n1 + " es primo.");
        } else {
            System.out.println("El numero " + n1 + " no es primo");
        }
    }
}
