package bloc2;

import java.util.Scanner;
import java.lang.Math;

public class Bloc2_9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 0, opcion = 0, suma = 0, resta = 0, division = 0, producto = 0;
        
        
        System.out.println("Introduce numero 1:");
        n1=in.nextInt();
        
        System.out.println("Introduce numero 2:");
        n2=in.nextInt();

        System.out.println("Operaciones posibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. Division");
        System.out.println("5. Raiz Cuadrada");
        System.out.println("Que operacion quieres hacer?");
        
        opcion = in.nextInt();

        if (opcion == 1){
            suma = n1 + n2;
            System.out.println("El resultado de la suma es " + suma + ".");
        }else if (opcion == 2){
            resta = n1 - n2;
            System.out.println("El resultado de la resta es " + resta + ".");
        }else if (opcion == 3){
            producto = n1 * n2;
            System.out.println("El resultado de la multiplicacion es " + producto + ".");
        }else if (opcion == 4){
            division = n1/n2;
            System.out.println("El resultado de la division es " + division + ".");                        
        }else if (opcion == 5){
            double raiz1=Math.sqrt(n1);
            double raiz2=Math.sqrt(n2);
            System.out.println("La raiz cuadrada del primer numero es: " + raiz1);
            System.out.println("I la del segundo numero es: " + raiz2);
        }
    }
}
