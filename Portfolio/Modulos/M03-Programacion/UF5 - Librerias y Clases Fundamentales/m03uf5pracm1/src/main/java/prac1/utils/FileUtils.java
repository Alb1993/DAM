package prac1.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author FpShare
 */
public class FileUtils {

    /**
     * *
     * Si la URL és basura de tipus Windows, elimina el nom de la unitat
     *
     * @param url
     * @return
     */
    
    public static String normalizeURLFormat(String url) {
        String ret = "";

        if (IdentificaOS.getOS() == IdentificaOS.TipusOS.WIN) {
            ret = url.replace("[A-Z]{1}:", "");
        }

        return ret;
    }

    /**
     * *
     * Retorna la ruta al MP3 de prova La ruta es torna en format URL.
     *
     * P.ex:
     *
     * Si s'executa sobre Windows, ho retorna en el format:
     * file:/C:/Users/abcd1234/Documents/NetBeansProjects/m03uf5prac1_22_23_enunciat/target/classes/sounds/test_sound.mp3
     * Si s'executa sobre Linux, ho retorna en el format:
     * file:/home/manel/NetBeansProjects/m03uf5prac1_22_23_enunciat/target/classes/sounds/test_sound.mp3
     *
     * https://en.wikipedia.org/wiki/File_URI_scheme
     *
     * @param instance instància des de la qual es crida (this)
     * @return
     */
    /*public static String getTestMP3(Object instance) {
        return instance.getClass().getClassLoader().getResource("sounds/test_sound.mp3").toString();
    }*/

    /**
     * *
     * Retorna una icona
     *
     * @param instance
     * @param nom
     * @return
     */
    public static String getIcona(Object instance, String nom) {
        return instance.getClass().getClassLoader().getResource("icons/" + nom).toString();
    }

    /**
     * *
     * Permet seleccionar un fitxer MP3 d'una unitat de disc
     *
     * @return
     * @throws java.io.FileNotFoundException
     */
    public static File getMP3Fromfile() throws FileNotFoundException, IOException {
        Stage stage1 = new Stage();
        FileChooser filechooser1 = new FileChooser();
        filechooser1.setTitle("Seleccionar fixter MP3");
        File ficheroMP3 = filechooser1.showOpenDialog(stage1);
        return ficheroMP3;
    }

}
