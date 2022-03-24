package bloc3;

import java.util.Scanner;

public class bloc3_02 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int treballadors, hora, horaextra;
        double precio, precioextra, ganancia;
        
        System.out.println("intro num treballadors");
        treballadors = in.nextInt();        
        
        for(int i=0; i<treballadors; i++){ 
        System.out.println("intro hora:");
        hora = in.nextInt();
        System.out.println("intro precio por hora:");
        precio=in.nextDouble();
            if(hora<=40){
                ganancia=hora*precio;
            }
            else if(hora>40){
                precioextra=precio*1.5;
                horaextra=hora-40;
                ganancia=(40*precio)+(horaextra*precioextra);
                System.out.println("La ganancia semanal es de " + ganancia);
            }else{
            System.out.println("Trabajador no valido");
            i--;}
        }
    }    
}    
    

