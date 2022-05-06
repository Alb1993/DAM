
package Uf2modular;

import java.util.Scanner;

public class Ex03_MayorQue0{
    
    /*Crea una funció que retorni la suma de dos números. Aquests números els passarem per paràmetres.*/
    
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) { 
            
    introValor();
            
    }public static void introValor(){
    int valor1=0;        
    valor1=in.nextInt();
    compruebaValor(valor1);
    }public static void compruebaValor(int valor1){
        if(valor1>0){
            muestraValorPositivo(valor1);
        }else{
            muestraValorNegativo(valor1);
        }
        
    }public static void muestraValorPositivo(int valorPositivo){
        
        System.out.println("El valor " + valorPositivo + " es positivo.");
    
    }public static void muestraValorNegativo(int valorNegativo){

        System.out.println("El valor " + valorNegativo + " es negativo.");        
        
    }  
}