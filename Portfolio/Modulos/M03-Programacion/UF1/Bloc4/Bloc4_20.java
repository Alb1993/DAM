package Bloc4;

import java.util.Scanner;

public class Bloc4_20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean esFi=false;
        String nombre;
        int años=0, bonusTot1=0, bonusTot2=0, bonusTot3=0;
        
        while(esFi==false)
        {
            System.out.println("Introduce nombre trabajador:");
            nombre=in.nextLine();
        
            System.out.println("Introduce años trabajados:");
            años=in.nextInt();
            
            if(nombre == "FI"){
            esFi=true;
            }else{
                if ((años>3)&&(años<10)){
                bonusTot1=(años-3)*300;
                System.out.println("El bonus total del trabajador " + nombre + " es de " + bonusTot1 + " €.");
                }else if (años<15){
                bonusTot2=(7*300)+((años-10)*400);
                System.out.println("El bonus total del trabajador " + nombre + " es de " + bonusTot2 + " €.");
                }else if(años>15){
                bonusTot3=(7*300)+(5*400)+((años-15)*700);
                System.out.println("El bonus total del trabajador " + nombre + " es de " + bonusTot3 + " €.");
                }
            }
        }     
    }
}
