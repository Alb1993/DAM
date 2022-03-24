package bloc2;

import java.util.Scanner;

public class Bloc2_6 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int diaNac=0, mesNac=0, añoNac=0, diaHoy=0, mesHoy=0, añoHoy=0, diaDif=0, mesDif=0, añoDif=0;
        
        System.out.println("Introduce dia de tu nacimiento:");
        diaNac=in.nextInt();
        System.out.println("Introduce mes de tu nacimiento:");
        mesNac=in.nextInt();
        System.out.println("Introduce año de tu nacimiento:");
        añoNac=in.nextInt();
        System.out.println("Introduce dia actual:");
        diaHoy=in.nextInt();
        System.out.println("Introduce mes actual:");
        mesHoy=in.nextInt();
        System.out.println("Introduce año actual:");
        añoHoy=in.nextInt();
        
        if(mesNac>mesHoy){
        añoHoy=añoHoy-1;
        mesHoy=mesHoy+12;
        }
        if(diaNac>diaHoy){
        mesHoy=mesHoy-1;
        diaHoy=diaHoy+30;
        }
        
        diaDif=diaHoy-diaNac;
        mesDif=mesHoy-mesNac;
        añoDif=añoHoy-añoNac;
        
        System.out.print("La diferencia es de " + diaDif + " dias, " + mesDif + " meses y " + añoDif + " años.");
    
    }    
}
