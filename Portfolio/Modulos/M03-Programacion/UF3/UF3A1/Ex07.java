package UF3A1;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la ruta: ");
    String ruta = sc.nextLine();
    System.out.println("Escribe la extension: ");
    int tamaño=sc.nextInt();
    File carpeta = new File(ruta);
    String[] listado = carpeta.list();
    boolean valido = accept(listado,tamaño);
        if(valido){
            for (int i=0; i<listado.length; i++) {
                System.out.println(listado[i]);
            }
        }
    }
    
    public static boolean accept(String[] listado, int tamaño) {   
        if(listado.length>tamaño) {
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
}
