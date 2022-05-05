package UF3A1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Ex10 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Intro Ruta:");        
        String ruta=introString(in);
        System.out.println("Intro Nuevo Nombre para carpeta:");
        String rutaCarpeta=introString(in);
        System.out.println("Intro Nuevo Nombre para archivo:");
        String rutaFichero=introString(in);
        File carpeta = new File(ruta);
        File fichero = new File(ruta);
        if(fichero.exists()){
            String nuevoNombre = introString(in);
            File archivo2 = new File(ruta + in.nextLine());
            File ficheroNuevo = fichero.renameTo(archivo2);
        }else if(carpeta.exists()){
            String nuevoNombre2 = introString(in);
            File archivo3 = new File(ruta + in.nextLine());
            File carpetaNueva = carpeta.renameTo(archivo3);
        }
    }
    
    public static String introString(Scanner in){
    String ruta=in.nextLine();
    return ruta;
    }
    
    
}
