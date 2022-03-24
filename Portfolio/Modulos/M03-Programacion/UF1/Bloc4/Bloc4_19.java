package Bloc4;

import java.util.Scanner;

public class Bloc4_19 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int horas = 0;
        char cambio = 0;
        double salario = 30, salTot=0;

        System.out.println("Introduce horas semanales: ");
        horas=in.nextInt();
        
        System.out.println("Introduce el turno");
        cambio=in.next().charAt(0);
        
        if(cambio=='M'){
            salTot=salario*horas;
            if(salTot<700){
            salTot=salTot+(salTot*0.08);
            System.out.println("El salario total es " + salTot);
            }else if(salTot<1100){
            salTot=salTot+(salTot*0.1);
            System.out.println("El salario total es " + salTot);            
            }else if(salTot>1100){
            salTot=salTot+(salTot*0.12);            
            System.out.println("El salario total es " + salTot);
            }
        
        }else if(cambio=='T'){
            salTot=(salario*1.2)*horas;
            if(salTot<700){
            salTot=salTot+(salTot*0.08);
            System.out.println("El salario total es " + salTot);
            }else if(salTot<1100){
            salTot=salTot+(salTot*0.1);            
            System.out.println("El salario total es " + salTot);
            }else if(salTot>1100){
            salTot=salTot+(salTot*0.12);            
            System.out.println("El salario total es " + salTot);
            }
        }else if(cambio=='N'){
            salTot=(salario*1.5)*horas;
            if(salTot<700){
            salTot=salTot+(salTot*0.08);
            System.out.println("El salario total es " + salTot);
            }else if(salTot<1100){
            salTot=salTot+(salTot*0.1);            
            System.out.println("El salario total es " + salTot);
            }else if(salTot>1100){
            salTot=salTot+(salTot*0.12);            
            System.out.println("El salario total es " + salTot);
            }
        }else{
            System.out.println("Cambio no valido.");
        }
    }
    
}
