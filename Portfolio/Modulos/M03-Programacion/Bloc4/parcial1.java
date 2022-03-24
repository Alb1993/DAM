package Bloc4;

import java.util.Scanner;

public class parcial1 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner en = new Scanner(System.in);
        Scanner un = new Scanner(System.in);        
        String nom="", sexe="";
        int edat=0, edat20=0, edat40=0, edat60=0, edat80=0, contHome=0, contDona=0, contTotal=0, percHomes=0;
        int percDones=0, perc20=0, perc40=0, perc60=0, perc80=0, cont20=0, cont40=0, cont60=0, cont80=0;
        boolean esFinal=false;
        
        do{
        System.out.println("Introdueix nom:");
        nom=in.nextLine();
        
        System.out.println("Introdueix sexe:"); 
        sexe=en.nextLine();
        
        System.out.println("Introdueix edat:");
        edat=un.nextInt();
        
        if(nom.equals("final")){
        esFinal=true;
        }else{
            if((edat<40)&&(edat>20)){
            edat20=edat20+1;
            contTotal=contTotal+1;
                if(sexe.equals("home")){
                contHome=contHome+1;
                System.out.println(nom+edat);
                }else if (sexe.equals("dona")){
                contDona=contDona+1;
                System.out.println(nom+edat);
                }else{
                System.out.println("sexe no valid.");
                }
            }else if(edat<60){
            edat40=edat40+1;
            contTotal=contTotal+1;
                if(sexe.equals("home")){
                contHome=contHome+1;
                System.out.println(nom + edat);
                }else if (sexe.equals("dona")){
                contDona=contDona+1;
                System.out.println(nom + edat);
                }else{
                System.out.println("sexe no valid.");
                }
            }else if(edat<80){
            edat60=edat60+1;
            contTotal=contTotal+1;
                if(sexe.equals("home")){
                contHome=contHome+1;
                System.out.println(nom + edat);
                }else if (sexe.equals("dona")){
                contDona=contDona+1;
                System.out.println(nom + edat);
                }else{
                System.out.println("sexe no valid.");
                }
            }else if(edat>80){
            edat80=edat80+1;
            contTotal=contTotal+1;
                if(sexe.equals("home")){
                contHome=contHome+1;
                System.out.println(nom + edat);
                }else if (sexe.equals("dona")){
                contDona=contDona+1;
                System.out.println(nom + edat);
                }else{
                System.out.println("sexe no valid.");
                }
            }else{
            System.out.println("edat no valida.");
            }
        }
        }while (esFinal==false);
        percHomes=contHome/contTotal*100;
        percDones=contDona/contTotal+100;
        perc20=cont20/contTotal;
        perc40=cont40/contTotal;
        perc60=cont60/contTotal;
        perc80=cont80/contTotal;
        if(esFinal==false){
        System.out.println("El percentatge d'homes es " + percHomes + "%.");
        System.out.println("El percentatge de dones es " + percDones + "%.");
        System.out.println("El percentatge de persones de entre 20 i 40 es " + perc20);
        System.out.println("El percentatge de persones mayors de 40 es " + perc40);
        System.out.println("El percentatge de persones mayors de 60 es " + perc60);
        System.out.println("El percentatge de persones mayors de 80 es " + perc80);
        }
        
        
    }    
}
