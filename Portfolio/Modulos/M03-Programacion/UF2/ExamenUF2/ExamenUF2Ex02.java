package EjerciciosRepasoUF2;
import java.util.ArrayList;
import java.util.Scanner;



public class ExamenUF2Ex02 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomsComplets = new String[8]; 
        for(int i=0;i<nomsComplets.length;i++){
            System.out.println("intro nombre " + i);
            nomsComplets[i] = introNom(in);
        }
        for(int i=0;i<nomsComplets.length;i++){
            nomsComplets[i]=introNom(in);
        }
        in.nextLine();
        ordenaBombolla(nomsComplets);
        mostraNoms(nomsComplets);
    }
    
    
    public static String introNom(Scanner in){
        String nom=in.nextLine();
    return nom;
    }
    
    public static String[] ordenaBombolla(String[] nomsComplets){
        for(int i=0; i<nomsComplets.length;i++){
            for(int j=0;j<nomsComplets.length;j++){
                if(nomsComplets[j].compareTo(nomsComplets[j+1]) > 0){
                    String aux = nomsComplets[j];
                    nomsComplets[j] = nomsComplets[j+1];
                    nomsComplets[j+1]=aux;
                }
            }
        }
    return nomsComplets;
    }

    public static void mostraNoms(String[] nomsComplets){
        System.out.println("Llista de noms: ");
        for(int i=0;i<nomsComplets.length;i++){
        System.out.println(i + ": " + nomsComplets[i]);
        }
    }

}
