package UF2AI;

import java.util.Scanner;

public class P2 {
    
    public static Scanner in = new Scanner(System.in); 
    public static Scanner inNum = new Scanner(System.in); 
    public static Scanner inFlo = new Scanner(System.in); 
    public static Scanner inLine = new Scanner(System.in); 
    
    public static float a=0;
    public static int b=0;
    public static int perimetre=0;
    public static int superficie=0;
    public static String opcion="";
    public static String caracter = "";
    
    public static boolean salir = false;
    
    public static void main(String[] args) {
        
        introFigura();
        
    }  
    
    public static void introFigura(){
        do{
        opcion=inLine.nextLine();

            switch(opcion) {
                case "q":
                    quadrat();
                    break;
                case "r":    
                    rectangle();
                    break;
                case "t":    
                    triangleIsosceles();
                    break;
                case "c":   
                    cercle();
                    break;
                case "s":    
                    salir = true;
            }       
        }while(!salir);
        if(salir == true){
            System.exit(0);
        }
    }   
    
    public static void quadrat(){
        
        a=inFlo.nextFloat();
        perimetre=a*4;
        superficie=a*a;
        imprimirResultado(figura, resultado, resultado2);
        
    }
    
    public static void rectangle(){
    
        resultado=a-b;
        muestraResultado(a, b, resultado);
        
    }

    public static void triangleIsosceles(){
        
        resultado=a*b;
        muestraResultado(a, b, resultado);
        
    }    
        
    public static void cercle(){
 
        resultado=a/b;
        
        if((a == 0)||(b == 0)){
            System.out.println("No se puede dividir por 0.");
        }else{
            muestraResultado(a, b, resultado);
        }
    }    

    public static void muestraResultado(int a, int b, int resultado){
        
        System.out.println(a + " " + opcion + " " + b + " = " + resultado);
    
    }
    
}

