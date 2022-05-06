package UF2AI;

import java.util.Scanner;

public class Ex04_Random {

    /* Crea una funció que retorni un número enter aleatori entre dos números enters que introduirem per consola. 
    Per generar números aleatoris, podeu fer servir la classe Math.random(). */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int max=introNumero(in);
        int min=introNumero(in);
    int numero = (int) (Math.random() * max) + min;
        System.out.println(numero);
    
    }
    public static int introNumero(Scanner in){
        int num=in.nextInt();
        return num;
    }
    
}
