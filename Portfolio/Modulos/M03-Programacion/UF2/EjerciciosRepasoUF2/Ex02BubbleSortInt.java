package EjerciciosRepasoUF2;

import java.util.Scanner;

public class Ex02BubbleSortInt {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=introNum(in);
        int[] arrayInt = new int[num];
        for(int i=0; i<arrayInt.length;i++){
            arrayInt[i]=introNum(in);
        }
        ordenaBubble(arrayInt);
        muestraResultado(arrayInt);
    }
    
    public static int introNum(Scanner in){
        int num=in.nextInt();
    return num;    
    }
    
    public static int[] ordenaBubble(int[] arrayInt){
        for(int i=0; i<arrayInt.length;i++){
            for(int j=0;j<arrayInt.length-1;j++){
                //Aqui miraremos si el numero izquierdo es mayor que el derecho.
                if(arrayInt[j] > arrayInt[j+1]){
                    //Si esta condicion se cumple cambiaremos las posiciones 
                    //con el enroque.
                    int aux=arrayInt[j];
                    arrayInt[j]=arrayInt[j+1];
                    arrayInt[j+1]=aux;
                }
            }
        }        
    return arrayInt;    
    }
    
    public static void muestraResultado(int[] arrayInt){
        for(int i=0; i<arrayInt.length;i++){
            System.out.print(arrayInt[i] + " ");
        }
    }
    
}
