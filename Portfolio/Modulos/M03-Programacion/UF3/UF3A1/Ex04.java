package UF3A1;

import java.io.File;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ruta = introRuta(in);
        File carpeta = new File(ruta);
        if(carpeta.isFile()){
            System.out.println("Es un fichero.");
        }else if(carpeta.isDirectory()){
            System.out.println("Es una carpeta");
        }else{
            System.out.println("No es ni un fichero ni una carpeta");        
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

