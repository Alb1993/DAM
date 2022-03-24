package bloc3;

import java.util.Scanner;

public class bloc3_06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int suma = 0;
        
        for(int i=0; i<=100; i++){
        suma = suma + i; 
        }
        System.out.println("La suma de los primeros 100 numeros naturales es " + suma);
    }
}
