package UF2AI;

import java.util.Scanner;

public class figuras2D {
    
    public static void main(String[] args) throws Exception {
        introFigura();
    }

    public static void introFigura(){
        
        Scanner in = new Scanner(System.in);     
        String opcion = "";
        boolean salir = false;

        do {
            opcion = in.nextLine();

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
            }
        }while(!salir);

        in.close();
        System.exit(0);        
    }   
    
    public static void quadrat(){
       
        muestraResultado(a, b, resultado, opcion);
    }
    
    public static void restar(int a, int b, String opcion){
        resultado = a - b;
        muestraResultado(a, b, resultado, opcion);
    }

    public static void multiplicar(int a, int b, String opcion){
        resultado = a * b;
        muestraResultado(a, b, resultado, opcion);
    }    
        
    public static void dividir(int a, int b, String opcion){
        if (b == 0) {
            System.out.println("[ERROR] No se puede dividir por 0.");
        } else {
            resultado = a / b;
            muestraResultado(a, b, resultado, opcion);
        }
    }    

    public static void muestraResultado(int a, int b, int resultado, String opcion){
        System.out.println(a + " " + opcion + " " + b + " = " + resultado);
    }




    
}
