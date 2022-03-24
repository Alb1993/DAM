package Bloc4;

import java.util.Scanner;

public class Bloc4_3 {

    public static void main(String[] args) {  
    
        Scanner in = new Scanner(System.in);
        int[] n = new int[20];
        int n1=0, max=0, min=0, suma=0, mediaArit=0;
        
        for(int i=0;i<20;i++){
        System.out.println("Introduce numero:");
        n1=in.nextInt();
        n[i]=n1;
        }
        max=n[0];
        min=n[0];
        for(int j=0; j<20; j++){
        suma=suma+n[j];
        if (min>n[j]){
        min=n[j];
        }else{
            if(n[j]>max){
            max=n[j];
            }
        }
        }
        mediaArit=suma/n.length;
        System.out.println("El maximo es " + max);
        System.out.println("El minimo es " + min);
        System.out.println("La media aritmetica es " + mediaArit);
    }
}
