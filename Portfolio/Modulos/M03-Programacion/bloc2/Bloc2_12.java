package bloc2;

import java.util.Scanner;

public class Bloc2_12 {
    
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
             
        int seconds = 15236;
        
        double minutes = seconds % 60;
        
        double horas = minutes % 60;
        
        double dias = horas % 24;    
        
        int minutes2 = seconds/60;

        int horas2 = minutes2/60;
                
        int dias2 = horas2/24;
        
        double dif1 = dias2-dias;
        
        double dif2 = horas2-horas+(dif1*24);
        
        double dif3 = minutes-minutes2+(dif2*60);
        
        if (dif2>24){
        dif2=dif2-24;    
        } 
        System.out.println("Son " + dias + " dias, " + dif2 + " horas y " + dif3 + " minutos.");       
         
        
        
        
        
        
        
        
    }
    
}
