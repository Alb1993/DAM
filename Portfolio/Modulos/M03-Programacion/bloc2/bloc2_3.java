package bloc2;

import java.util.Scanner;

public class bloc2_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2;

        System.out.println("Intro primer numero");
        n1 = in.nextInt();

        if (n1 > 0) {
            System.out.println("El número es positivo");
        }
        else if (n1 == 0) {
                        System.out.println("El numero es 0");
                }
                
        else {
        System.out.println("el numero es negativo");
        }
    }
}
