package Bloc4;

import java.util.Scanner;

public class Bloc4_5 {

    public static void main(String[] args) {  
    
        Scanner in = new Scanner(System.in);
        int par = 0, impar = 0;
        
        for(int i=1; i<20; i++){
            if(i%2==0){
            par=par*i;
            }else{
            impar=impar+i;
            }
        }
        System.out.println(par);
        System.out.println(impar);
    }
}