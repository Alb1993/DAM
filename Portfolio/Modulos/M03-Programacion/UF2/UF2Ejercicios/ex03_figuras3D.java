package Uf2modular;

import java.util.Scanner;

public class ex03_figuras3D {
    
    public static Scanner in = new Scanner(System.in);    
    public static Scanner inDou = new Scanner(System.in);
    public static double resultado=0;    
    public static double resultado2=0;
    public static double altura=0;
    public static double radio=0;
    public static double area=0;
    public static String figura="";
    
    
    
    
    
    public static void main(String[] args) {    
        int opcion=0;
        System.out.println("Elige una figura");
        System.out.println("1.Cilindro");
        System.out.println("2.Hexaedro");
        System.out.println("3.Tetraedro");
        System.out.println("4.Esfera");
        opcion=in.nextInt();
        
        switch(opcion) {
            case 1: 
                calcularCilindro();
                break;
            case 2:
                calcularHexaedro();
                break;
            case 3:
                calcularTetraedro();
                break;
            case 4:
                calcularEsfera();
                break;
        }
    }public static void calcularCilindro(){
    System.out.println("Intro radio:");
    radio=inDou.nextDouble();
    System.out.println("Intro altura:");
    altura=inDou.nextDouble();
    figura="Cilindro";
    resultado2=Math.PI*Math.pow(radio,2)*altura;
    resultado=(2*Math.PI)*radio*altura+2*Math.PI*Math.pow(radio, 2);
    }public static void calcularHexaedro(){
    System.out.println("Intro Area:");
    area=inDou.nextDouble();
    figura="Hexaedro";
    resultado=6*Math.pow(area,2);    
    resultado2=Math.pow(area,3);
    }public static void calcularTetraedro(){
    System.out.println("intro area");
    area=inDou.nextDouble();
    figura="Tetraedro";
    resultado=Math.sqrt(3)*Math.pow(area, 2);
    resultado2=(Math.sqrt(2)/12)*Math.pow(area, 3);
    }public static void calcularEsfera(){
    System.out.println("Intro radio");
    radio=inDou.nextDouble();
    figura="Esfera";
    resultado=4*Math.PI*Math.pow(radio,2);
    resultado2=(4/3)*Math.PI*Math.pow(radio,3);
    imprimeResultado(figura,resultado,resultado2);
    }public static void imprimeResultado(String figura, double resultado, double resultado2){
    
    System.out.println("La figura " + figura + " tiene un perimetro de " + resultado + " y un volumen de " + resultado2);
    
    }
        
    
}
