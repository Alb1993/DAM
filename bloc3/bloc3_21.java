package bloc3;

import java.util.Scanner;

public class bloc3_21 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char n1, n2;
        boolean esPalindromo = true;
        int longitud, j, i=0;
        
        String palabra;
        
        System.out.println("intro palabra:");
        palabra=in.nextLine();
        longitud=palabra.length();
        j=longitud-1;
        
        while((esPalindromo==true)&&(i<j)){
            if(palabra.charAt(i)==(palabra.charAt(j))){
            i++;
            j--;    
            }else{
            esPalindromo=false;
            }
        }
        
        if(esPalindromo==true){
        System.out.println("La palabra " + palabra + " es palindromo.");
        }else{
        System.out.println("La palabra " + palabra + " no es palindromo.");        
        }
    }
}

