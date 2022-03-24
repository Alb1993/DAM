package bloc2;

import java.util.Scanner;

public class Bloc2_13 {
 
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);    
        int n1=0, n2=0, n3=0;
        
        
        System.out.println("Intrduce numero 1:");
        n1=in.nextInt();
        System.out.println("Intrduce numero 2:");
        n2=in.nextInt();
        System.out.println("Intrduce numero 3:");
        n3=in.nextInt();  
        
        if(n1>n2){
            if(n1>n3){
            System.out.println("El primer numero es " + n1 + " el segundo es " + n3 + " y el tercero es " + n2 + ".");
            }else{
            System.out.println("El primer numero es " + n3 + " el segundo es " + n1 + " y el tercero es " + n2 + ".");
            }
        }else{
            if(n2>n3){
            System.out.println("El primer numero es " + n2 + " el segundo es " + n3 + " y el tercero es " + n1 + ".");
            }else{
            System.out.println("El primer numero es " + n3 + " el segundo es " + n2 + " y el tercero es " + n1 + ".");
            }
        
        }
    
    
    
    
    }
}
