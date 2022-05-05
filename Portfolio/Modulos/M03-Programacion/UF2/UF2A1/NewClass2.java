package UF2AI;

import java.util.Scanner;
import java.lang.Math;

public class NewClass2 {
    
    public static String figura="";
    public static float perimetre=0;
    public static float superficie=0;
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
         
        introFigura();
        
    }  

    public static void introFigura(){
        
        String opcion = "";
        boolean salir = false;
        
        do{
            opcion=in.next();
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
                case "s":
                    salir = true;
                default:
                    System.out.println("[ERROR] Opción no válida. Elegir entre: 'q', 'r', 't', 'c' o 's'.");
                }    
        }while(!salir);
        
        in.close();
        System.exit(0);
        
    }
    
    public static void quadrat(){
        
        int costado=0;
        costado=in.nextInt();
        figura="Quadrat";
        superficie=(float)(costado*costado);
        perimetre=(float)(costado*4);
        muestraResultado();
        
    }
    
    public static void rectangle(){
        
        double base=0, altura=0;
        base=in.nextDouble();
        altura=in.nextDouble();        
        figura="Rectangle";
        perimetre=(float) Math.floor(2*(base + altura));
        superficie=(float) Math.floor(base*altura);
        muestraResultado();
    
    }
    
    public static void triangle(){
        double lado=0, base=0, altura=0;
        lado=in.nextDouble();
        base=in.nextDouble();
        altura=Math.sqrt(Math.pow(lado, 2)-(Math.pow(base, 2)/4));
        figura="Triangle Isòsceles";
        perimetre=(float) Math.round(2*lado+base)*100/100;
        superficie=(float) Math.round(base*altura/2)*100/100;
        muestraResultado();
        
    }
    
    public static void cercle(){
        
        double r=0;
        r=in.nextDouble();
        figura="Cercle";
        perimetre=(float) Math.round(2*Math.PI*r*100)/100;
        superficie=(float) Math.round(Math.PI*Math.pow(r,2)*100)/100;
        muestraResultado();
        
    }
    
    public static void muestraResultado(){
        
        System.out.println("==" + figura + "==");
        System.out.println("Perimetre : " + perimetre);
        System.out.println("Superficie: " + superficie);
    
    }
    
}


