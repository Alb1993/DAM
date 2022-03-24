package bloc3;

import java.util.Scanner;

public class bloc3_08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, contPos=0, contNeg=0;
        
        boolean numero=true;
        do{
        System.out.println("Introduce numero:");
        n1=in.nextInt();
        if(n1>0){
        contPos=contPos+1;
        }else if(n1==0){
        numero=false;
        }else{
        contNeg=contNeg+1;
        }
        }while (numero==true);
        System.out.println("Han salido " + contPos + " numeros positivos");
        System.out.println("y " + contNeg + " numeros negativos.");
    }   
}
