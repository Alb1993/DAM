package UF2AI;

import java.util.Scanner;

public class NewClass12 {
    
    private int limite=1000;
    
    public static void main(String[] args) throws Exception {
    int max=introNumero();/*Llamado funcion.*/    
    int[] primers = new int[max];
    int nombre=1;
    boolean primo=true; 
        for(int i=0; i<max; i++){
            esNombrePrimer(nombre);
            if(primo==true){
                primers[i]=nombre;
            }
        nombre++;    
        }
        mostrarVector(primers, max);
    }
    
    public static int introNumero(){
        int max=0;
        Scanner in = new Scanner(System.in);
        max=in.nextInt();
        return max;
    }
    public static void cribaDeEratostenes(int[]){
    
    
    }
    
    public static boolean esNombrePrimer(int nombre, int max){
        
        boolean primo[] = new boolean[max];
        
        for(int i=0; i<max;i++){
            primo[i]=true;
        }
        for(int p = 2; p*p <=max; p++){
            // Si el primo no cambia, entonces es primo
            if(primo){
                // Actualiza todos los múltiplos de p
                for(int i = p*2; i <= max; i += p){
                    primo = false;
                }
            }
        }
    }
    
    public static void mostrarVector(int[] primers, int max){
        for (int i=0;i<=primers.length;i++){
            if(i<primers.length){
            System.out.print(primers[i] + ", ");				
            }else if(i==primers.length){
            System.out.print(primers[i] + "."); 
            }
        }
    }

}