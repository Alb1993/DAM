package bloc2;

import java.util.Scanner;

public class Bloc2_2 {
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2;

        System.out.println("Intro primer numero");
        n1 = in.nextInt();
        System.out.println("Intro segon numero");
        n2 = in.nextInt();

        if (n1 == n2){
            System.out.println("Los dos numeros son iguales.");
        }
        
        else if (n1 < n2){
        System.out.println("El segundo numero es mayor que el primero.");
      
        }
        else {
            System.out.println("El primer numero es mayor que el segundo.");
        }
    }
}
