package UF3A1;

import java.io.File;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String sCarpAct = introRuta(in);
    File carpeta = new File(sCarpAct);
    String[] listado = carpeta.list();
        if (listado == null || listado.length == 0) {
        System.out.println("No hay elementos dentro de la carpeta actual");
        return;
        }else{
            for (int i=0; i< listado.length; i++) {
                System.out.println(listado[i]);
            }
        }    
    }
    
    public static String introRuta(Scanner in){
        String ruta = in.nextLine();
    return ruta;
    }
   
}