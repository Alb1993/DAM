package bloc3;

import java.util.Scanner;

public class bloc3_10 {

    public static void main(String[] args) {
        int nota=0, suspenso=0, aprovado=0, suficiente=0, bien=0, notaaprovado=0, notable=0, notasuspenso=0, excelente=0, notamediaaprov=0, notamediasusp=0, porcentajesusp=0, porcentajeaprov=0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Suspensos: " + suspenso);    
        System.out.println("Aprovados: " + aprovado); 
        System.out.println("bien: " + bien); 
        System.out.println("notable: " + notable);
        System.out.println("excelente: " + excelente);
        System.out.println("La media de aprovados es de " + notamediaaprov);
        System.out.println("La media de suspensos es de: " + notamediasusp);
        System.out.println("El porcentaje de suspensos es de: " + porcentajesusp);
        System.out.println("La media de suspensos es de: " + porcentajeaprov);
        
        for (int i=0;i<41;i++){
        System.out.print("Introduce nota:");
        nota = in.nextInt();

            if((nota>=0)&&(nota<=10)){        
                if (nota<5){
                suspenso = suspenso + 1;
                porcentajesusp = 100 / suspenso;
                notasuspenso = nota + notasuspenso;
                notamediasusp = notasuspenso / suspenso;
                }else{
                aprovado = aprovado + 1;
                porcentajeaprov = 100 - porcentajesusp;
                notaaprovado = nota + notaaprovado;
                    notamediaaprov = notaaprovado / aprovado;
                    if(aprovado<6){
                    suficiente = suficiente + 1;
                    }else if(aprovado<7){
                    bien = bien + 1;
                    }else if(aprovado<9){
                    notable = notable + 1;
                    }else{
                    excelente = excelente + 1;
                    }
                }
            }else{
            System.out.println("Nota no valida.");
                i--; 
            }
        
        }
    }
}


