package Bloc4;

import java.util.Scanner;

public class Bloc4_7 {
    
    public static void main(String[] args) {  
    
        Scanner in = new Scanner(System.in);
        
        for (int i=0;i<100;i++){
            if ((i%2==0)||(i%5==0)){
            System.out.println(i);
            }
        }
    }
}