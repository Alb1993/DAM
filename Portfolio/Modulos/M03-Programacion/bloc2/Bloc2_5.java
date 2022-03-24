package bloc2;

import java.util.Scanner;

public class Bloc2_5 {
    
    public static void main(String[] args) {   
    
        Scanner in = new Scanner(System.in);
        int importeIni = 0;
        double importeFin=0;
        
        System.out.println("Introduce un importe:");
        importeIni=in.nextInt();
        
        importeFin=importeIni-(importeIni*0.05);
        System.out.println("El importe con descuento aplicado es de " + importeFin + " euros.");
    
    
    
    }    
}
