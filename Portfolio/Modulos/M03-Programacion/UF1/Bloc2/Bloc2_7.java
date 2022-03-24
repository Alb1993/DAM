package bloc2;

import java.util.Scanner;

public class Bloc2_7 {
    

public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int n1;  
    System.out.println("introduce un numero:");
    n1 = in.nextInt();
    if (n1 / 2 == 0){
        if (n1 / 3 == 0){
            System.out.println("Este numero es divisible por 2 i por 3");
        }else{
            System.out.println("Este numero es divisible por 2");
           }
    }else if(n1 / 3 == 0){
        System.out.println("Este numero es divisible por 3, pero no es divisible por 2.");    
    }else{
        System.out.println("Este numero no es divisible por 2 ni por 3");
        }
    }    
}
