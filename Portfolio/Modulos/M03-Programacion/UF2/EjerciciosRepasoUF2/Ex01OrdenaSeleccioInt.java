package EjerciciosRepasoUF2;

import java.util.Scanner;

public class Ex01OrdenaSeleccioInt {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero=introNumero(in);
        int[] arrayNumero = new int[numero];
        for(int i=0; i<arrayNumero.length; i++){
            arrayNumero[i]=introNumero(in);
        }
        ordenaSeleccion(arrayNumero);
    }
    
    public static int introNumero(Scanner in){
        int num = in.nextInt();
        in.nextLine();
    return num;
    }
    
    public static void ordenaSeleccion(int[] arrayNumero){
        //Hacemos un primer recorrido del array
        for(int i=0; i<arrayNumero.length-1; i++){
        //Guardamos la posicion como indice
            int indice=i;
            for(int j=i+1;j<arrayNumero.length; j++){
                if(arrayNumero[j]<arrayNumero[indice]){
                //Buscamos un numero mas pequeño que el que tenemos i guardaremos su posicion.
                    indice = j;
                }
            }
            //Usaremos el enroque de BubbleSort para intercambiar sus posiciones.
            int numeroPequeño = arrayNumero[indice];
            arrayNumero[indice]=arrayNumero[i];
            arrayNumero[i]=numeroPequeño;
        }
        
        for(int i=0; i<arrayNumero.length; i++){
            System.out.print(arrayNumero[i] + " ");
        }
        
    }
    
}
