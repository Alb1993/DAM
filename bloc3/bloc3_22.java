package bloc3;

import java.util.Scanner;

public class bloc3_22 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String correo;
        boolean arroba=false;
        int longitud, j, i=0;
        
        System.out.println("introduce correo electronico: ");
        correo = in.nextLine();
        longitud=correo.length();
        j=longitud-1;
        
        while((arroba==false)&&(i<j)){
            if(correo.charAt(i)=='@'){
            arroba=true;
            }else{
            i++;
            }
        }
        if(arroba==true){
        System.out.println("El correo " + correo + " tiene una letra @ dentro.");
        }
        else{
        System.out.println("El correo " + correo + " no tiene una letra @ dentro.");        
        }
    }
}
