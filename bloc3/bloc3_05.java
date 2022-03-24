package bloc3;

import java.util.Scanner;

public class bloc3_05 {

    public static void main(String[] args) {    

        Scanner in = new Scanner(System.in);
        int num = 2, mult = 1, resultado = 0;
        
        do
            while(mult<11){
            resultado = num * mult;
            System.out.print(num + " x " + mult + " = " + resultado + "\n");
            mult++;
            }
        while (num<11);
        
    }
}


