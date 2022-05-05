package UF2A2P2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = introNumero(in);
        in.nextLine();
        int contador = 0;
        String[] pais = new String[num];
        for(int i=0; i<pais.length;i++){
            pais[i]=introPais(in);
        }
        String busqueda=introBusqueda(in);
        int encontrado=busquedaBinaria(pais,busqueda,contador);
        muestraResultado(contador,encontrado);
    }
    
    public static int introNumero(Scanner in){
    int numero=in.nextInt();
    return numero;
    }

    public static String introPais(Scanner in){
        String pais=in.nextLine();
    return pais;
    }
    
    public static String introBusqueda(Scanner in){
        
        String busqueda=in.nextLine();
    return busqueda;
    }
    
    public static int busquedaBinaria(String[] pais, String busqueda,int contador){
        int posicion = -1;
        int posicionFinal = pais.length - 1; //derecha
        int posicionInicial = 0;            //izquierda
        while (posicionInicial <= posicionFinal) { 
            //Cambiamos la posicion a la media entre la posicion inicial i la final.
            posicion = (int) Math.floor((posicionInicial + posicionFinal) / 2);
            //Guardamos en un String aparte el contenido de pais en posicion.
            String elementoPosicion = pais[posicion];
            //El metodo CompareTo nos devolvera un numero dependiendo de si dos cadenas son iguales o no.
            //Lo compararemos con el valor que le hemos pasado al String busqueda.
            int resultadoComparacion = busqueda.compareTo(elementoPosicion);
            //En el caso de que sea 0 significa que son iguales.
            if (resultadoComparacion == 0) {
                contador = contador + 1;
                System.out.println("Total passades: " + contador);
                //Si son iguales devolvemos la posicion.
                return posicion;
            //Si es < 0 significa que la primera cadena va antes que la segunda.
            } else if(resultadoComparacion < 0){
                contador = contador+1;
                //Cambiamos la posicion de la derecha para acotar hacia el centro.
                posicionFinal= posicion-1;
            } else{
                contador=contador+1;
                //Cambiamos la posicion izquierda.
                posicionInicial=posicion+1;
            }
        
        }
        System.out.println("Total passades: " + contador);
        return -1;
    }
    
    public static void muestraResultado(int contador, int encontrado){
        /* En caso de que el valor de encontrado no haya cambiado de valor i sea -1, quiere decir que
        no ha encontrado nada. */
        if(encontrado == -1){
            System.out.println("No trobat");
        }else{
            System.out.println("Trobat a la posició: " + encontrado);
        }
    
    }
    
    
    
}
