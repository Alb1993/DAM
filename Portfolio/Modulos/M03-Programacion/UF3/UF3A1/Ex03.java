package UF3A1;

import java.io.File;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ruta = introRuta(in);
        File carpeta = new File(ruta);
        if(carpeta.canWrite()&& carpeta.canRead()){
            System.out.println("La carpeta " + carpeta + " tiene permisos de lectura y escritura.");
        }else if(carpeta.canWrite()){
            System.out.println("La carpeta " + carpeta + " tiene permisos de escritura.");
        }else if(carpeta.canRead()){
            System.out.println("La carpeta " + carpeta + " tiene permisos de lectura.");
        }else{
            System.out.println("La carpeta " + carpeta + " no tiene permisos de lectura y escritura.");
        }
       
    
    
    }

    private static void List(String carpeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String introRuta(Scanner in){
        String ruta=in.nextLine();
    return ruta;
    }


    
}
