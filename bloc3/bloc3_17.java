package bloc3;

import java.util.Scanner;

public class bloc3_17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n1="";
        int contA=0;
        
        System.out.println("Introduce frase:");
        n1=in.nextLine();
        
        for(int i=0; i<n1.length(); i++){
            if(n1.charAt(i)=='a'){
            contA=contA+1;
            }
        }
        System.out.println("La letra A ha salido " + contA + " veces.");
    }  
}
