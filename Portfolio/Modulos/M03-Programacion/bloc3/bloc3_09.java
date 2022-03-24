package bloc3;

import java.util.Scanner;

public class bloc3_09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aprovado = 0, suspenso = 0, suficiente = 0, bien = 0, notable = 0, excelente = 0, nota;
        
        for(int i=0;i<40;i++){
        System.out.println("Introduce nota:");
        nota = in.nextInt();
        if((nota>0)&&(nota<=10)){        
            if (nota<5){
                    suspenso = suspenso + 1;
            }
            else{
                    aprovado = aprovado + 1;
            
                    if(aprovado<6){
                    suficiente = suficiente + 1;
            
                    }else if (aprovado<7){
                    bien = bien + 1;
            
                    }else if(aprovado<9){
                    notable = notable + 1;
            
                    }else{
                    excelente = excelente + 1;
                    }
                }
        }else{
            System.out.print("Nota no valida.");
            i--;        
                    }
            }
        System.out.println("Suspensos: " + suspenso);
        System.out.println("Aprovados: " + aprovado);
        System.out.println("Suficientes: " + suficiente);
        System.out.println("bien: " + bien);
        System.out.println("notable: " + notable);
        System.out.println("excelente: " + excelente);
    }        
}

