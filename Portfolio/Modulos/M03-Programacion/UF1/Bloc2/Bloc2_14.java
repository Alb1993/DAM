package bloc2;

import java.util.Scanner;

public class Bloc2_14 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);    

        int años;

        System.out.println("Introduce numero de años");

        años = in.nextInt();

        if((años % 4 == 0)&&(años % 100 != 0)||(años % 400 == 0)){
        System.out.println("el año es bisiesto");
        }else{
        System.out.println("el año no es bisiesto");
        }
    }    
}
