package bloc1;

import java.util.Scanner;

public class Bloc1_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2, multi;

        System.out.println("Intro primer numero");
        n1 = in.nextInt();
        System.out.println("Intro segon numero");
        n2 = in.nextInt();

        multi = n1 * n2;
        System.out.println("La multiplicacion es " + multi);

    }

}
