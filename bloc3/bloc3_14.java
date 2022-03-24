package bloc3;

import java.util.Scanner;

public class bloc3_14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1=0;
        System.out.println("Introduce numero del mes:");
        n1=in.nextInt();
        
        if(n1<=7){
            if(n1%2!=0){
            System.out.println("El mes tiene 31 dias.");  
            }else{
                if(n1==2){
                System.out.println("El mes tiene 28 dias.");                 
                }else{
                System.out.println("El mes tiene 30 dias."); 
                }
            }
        }else{
            if(n1%2==0){
            System.out.println("El mes tiene 31 dias.");
            }else{
            System.out.println("El mes tiene 30 dias."); 
            } 
        } 
    }
}

