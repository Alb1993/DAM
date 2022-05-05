package UF2AI;

import java.util.Scanner;
import java.lang.Math;

public class NewClass4 {

    
    public static String figura="";
    public static double perimetre=0;
    public static double superficie=0;
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
         
        introFigura();
        
    }  

    public static void introFigura(){
        
        String opcion = "";
        boolean salir = false;
        
        do{
            opcion=in.next();
            if(opcion.equals("s")){
                salir = true;
            }
            else{
            opcion=opcion.toLowerCase();
            switch(opcion) {
                case "q":
                    quadrat();
                    break;
                case "r":
                    rectangle();
                    break;
                case "t":
                    triangle();
                    break;
                case "c":
                    cercle();
                    break;
                default:
                    System.out.println("[ERROR] Opción no válida. Elegir entre: 'q', 'r', 't', 'c' o 's'.");
                }
            }
        }while(!salir);
        
        in.close();
        System.exit(0);
        
    }
    
    public static void quadrat(){
        
        int costado=0;
        costado=in.nextInt();
        figura="Quadrat";
        superficie=costado*costado;
        perimetre=costado*4;
        muestraResultado();
        
    }
    
    public static void rectangle(){
        
        double base=0, altura=0;
        base=in.nextDouble();
        altura=in.nextDouble();        
        figura="Rectangle";
        perimetre=2*(base + altura);
        superficie=base*altura;
        muestraResultado();
    
    }
    
    public static void triangle(){
        double lado=0, base=0, altura=0;
        lado=in.nextDouble();
        base=in.nextDouble();
        altura=Math.sqrt(Math.pow(lado, 2)-(Math.pow(base, 2)/4));
        figura="Triangle Isòsceles";
        perimetre=2*lado+base;
        superficie=base*altura/2;
        muestraResultado();
        
    }
    
    public static void cercle(){
        
        double r=0;
        r=in.nextDouble();
        figura="Cercle";
        perimetre=2*Math.PI*r;
        superficie=Math.PI*Math.pow(r,2);
        muestraResultado();
        
    }
    
    public static void muestraResultado(){
        
        System.out.println("==" + figura + "==");
        System.out.format("Perímetre : %.2f", perimetre);
        System.out.println("");
        System.out.format("Superfície: %.2f", superficie);
        System.out.println("");
    }
    
}


