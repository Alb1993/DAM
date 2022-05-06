package UF2A2P2;

import java.util.Scanner;

public class EX01Resolucion {
    /* Fes un programa que demani un valor N i, a continuació, N països.
El programa tornarà els països ordenats pel mètode de la bombolla. 
Per fer-ho, crearem el mètode:
static XXXX ordenaBombolla(YYYY paisos)

On XXXX  seran els tipus de retorn i YYYY el del paràmetre del mètode que omplireu vosaltres.

INPUTS

5
França
Portugal
Suècia
Estats Units
Itàlia
*/
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPais = introNumero(in);  
        String[] pais = new String[numPais];
        in.nextLine();
        for(int i=0;i<pais.length;i++){
            pais[i]=introPais(in);
        }
        ordenaBurbuja(pais);
        muestraResultado(pais);
    }
    public static int introNumero(Scanner in){
        int numPais=in.nextInt();
    return numPais;
    }
    public static String introPais(Scanner in){
        String nombre = " ";
        nombre=in.nextLine();
    return nombre;
    }
    public static String[] ordenaBurbuja(String[] pais){
        for(int i=0; i<pais.length-1; i++){
            for(int j=0; j<pais.length-1; j++){
                if(pais[j].compareTo(pais[j+1])>0){
                    String auxiliar=pais[j];
                    pais[j]=pais[j+1];
                    pais[j+1]=auxiliar;
                }
            }
        }    
    return pais;
    }
    
    public static void muestraResultado(String[] pais){
        System.out.println("Països ordenats:");
        for(int i=0; i<pais.length;i++){
            System.out.println(pais[i]);
        }
    }
    
}

