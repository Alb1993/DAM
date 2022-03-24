package bloc3;

import java.util.Scanner;

public class bloc3_03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int trabajador;
        double salario, salario2 = 0;

        System.out.println("Introduce cantidad de trabajadores:");
        trabajador = in.nextInt();
        for (int i = 0; i < trabajador; i++) {
            System.out.println("Introduce salario");
            salario = in.nextInt();
            if(salario<9000){
                salario2=salario+(salario*0.2);
                System.out.println("Salario: " + salario);
            } else if (salario<15000){
                salario2 = salario+(salario*0.1);
            System.out.print("Salario: " + salario);
            } else if (salario<20000) {
                salario2 = salario+(salario*0.05);
            System.out.print("Salario: " + salario);
            } else {
                System.out.print("Salario: " + salario2);
            }
        }
    }
}
