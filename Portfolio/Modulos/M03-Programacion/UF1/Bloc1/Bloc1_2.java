package bloc1;

import java.util.Scanner;

public class Bloc1_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2, suma;

        System.out.println("Intro primer numero");
        n1 = in.nextInt();
        System.out.println("Intro segon numero");
        n2 = in.nextInt();

        suma = n1 + n2;
        System.out.println("La suma es " + suma);

    }

}