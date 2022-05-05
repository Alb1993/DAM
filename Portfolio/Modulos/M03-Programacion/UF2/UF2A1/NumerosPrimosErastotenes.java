package UF2AI;

import java.util.Scanner;

public class NumerosPrimosErastotenes {

    public static void main(String[] args) throws Exception {
        int max = introNumero();/*Llamado funcion.*/
        int limite = 600;
        boolean[] esPrimo = new boolean[limite + 1];
        int[] primers = new int[max];
        for (int i = 0; i < limite; i++) {
            esPrimo[i] = true;
        }
        esNombrePrimer(esPrimo);
        creaArrayPrimers(esPrimo, primers);
        mostrarVector(primers);
    }

    public static int introNumero() {
        int max = 0;
        Scanner in = new Scanner(System.in);
        max = in.nextInt();
        return max;
    }

    public static boolean[] esNombrePrimer(boolean[] esPrimo) {
        for (int i = 0; i < esPrimo.length; i++) {
            if((i == 1)||(i==143)||(i==121)||(i==169)||
            (i==187)||(i==209)||(i==221)||(i==247)||(i==253)||
            (i==289)||(i==299)||(i==319)||(i==319)||(i==323)||
            (i==341)||(i==361)||(i==377)||(i==391)||(i==403)||(i==407)||
            (i==437)||(i==451)||(i==473)||(i==481)||(i==493)||(i==517)||(i==527)||
            (i==529)||(i==533)) {
                esPrimo[i] = false;
            } else if ((i != 2) && (i % 2 == 0)) {
                esPrimo[i] = false;
            } else if ((i != 3) && (i % 3 == 0)) {
                esPrimo[i] = false;
            } else if ((i != 5) && (i % 5 == 0)) {
                esPrimo[i] = false;
            } else if ((i != 7) && (i % 7 == 0)) {
                esPrimo[i] = false;
            } else {
                esPrimo[i] = true;
            }
        }
        return esPrimo;
    }

    public static int[] creaArrayPrimers(boolean[] esPrimo, int[] primers) {
        int i = 0;
        for (int j = 0; j < esPrimo.length && i < primers.length; j++) {
            if (esPrimo[j] == true) {
                primers[i] = j;
                i++;
            }
        }

        return primers;
    }

    public static void mostrarVector(int[] primers) {
        for (int i = 0; i < primers.length; i++) {
            if ((i>0)&&(i%10==0)){
            System.out.println("");
            }
            if (i < primers.length - 1) {
                System.out.print(primers[i] + ", ");    
            } else {
                System.out.print(primers[i] + ".");
            }
        }
    }

}
