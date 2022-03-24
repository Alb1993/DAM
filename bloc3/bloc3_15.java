package bloc3;

import java.util.Scanner;

public class bloc3_15 {
    
    public static void main(String[] args) {    

        Scanner in = new Scanner(System.in);
        String nombre, nombre2, mayus, minus;
        int n1=0, n2=0;
        char e2;
        boolean igual=true;
        
        System.out.println("Introduce tu nombre:");
        nombre = in.nextLine();
        System.out.println("Hola " + nombre + ".");
        n1=nombre.length();
        System.out.println("la longitud del nombre es de " + n1 + " caracteres.");
        e2=nombre.charAt(2);
        System.out.println("la tercera letra del nombre es la " + e2 + ".");
        System.out.println("Introduce un segundo nombre:");
        nombre2 = in.nextLine();
        
        
            
        if(nombre.equals(nombre2)){
        igual=true;
        }else{
        igual=false;
        }
            
        if(igual==true){
        System.out.println("Los dos nombres son iguales.");
        }else{
        System.out.println("Los dos nombres son diferentes.");
        }
        mayus=nombre.toUpperCase();
        minus=nombre2.toLowerCase();
        System.out.println("El primer nombre en mayusculas es: " + mayus);
        System.out.println("El segundo nombre en minusculas es: " + minus); 
    }
}
