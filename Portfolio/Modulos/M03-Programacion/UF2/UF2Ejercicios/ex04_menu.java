package Uf2modular;

import java.util.Scanner;

public class ex04_menu {

    public static Scanner in = new Scanner(System.in); //Iniciamos el Scanner para Strings.
    public static int resultado=0;   
    
    public static void main(String[] args) {
    muestraMenu();    
        
    }public static void muestraMenu(){    
    int numero1=0, numero2=0, opcion=0;
        while(opcion!=5){
            while(numero1==0){
                System.out.println("intro numero 1");
                numero1=in.nextInt();
                if(in.hasNextInt(numero1)==false){
                    System.out.println("El valor introducido no es un numero");
                    numero1=0;
                }
            }
            while(numero2==0){
                System.out.println("intro numero 2");
                numero2=in.nextInt();
                if(in.hasNextInt(numero2)==false){
                    System.out.println("El valor introducido no es un numero");
                    numero2=0;
                }
            }
        System.out.println("Las opciones son:");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");        
        System.out.println("5.Salir");
        opcion=in.nextInt();
            switch(opcion) {
            case 1:
                sumarNumeros(numero1, numero2);
                break;
            case 2:
                restarNumeros(numero1, numero2);
                break;
            case 3:
                multiplicarNumeros(numero1, numero2);
                break;
            case 4:
                dividirNumeros(numero1, numero2);
                break;    
            }
        }   
    }   
        public static void sumarNumeros(int numero1,int numero2){
    
        resultado=numero1+numero2;
        imprimirResultado(resultado);
    }
    
        public static void restarNumeros(int numero1, int numero2){
    
        resultado=numero1-numero2;
        imprimirResultado(resultado);
    }
        public static void multiplicarNumeros(int numero1,int numero2){
    
        resultado=numero1*numero2;
        imprimirResultado(resultado);
    }    
        public static void dividirNumeros(int numero1,int numero2){
    
        resultado=numero1/numero2;
        imprimirResultado(resultado);
    }   public static void imprimirResultado(int resultado){
    
        System.out.println("El resultado es: " + resultado);
    }

    private static boolean isNumeric(String numerotest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

