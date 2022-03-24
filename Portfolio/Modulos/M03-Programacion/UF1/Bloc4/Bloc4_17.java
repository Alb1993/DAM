package Bloc4;

import java.util.Scanner;

public class Bloc4_17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String ciudad=null;
        int hab=0, ciudadMin=0, ciudadMed=0, ciudadGran=0, total=0, porcMin=0, porcMed=0, porcGran=0;
        
        for(int i=0; i<20; i++){
        System.out.println("introduce nombre ciudad");
        ciudad=in.nextLine();
        
        System.out.println("Introduce numero de habitantes");
        hab=in.nextInt();
        
        total=total+hab;
        
        if(hab<2000){
        ciudadMin=ciudadMin+hab;
        }else if(hab<30000){
        ciudadMed=ciudadMed+hab;
        }else if(hab>30000){
        ciudadGran=ciudadGran+hab;
        }
        }
        porcMin=(ciudadMin/total)*100;
        porcMed=(ciudadMed/total)*100;
        porcGran=(ciudadGran/total)*100;
        System.out.println("El porcentaje que vive en una ciudad pequeña es del " + porcMin + "%.");
        System.out.println("El porcentaje que vive en una ciudad mediana es del " + porcMed + "%.");
        System.out.println("El porcentaje que vive en una ciudad grande es del " + porcGran + "%.");
    }
}
