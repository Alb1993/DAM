package EjerciciosRepasoUF2;

import java.util.Scanner;



public class Ex01OrdenaSeleccioString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = introNumero(in);
        String[] lineas = new String[numero];
        for(int i=0;i<lineas.length;i++){
            lineas[i]=in.nextLine();
        }
        ordenaSeleccion(lineas);
        muestraResultado(lineas);
    }

    public static int introNumero(Scanner in){
        int num = in.nextInt();
    return num;
    }

    public static String[] ordenaSeleccion(String[] lineas){
        for(int i=0;i<lineas.length;i++){
            int indice=i;
            for(int j=i+1;j<lineas.length;j++){
                if(lineas[j].compareTo(lineas[indice])>0){
                    indice=j;
                }
            }
            String aux=lineas[indice];
            lineas[indice]=lineas[i];
            lineas[i]=aux;
        }
    return lineas;    
    }

    public static void muestraResultado(String[] lineas){
        for(int i=0;i<lineas.length;i++){
            System.out.println(lineas[i]+" ");
        }
    }
    
}
