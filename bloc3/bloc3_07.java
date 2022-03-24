package bloc3;

import java.util.Scanner;

public class bloc3_07 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, contPar=0;
        
        boolean numero=true;
        do{
        System.out.println("Introduce numero:");
        n1=in.nextInt();
        if(n1%2==0){
        contPar=contPar+1;
        }else if(n1==0){
        numero=false;
        }
        }while (numero==true);
        System.out.println("Han salido " + contPar + " numeros pares.");
    }   
}
