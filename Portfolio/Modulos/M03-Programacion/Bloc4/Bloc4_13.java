package Bloc4;

import java.util.Scanner;

public class Bloc4_13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       
        int[] n = new int[10];
        int n1=0, max=0, reps=1;
 
        for(int i=0; i<n.length; i++){
        System.out.println("intro numero:");
        n1=in.nextInt();
        n[i]=n1;
        }
        max=n[0];
        for(int j=0; j<n.length; j++){
            if(n[j]>max){
            max=n[j];
            }else if(n[j]==max){
            reps=reps+1;
            }
        }
        System.out.println("El numero " + max + " es el numero maximo y se ha repetido " + reps + " veces.");
    }
}