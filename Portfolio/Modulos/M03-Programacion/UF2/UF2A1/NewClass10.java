package UF2AI;

import java.util.Scanner;
import java.lang.Math;

public class NewClass10 {

    public static String figura="";
    public static double volum=0;
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
            opcion=opcion.toLowerCase();    
            switch(opcion) {
                case "c":
                    cilindre();
                    break;
                case "h":
                    hexaedre();
                    break;
                case "t":
                    tetraedre();
                    break;
                case "e":
                    esfera();
                    break;
                case "s":
                    salir = true;
                    break;
                default:
                    
            }
            
        }while(!salir);
        
        in.close();
        System.exit(0);
        
    }
    
    public static void cilindre(){
        
        int r=0, h=0;
        r=in.nextInt();
        h=in.nextInt();
        figura="Cilindre";
        superficie=2*Math.PI*r*h;
        volum=Math.PI*Math.pow(r, 2)*h;
        muestraResultado();
        
    }
    
    public static void hexaedre(){
        
        double c=0;
        c=in.nextDouble();        
        figura="Hexaedre";
        superficie=12*c;
        volum=Math.pow(c, 3);
        muestraResultado();
    
    }
    
    public static void tetraedre(){
        
        double aresta=0;
        aresta=in.nextDouble();
        figura="Tetraedre";
        superficie=Math.sqrt(3)*Math.pow(aresta, 2);
        volum=Math.sqrt(2)*Math.pow(aresta,3)/12;
        muestraResultado();
        
    }
    
    public static void esfera(){
        
        double r=0;
        r=in.nextDouble();
        figura="Esfera";
        superficie=4*Math.PI*Math.pow(r,2);
        volum=(4*Math.PI*Math.pow(r,3))/3;
        muestraResultado();
        
    }
    
    public static void muestraResultado(){
        
        System.out.println("==" + figura + "==");
        System.out.format("Superfície : %.2f", superficie);
        System.out.println("");
        System.out.format("Volum: %.2f", volum);
        System.out.println("");
    }
    
}




