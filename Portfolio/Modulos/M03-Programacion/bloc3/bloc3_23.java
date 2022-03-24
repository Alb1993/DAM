package bloc3;

import java.util.Scanner;

public class bloc3_23 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase;
        
        System.out.println("Introduce una frase: ");
        frase=in.nextLine();
        
        System.out.println(frase.replace(" ",""));
    } 
}    

