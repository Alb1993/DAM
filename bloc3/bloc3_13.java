package bloc3;

import java.util.Scanner;

public class bloc3_13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1=0, n2=0, multiple=0;
        
        System.out.println("Introduce numero 1");
        n1=in.nextInt();
        System.out.println("Introduce numero 2");
        n2=in.nextInt();
        
        if(n1<n2){
            for(int i=n1;i<n2 ;i++){
                if(i%5==0){
                multiple=multiple + i;
                
                }
            }
        }
        
        else{
            for(int i=n2;i<n1 ;i++){
                if(i%5==0){
                multiple=multiple + i;
                
                }
            }        
        }
        System.out.println("La suma de los numeros multiples de 5 es " + multiple + ".");
    }    
}
