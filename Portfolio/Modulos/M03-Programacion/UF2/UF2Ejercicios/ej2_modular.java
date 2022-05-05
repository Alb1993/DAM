package Uf2modular;

import java.util.Scanner;

public class ej2_modular {

    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {    
    int numero1=0, numero2=0;
        
    System.out.println("Intro numero 1");    
    numero1=in.nextInt();
    System.out.println("Intro numero 1");    
    numero2=in.nextInt();
    
    sumavalores(numero1, numero2);
    }
    
    public static void sumavalores(int numero1, int numero2){
        int resultado=0;
        resultado=numero1+numero2;
        muestraresultado(resultado);
        
    
    }
    
    public static void muestraresultado(int resultado){
    
    System.out.println("El resultado es " + resultado);
    
    
    }
    
    
    
}
