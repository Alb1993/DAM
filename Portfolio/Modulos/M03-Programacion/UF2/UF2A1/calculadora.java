package UF2AI;

import java.util.Scanner;

public class calculadora {
    
    public static int resultado=0;
    
    public static void main(String[] args) {
         
        introNumeros();
        
    }  
    
    public static void introNumeros(){
        
        Scanner in = new Scanner(System.in);     
        int a=0;
        int b=0;
        String caracter = "";
        String opcion="";
        boolean salir = false;
        
        
        do{
            if(!in.hasNextInt()){
                caracter = in.next();
                if(caracter.equals("S")){
                    salir = true;
                }
            }
            else{
                
                a=in.nextInt();
            }    
            
            b=in.nextInt();

            switch(in.nextLine()) {
                case "+":
                    opcion="+";
                    sumar(a, b, opcion);
                    break;
                case "-":    
                    opcion="-";
                    restar(a, b, opcion);
                    break;
                case "x":    
                    opcion="x";                    
                    multiplicar(a, b, opcion);
                    break;
                case "/":   
                    opcion="/";
                    dividir(a, b, opcion);
                    break;
            }
            
        }while(!salir);
        
        if(salir == true){
            System.exit(0);
        }
        
    }   
    
    public static void sumar(int a, int b, String opcion){
    
        resultado=a+b;
        muestraResultado(a, b, resultado, opcion);
        
    }
    
    public static void restar(int a, int b, String opcion){
    
        resultado=a-b;
        muestraResultado(a, b, resultado, opcion);
        
    }

    public static void multiplicar(int a, int b, String opcion){
        
        resultado=a*b;
        muestraResultado(a, b, resultado, opcion);
        
    }    
        
    public static void dividir(int a, int b, String opcion){
        
        if((a == 0)||(b == 0)){
            System.out.println("No se puede dividir por 0.");
        }else{
            resultado=a/b;
            muestraResultado(a, b, resultado, opcion);
        }
    }    

    public static void muestraResultado(int a, int b, int resultado, String opcion){
        
        System.out.println(a + " " + opcion + " " + b + " = " + resultado);
    
    }
    
}

