package bloc3;

import java.lang.Math;
import java.util.Scanner;

public class bloc3_20 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);   
        int m, n;
        double resultado;
        
        System.out.println("Introduce un numero: ");
        m=in.nextInt();
        System.out.println("Introduce potencia: ");
        n=in.nextInt();
        resultado=Math.pow(m,n);
        System.out.println("El numero " + m + " elevado a " + n + " es: " + resultado);
    }
}
