package EjerciciosRepasoUF2;

import java.util.Scanner;

public class Ex02BubbleSortString {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=introNumero(in);
        String[] arrayString = new String[num];
        for(int i=0; i<arrayString.length;i++){
            arrayString[i]=introString(in);
        }
        ordenaBurbuja(arrayString);
        muestraResultado(arrayString);
        
    }
    
    public static int introNumero(Scanner in){
        int numero=in.nextInt();
        return numero;
    }
    public static String introString(Scanner in){
        String linea=in.nextLine();
        return linea;
    }
    
    public static String[] ordenaBurbuja(String[] arrayString){
        for(int j=0; j<arrayString.length; j++){
            //Nota: segundo array aplicar -1.
            for(int i=0;i<arrayString.length-1;i++){
                if(arrayString[i].compareTo(arrayString[i+1]) > 0){
                String aux = arrayString[i];
                arrayString[i]=arrayString[i+1];
                arrayString[i+1]=aux;
                }
            }
        }
    return arrayString;    
    }
    
    public static void muestraResultado(String[] arrayString){
        for(int i=0; i<arrayString.length;i++){
        System.out.print(arrayString[i] + " ");
        }
    }
    
}
