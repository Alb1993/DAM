package bloc2;

import java.util.Scanner;
import java.lang.Math;

public class Bloc2_10 {

    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        int opcion=0;
        double areaCua=0, areaRec=0, c1=0, c2=0, r1=0, areaCir=0, a1=0, areaCil=0;
        
        System.out.println("Tenemos estas figuras geometricas");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Cilindro");
        System.out.println("Que quieres calcular?");
        opcion=in.nextInt();
        
        if(opcion==1){
        System.out.println("Introduce la longitud del costado: ");
        c1 = in.nextDouble();
        areaCua=Math.pow(c1,2);
        System.out.println("El area del cuadrado es: " + areaCua + " centimetros.");   
        }
        else if (opcion==2){
        System.out.println("Introduce la longitud del costado 1: ");
        c1 = in.nextDouble();
        System.out.println("Introduce la longitud del costado 2: ");
        c2 = in.nextDouble();
        areaRec=c1*c2;
        System.out.println("El area del rectangulo es: " + areaRec + " centimetros.");
        }
        else if (opcion==3){
        System.out.println("Introduce el radio del circulo: ");
        r1= in.nextDouble();
        areaCir=Math.PI*Math.pow(r1,2);
        System.out.println("El area del circulo es de " + areaCir + " centimetros.");
        }
        else if (opcion==4){
        System.out.println("Introduce el radio del cilindro:");
        r1=in.nextDouble();
        System.out.println("Introduce la altura del cilindro:");
        a1=in.nextDouble();
        areaCil=2*Math.PI*(r1)*(a1)+2*Math.PI*Math.pow(r1,2);
        System.out.println("El area del cilindro es: " + areaCil + " centimetros.");
        }
        else{
        System.out.println("Opcion no valida.");
        }
       
            




    }    
}
