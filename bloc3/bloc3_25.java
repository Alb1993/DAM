package bloc3;

import java.util.Scanner;

public class bloc3_25 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String numero="12345";
        String cadena="1a2dd2h";
        String numero1="";
        int numero2=0, res1=0;
        
        for(int i=0; i<numero.length(); i++){
            if ((numero.charAt(i)=='1')||(numero.charAt(i)=='2')||(numero.charAt(i)=='3')||(numero.charAt(i)=='4')||(numero.charAt(i)=='5')){
            numero1 = numero1 + numero.charAt(i) + " ";
            }
        }
        numero1 = numero1.replace(" ", "a");
        System.out.println(numero1);
        
        for (int j=0; j<cadena.length();j++){
            if((cadena.charAt(j)=='1')||(cadena.charAt(j)=='2')){
            numero2=numero2+cadena.charAt(j);
            }
        }
        res1=numero2*5;
        System.out.println(res1);
        
        




    }  
    
}

