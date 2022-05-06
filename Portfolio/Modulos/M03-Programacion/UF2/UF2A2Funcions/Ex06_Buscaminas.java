package Uf2modular;

import java.util.Random;
import java.util.Scanner;

public class Ex06_Buscaminas {

    /*
    "Que faci una part de la funcionalitat del Pescamines.
    (Per si algú no sap com funciona el Pescamines: https://ca.wikipedia.org/wiki/Pescamines)
    
    Ha de tenir una funció anomenada comptaMines que rebi com a paràmetre una matriu de mida variable que contingui un escenari de mines, 
    on el valor 0 indiqui que no hi mina i el valor -1 indica que hi ha una mina.
    
    La funció ha de retornar una matriu de les mateixes dimensions on, per a cada casella on no hi ha una mina, s’indiqui el nombre total 
    de mines adjacents (es consideren mines adjacents les que estan en horitzontal, vertical i diagonal. 
    
    Per a les caselles amb mines, el valor de la casella corresponent a la matriu de retorn serà -1 ".
    
        public int[][] comptaMines(int[][] campo)
    
    Feu ús de la classe Matrius de l’exercici anterior i els seus mètodes.
    Al main feu proves amb diferents escenaris, tant demanats a l’usuari com generats aleatòriament.
    
    */
    
    public static Scanner in = new Scanner(System.in);
    public static int fila=0;
    public static int columna=0;
    public static int MINAS=0;
    public static Random rand = new Random();
    
    
    public static void main(String[] args) {
        
        eligeNivel();
        
    }public static void eligeNivel(){
        int opcion=0;    
        System.out.println("Elige nivel de dificultad");
        System.out.println("1. Principiante");
        System.out.println("2. Intermedio");
        System.out.println("3. Experto");
        opcion=in.nextInt();
        switch (opcion){
            case 1:    
                MINAS=10;
                fila=9;
                columna=9;
                insertaMinas();
            case 2:
                MINAS=40;
                fila=16;
                columna=16;                
                insertaMinas();
            case 3:    
                MINAS=99;
                fila=16;
                columna=30;            
                insertaMinas();
        }
        
    }public static void insertaMinas(){
    int[][] pantalla = new int[fila][columna];
        while(MINAS>0){
            for(int i=0; i<fila; i++){
                for(int j=0; j<columna; j++){
                    if(rand.nextBoolean()==true){
                        pantalla[i][j]=-1;
                        MINAS--;
                    }else{
                        pantalla[i][j]=0;
                    }
                }
            }
        }muestraMinas(pantalla);
    }
    
    public static void muestraMinas(int[][] pantalla){
    System.out.println("Posicion Inicial de las minas:");
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                System.out.print(pantalla[i][j] + " ");
            }
            System.out.println("");
        }
        cuentaMinas(pantalla);
    }
    
    public static void cuentaMinas(int[][] pantalla){
    int[][] contador = new int[fila][columna];
        for(int i=0;i<fila;i++){
            for(int j=0; j<columna; j++){
                if(pantalla[i][j]==-1){
                    contador[i][j]=contador[i][j]+1;
                    comprobarExtremos(i, j, contador, pantalla);
                }    
            }
        }imprimeImagen(contador);
    }
    
    
    public static void comprobarExtremos(int i, int j, int[][] contador, int[][] pantalla){
        if(i<fila){
            if(pantalla[i+1][j]==-1){
                contador[i][j]=contador[i][j]+1;
                comprobarDiagonal(i, j, contador, pantalla);
            }        
        }if(i>0){
            if(pantalla[i-1][j]==-1){
                contador[i][j]=contador[i][j]+1;
                comprobarDiagonal(i, j, contador, pantalla);
            }
        }if(j<columna){
            if(pantalla[i][j+1]==-1){
                contador[i][j]=contador[i][j]+1;
            }
        }if(j>0){
            if(pantalla[i][j-1]==-1){
                contador[i][j]=contador[i][j]+1;            
            }
        }    
    }
    
        
    public static void comprobarDiagonal(int i, int j, int[][] contador, int[][] pantalla){
        if(j<columna){
            if(pantalla[i][j+1]==-1){
                contador[i][j]=contador[i][j]+1;            
            }
        }if(j>0){
            if(pantalla[i][j-1]==-1){            
            contador[i][j]=contador[i][j]+1;            
            }        
        }
    }
    
    
    public static void imprimeImagen(int[][] contador){
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                System.out.print(contador[i][j] + "   ");
            }
        System.out.println("");
        }
    }    
}
