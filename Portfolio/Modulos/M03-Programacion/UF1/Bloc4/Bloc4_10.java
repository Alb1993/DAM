package Bloc4;

import java.util.Scanner;

public class Bloc4_10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = 0;

        System.out.println("introduce numero:");
        n1 = in.nextInt();

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                System.out.println(i);
            }

        }

    }
}
