package UF3A1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex09 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String ruta=introRuta(in);
        File carpeta = new File(ruta);
        File fichero = new File(ruta);
        if(!carpeta.exists()){
            carpeta.mkdir();
            System.out.println("Fichero creado.");
            fichero.createNewFile();
        }else{
            fichero.delete();
            carpeta.delete();
        System.out.println("Fichero y carpeta borrados");
        }
    }
    
    public static String introRuta(Scanner in){
    String ruta=in.nextLine();
    return ruta;
    }
    
    
}
