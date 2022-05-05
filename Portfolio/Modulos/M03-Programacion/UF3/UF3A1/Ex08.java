package UF3A1;

import java.io.File;
import java.util.Scanner;



public class Ex08{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ruta = introRuta(in);
        File file = new File(ruta);
        String directory = file.getAbsoluteFile().toString();
        //Mostrar ruta Absoluta
        System.out.println("Ruta Absoluta: " + directory);
        //Mostrar Tamaño
        System.out.println("Tamaño del archivo: " + file.length());
        //Mostrar ultima fecha de modificacion.
        System.out.println("Ultima Fecha de modificacion: " + file.lastModified());
        
        
        
        
    }

    public static String introRuta(Scanner in){
    String ruta=in.nextLine();
    return ruta;
    }
    


}
