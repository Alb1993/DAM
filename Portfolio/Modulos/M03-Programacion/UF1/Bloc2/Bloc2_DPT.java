package bloc2;

import java.util.Scanner;

public class Bloc2_DPT {
   
    public static void main(String[] args) {
    int VelocidadCoche, Tercero;
    
    Scanner in = new Scanner(System.in);
             
    System.out.println("Indique a que velocidad va el vehiculo:");
    
    
        VelocidadCoche = in.nextInt();
    
    //Distancia en metros
        int primero = 10 * 1000;

    //KMs/hora
        int VelocidadPermitida = 110;
        
    //Tiempo que pasa entre un semaforo y otro en segundos.
        var tercero = 300;
        
    if (VelocidadCoche > VelocidadPermitida + (VelocidadPermitida/5)){
        System.out.println("Puntos");
    }
        
    else if (VelocidadCoche > VelocidadPermitida){
        System.out.println("Multa");
        }
    
    else{
    System.out.println("Ok");
        }
    }
}