package Bloc4;

import java.util.Scanner;

public class Bloc4_14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        int metros=0, impuesto=0, contPeq=0, contMed=0, contGran=0;
        
        for(int i = 0;i<20;i++){
        System.out.println("Introduce cantidad m2: ");
        metros=in.nextInt();
            if(metros<60){
            impuesto=impuesto+20;
            contPeq=contPeq+1;
            }else if(metros<90){
            impuesto=impuesto+35;
            contMed=contMed+1;
            }else{
            impuesto=impuesto+50;
            contGran=contGran+1;
            }
        }
        System.out.println("La cantidad total a pagar en el bloque es de " + impuesto + " €.");
        System.out.println("En el bloque hay " + contPeq + " bloques de menos de 60 metros cuadrados.");
        System.out.println("Tambien hay " + contMed + " bloques de entre 60 i 90 metros cuadrados.");
        System.out.println("Y " + contGran + " bloques de mas de 90 metros cuadrados.");
    }
}
