package bloc3;

import java.util.Scanner;

public class bloc3_11 {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n1=0, n2=1;
        System.out.println("Introduce numero:");
        n1=in.nextInt();
        for (int i=1;i<=n1;i++){
        n2=n2*i;    
        }    
        System.out.println("El numero factorial es: " + n2);
    }
}
