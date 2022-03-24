package bloc2;

import java.util.Scanner;

public class Bloc2_15 {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);    
        float n1;
                    
        System.out.println("introduce una nota:");
        n1 = in.nextFloat();
            
        if (n1 < 4.99){
        System.out.println("La nota es un Suspenso");
        }else if (n1 < 5.99){
        System.out.println("La nota es un Suficiente");
        }else if (n1 < 7.99){
        System.out.println("La nota es un Notable");
        }else{
        System.out.println("La nota es un Excelente");
        }
    }
}
