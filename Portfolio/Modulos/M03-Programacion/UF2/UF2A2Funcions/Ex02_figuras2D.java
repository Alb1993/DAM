package Uf2modular;

import java.util.Scanner;
import java.math.*;

public class Ex02_figuras2D {
    
    /*
    Que demani el tipus de figura 2D (quadrat, rectangle, triangle isòsceles o cercle)
    i a continuació demani les dades necessàries per a cadascun i en mostri el perímetre 
    i la superfície.
    */
    
    
    public static Scanner in = new Scanner(System.in); //Iniciamos el Scanner para Numeros.
    public static Scanner inDou = new Scanner(System.in); //Iniciamos el Scanner para Double.  
    public static double resultado=0;
    public static double resultado2=0;
    public static String figura="";
    public static double ancho=0;
    public static double longitud=0;
    public static double costado=0;
    public static void main(String[] args) {    
        int opcion=0;
        System.out.println("Elige una figura");
        System.out.println("1.Cuadrado");
        System.out.println("2.Rectangulo");
        System.out.println("3.Triangulo Isosceles");
        System.out.println("4.Circulo");
        opcion=in.nextInt();
        
        switch(opcion) {
            case 1: 
                calcularCuadrado();
                break;
            case 2:
                calcularRectangulo();
                break;
            case 3:
                calcularTriangulo();
                break;
            case 4:
                calcularCirculo();
                break;
        }
    }    
    public static void calcularCuadrado() {
        System.out.println("Introduce costado");
        costado=inDou.nextDouble();
        resultado=costado*4;
        figura="Cuadrado";
        resultado2=costado*costado;
        imprimirResultado(figura, resultado, resultado2);
    }
    public static void calcularRectangulo(){
        System.out.println("Introduce ancho");
        ancho=inDou.nextDouble();
        System.out.println("Introduce longitud");
        longitud=inDou.nextDouble();
        resultado=(ancho*longitud)*2;
        figura="Rectangulo";
        resultado2=ancho*longitud;
        imprimirResultado(figura, resultado, resultado2);
    }
    public static void calcularTriangulo(){
        System.out.println("Introduce ancho");
        ancho=inDou.nextDouble();
        System.out.println("Introduce longitud");
        longitud=inDou.nextDouble();
        System.out.println("Introduce costado");
        costado=inDou.nextDouble();
        resultado=(2*longitud)+ancho;
        figura="Triangulo Isosceles";
        resultado2=(ancho*longitud)/2;
                
        imprimirResultado(figura, resultado, resultado2);  
    }
    public static void calcularCirculo(){
        double radio=0;
        System.out.println("Introduce radio");
        radio=inDou.nextDouble();
        resultado=2*Math.PI*radio;
        figura="Circulo";    
        resultado2=Math.PI*(Math.pow(radio,2));
        imprimirResultado(figura, resultado, resultado2);    
    }
    public static void imprimirResultado(String figura, double resultado, double resultado2){
        
        System.out.println("El " + figura + " tiene un perimetro de " + resultado + " y una superficie de " + resultado2);            
    }
}
        
        
    

