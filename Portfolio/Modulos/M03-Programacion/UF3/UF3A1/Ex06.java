package UF3A1;

import java.io.File;

public class Ex06 {

    public static void main(String args[]){
        File directorio = new File("c:/directorio");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado.");
            } else {
                System.out.println("Error al crear directorio");
            }
        }else{
        directorio.delete();
            System.out.println("Directorio borrado.");
        }
    }





    
}
