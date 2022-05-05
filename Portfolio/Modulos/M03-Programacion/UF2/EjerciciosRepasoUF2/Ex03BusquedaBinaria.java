package EjerciciosRepasoUF2;

import java.util.Scanner;

public class Ex03BusquedaBinaria {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Intro numero casos");
        int numero=introNumero(in);
        int[] arrayInt = new int[numero];
        for(int i=0; i<arrayInt.length;i++){
            System.out.println("array num " + i);
            arrayInt[i]=introNumero(in);
        }
        in.nextLine();
        System.out.println("busqueda");        
        int busqueda=introNumero(in);
        in.nextLine();
        int posicion=busquedaBinaria(busqueda,arrayInt);
        muestraResultado(posicion);
    }    
    
    public static int introNumero(Scanner in){
        int num=in.nextInt();
    return num;
    }
    
    public static int busquedaBinaria(int busqueda, int[] arrayInt){
        int posicion=-1;
        int posicionIzquierda=0;
        int posicionDerecha=arrayInt.length-1;
        while(posicionIzquierda<=posicionDerecha){
            //Cambiamos el valor de posicion a la media de izquierda i derecha.
            posicion=(int)Math.floor((posicionIzquierda+posicionDerecha)/2);
            //guardamos el valor que se encuentra en posicion en una variable.
            int elemento=arrayInt[posicion];
            //Aqui comparamos el valor en posicion junto al valor busqueda.
            //Si son iguales devolvemos posicion
            if(busqueda == elemento){
                return posicion;
            }else if(busqueda>elemento){
            posicionDerecha=posicion-1;
            }else{
            posicionIzquierda=posicion+1;
            }
        }        
    return -1;
    }
    
    public static void muestraResultado(int posicion){
        if(posicion==-1){
            System.out.println("Numero no encontrado");
        }else{
            System.out.print("El numero se encuenta en la posicion " + posicion);
        }
    }   
}
