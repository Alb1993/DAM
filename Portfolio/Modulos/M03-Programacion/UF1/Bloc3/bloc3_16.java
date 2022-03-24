package bloc3;

import java.util.Scanner;

public class bloc3_16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, reves = "";
        char n2 = ' ';
        System.out.println("Introduce palabra");
        nombre = in.nextLine();

        for (int i = nombre.length() - 1; i >= 0; i--) {
            n2 = nombre.charAt(i);
            reves= reves + n2;
        }
        System.out.println(reves);
    }
}
