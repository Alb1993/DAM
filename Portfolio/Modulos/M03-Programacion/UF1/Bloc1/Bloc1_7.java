package bloc1;

import java.util.Scanner;
import java.lang.Math; 
public class Bloc1_7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float n1 = 0;
        
        System.out.println("intro numero calcular raiz cuadrada");
        n1 = in.nextFloat();
        double resultado = Math.sqrt(n1);
        System.out.println("La raiz cuadrada de" + n1 + " es " + resultado);

    }

}
