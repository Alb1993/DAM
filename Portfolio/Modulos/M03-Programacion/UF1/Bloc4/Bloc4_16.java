package Bloc4;

import java.util.Scanner;

public class Bloc4_16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1=0, contPrimo=0;
        boolean esCero=false;
        
        do{
        System.out.println("Introduce numero:");
        n1 = in.nextInt();    
        
        
        if(n1==0){
        esCero=true;
        }else{
            for(int i=1; i<n1; i++)
            if((i==1)&&(n1%i==n1)){
                if((i>1)&&(i<n1)&&(n1%i!=0)){
                    if(n1%n1==1){
                    contPrimo=contPrimo+1;
                    }
                }
            }
            
        }
        }while (esCero==false);
        System.out.println("En la secuencia de numeros hay " + contPrimo + " numeros que son primos.");  
    }
}







    

