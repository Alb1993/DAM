package UF3A1;

import java.io.File;

public class Ex05 {
    
    public static void main(String[] argv) {

    	// Define the file Path
        final String FILE_NAME = "/tmp/FileSize.tmp";
        
        // Define the file Object
        File myFile = new File(FILE_NAME);
        
        // Get the size of the file
        long size = myFile.length();
        
        // Write the size in the output.
        System.out.println(FILE_NAME + " size = " + size + " bytes");
    }
}
