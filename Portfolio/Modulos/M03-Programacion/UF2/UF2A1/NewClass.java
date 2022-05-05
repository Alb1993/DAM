package UF2AI;

import java.util.Scanner;

public class NewClass {
    
    public static Scanner in = new Scanner(System.in); 
    public static Scanner inNum = new Scanner(System.in); 
    public static Scanner inLine = new Scanner(System.in); 
    public static Scanner inChar = new Scanner(System.in); 
    
    public static int numero1=0;
    public static int numero2=0;
    public static int resultado=0;
    public static String opcion="";
    public static String caracter = "";
    
    public static boolean salir = false;
    
    
    
    public static void main(String[] args) {
        
        introNumeros();
        
    }  
    
    public static void introNumeros(){
    
        do{
            if(!in.hasNextInt()){
                caracter = in.nextLine();
                if(caracter.equals("S")){
                    salir = true;
                }
            }
            else{
                numero1=in.nextInt();
            }    
            
            numero2=inNum.nextInt();

            opcion=inLine.nextLine();

            switch(opcion) {
                case "+":
                    sumaNumeros(numero1, numero2);
                    break;
                case "-":    
                    restaNumeros(numero1, numero2);
                    break;
                case "*":    
                    multiplicaNumeros(numero1, numero2);
                    break;
                case "/":   
                    divideNumeros(numero1, numero2);
                    break;
            }       
        }while(!salir);
        
        if(salir == true){
            System.exit(0);
        }
        
    }   
    
    public static void sumaNumeros(int numero1, int numero2){
    
        resultado=numero1+numero2;
        muestraResultado(numero1, numero2, resultado);
        
    }
    
    public static void restaNumeros(int numero1, int numero2){
    
        resultado=numero1-numero2;
        muestraResultado(numero1, numero2, resultado);
        
    }

    public static void multiplicaNumeros(int numero1, int numero2){
        
        resultado=numero1*numero2;
        muestraResultado(numero1, numero2, resultado);
        
    }
        
        
    public static void divideNumeros(int numero1, int numero2){
 
        resultado=numero1/numero2;
        
        if((numero1 == 0)||(numero2 == 0)){
            System.out.println("No se puede dividir por 0.");
        }else{
            muestraResultado(numero1, numero2, resultado);
        }
    }    

    public static void muestraResultado(int numero1, int numero2, int resultado){
        
        System.out.println(numero1 + " " + opcion + " " + numero2 + " = " + resultado);
    
    }
    
}
