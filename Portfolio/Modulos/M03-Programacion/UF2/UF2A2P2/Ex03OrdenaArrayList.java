package UF2A2P2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex03OrdenaArrayList {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPais = introNumero(in);  
        ArrayList<String> pais = new ArrayList<String>();
        in.nextLine();
        for(int i=0;i<numPais;i++){
            introPais(in,pais);
        }
        Collections.sort(pais);
        muestraResultado(pais);
    }
    public static int introNumero(Scanner in){
        int numPais=in.nextInt();
    return numPais;
    }
    public static ArrayList<String> introPais(Scanner in, ArrayList<String> pais){
        String nombrePais = " ";
        nombrePais=in.nextLine();
        pais.add(nombrePais);
    return pais;
    }
    
    public static void muestraResultado(ArrayList<String> pais){
        System.out.println("Països ordenats:");
        for(int i=0; i<pais.size();i++){
            System.out.println(pais.get(i));
        }
    }
    
}

