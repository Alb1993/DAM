package UF2A2P2;

import java.util.Scanner;

public class EX02OrdenaSeleccio {
    
    /*
    Fes un programa que demani un valor N i, a continuació, N temperatures.
    El programa tornarà les temperatures  ordenades pel mètode de la selecció (la segona versió vista a classe). 
    Per fer-ho, crearem el mètode:
        static XXXX ordenaSelecció2(YYYY vector)

    On XXXX  seran els tipus de retorn i YYYY el del paràmetre del mètode que omplireu vosaltres. 
    A més, mostrarem el total de passades que hem hagut de fer.

    INPUTS

    3   
    2.1
    7.9
    3.4     */
    
    public static void main(String a[]){
        Scanner in = new Scanner(System.in);
        int casos = introCasos(in); //intro numero de casos
        int cont=0;
        double[] arr1 = new double[casos];
        for(int i=0;i<arr1.length; i++){
            arr1[i] = introArray(in); //relleno array
        }
        doSelectionSort(arr1,cont);
    }
    
    public static void doSelectionSort(double[] arr,int cont){     
        for (int i = 0; i < arr.length - 1; i++){       //Recorremos array
            int index = i;                              //Guardo la posicion en la que me encuentro
            for (int j = i + 1; j < arr.length; j++) {  //Creo la variable j a partir de la siguiente posicion de i la que recorrera el resto de posiciones.
                cont=cont+1; 
                if (arr[j] < arr[index]) {              //Buscamos un numero mas pequeño que array[index]
                    index = j;                          
                }
            }
            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;   
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Total passades: " + cont);
    }
    
    public static double introArray(Scanner in){
        double numFloat=in.nextDouble();
    return numFloat;
    }
    
    public static int introCasos(Scanner in){
        int casos = in.nextInt();
    return casos;
    }
     
}

