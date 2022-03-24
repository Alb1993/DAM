package bloc2;

import java.util.Scanner;

public class Bloc2_8 {
    
      public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a=0, b=0, c=0, resultado=0;
        
        System.out.println("Sabiendo que tenemos la equacion 3x2 - 5x + 2 = 0:");
        
        System.out.println("intro valor x:");
        a=in.nextInt();
        System.out.println("intro valor y:");
        b=in.nextInt();
        System.out.println("intro valor z:");
        c=in.nextInt();
        
        if((a==3)&&(b==-5)&&(c==2)){
        System.out.println("Esa era la respuesta.");
        }
        else{
        System.out.println("Te has equivocado, intentalo otra vez.");
        }
    }
}
