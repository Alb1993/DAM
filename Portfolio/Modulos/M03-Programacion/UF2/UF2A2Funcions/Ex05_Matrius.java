package Uf2modular;

import java.util.Random;
import java.util.Scanner;

public class Ex05_Matrius {

    /*
    Que contingui els tres mètodes següents:”
        ·Una funció anomenada mostraMatriu, que rebi una matriu d’enters de mida arbitrària com a paràmetre i la mostri per pantalla. 
            public static void mostraMatriu(int[][] matriu);
        ·Una funció anomenada demanaMatriu, que rebi com a paràmetres les dimensions de la matriu i a continuació demani a l’usuari els valors per files. La funció ha de retornar la matriu amb els valors inserits.
            public static int[][] demanaMatriu(int files, int columnes);
        ·Una funció anomenada generaMatriu, que rebi com a paràmetres les dimensions de la matriu, el valor màxim i el valor mínim i generi una matriu amb les dimensions especificades, omplerta amb nombre enters aleatoris entre el valor mínim i màxim indicats.
            public static int[][] generaMatriu(int files, int columnes, int min, int max);
    Al mètode main s’ha de provar el funcionament de les funcions.
    */
    
    public static Scanner in=new Scanner(System.in);
    public static int fila=0;
    public static int columna=0;
    public static String op="";
    public static Random rand = new Random();
    
    public static void main(String[] args) {
        
    generaMenu();
        
    }public static void generaMenu(){
    int opcion=0;
    System.out.println("Como quieres generar el array?");
    System.out.println("1.Manual");
    System.out.println("2.Automatica");
    System.out.println("3.Salir");    
    opcion=in.nextInt();
        switch(opcion) {
        case 1:
            op="Manual";
            generaMatriz();
            break;
        case 2:
            op="Automatica";
            generaMatriz();
            break;
        case 3:
            System.exit(0);
            break;  
        }
    }
    public static int generaMatriz(){        
    //Recibe dimensiones, valor maximo i valor minimo y genera una matriz con las dimensiones especificadas
    //Rellena la array con valores.
    int minimo=0, maximo=0;
    System.out.println("Intro fila");
    fila=in.nextInt();
    System.out.println("Intro columna");
    columna=in.nextInt();
    System.out.println("Intro minimo:");
    minimo=in.nextInt();
    System.out.println("Intro maximo:");
    maximo=in.nextInt();
    int[][] matriz=new int[fila][columna];
        if(op.equals("Automatica")){
            pideMatrizAutomatica(matriz, maximo, minimo);
        }
        if(op.equals("Manual")){
            pideMatrizManual(matriz, maximo, minimo);
        }
        return 0;
    }
    
    public static void pideMatrizManual(int[][] matriz, int minimo, int maximo){
    //recibe dimensiones i pide los valores al usuario por filas 
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna;j++){  
                System.out.println("Fila: "+ i + ", Columna; " + j);
                matriz[i][j]=in.nextInt();        
            }
        }muestraMatriz(matriz);
    }public static void pideMatrizAutomatica(int[][] matriz, int minimo, int maximo){
    //recibe dimensiones i pide los valores al usuario por filas 
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna;j++){
                matriz[i][j]= (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
                //Math.floor redondea el numero
                //El math.random saca un numero del resultado del maximo - el minimo
                //Del resultado, suma el numero ya que asi filtras el numero que te sale tapando
                //la posibilidad de que aparezca un numero minimo.
            }
        }muestraMatriz(matriz);    
    }public static int muestraMatriz(int[][] matriz){
    //muestra por pantalla la matriz    
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " | ");
            }
        System.out.println("");    
        }
    return 0;    
    }
}
    
    





