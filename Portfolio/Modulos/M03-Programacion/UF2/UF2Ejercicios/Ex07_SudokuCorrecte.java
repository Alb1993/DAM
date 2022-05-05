package Uf2modular;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07_SudokuCorrecte {
    public static Scanner in = new Scanner(System.in);
    public static int fila = 9;
    public static int columna = 9;
    public static int comprobarFila=0;
    public static int comprobarColumna=0;
    public static int[] filaTest = new int[9];
    public static int[][] sudoku = new int[fila][columna];
    public static int[] filaSudoku = new int[fila];
    public static boolean sudokuNoValido=false;
    public static int[][] sudokuMini = new int[filaMini][columnaMini];
    public static int filaMini = 3;
    public static int columnaMini = 3;
    
    
    public static void main(String[] args) {
    creaSudoku();
    
    }public static void creaSudoku(){
        
        for(int i=0;i<fila; i++){
            for (int j=0; j<columna;j++){
                System.out.println("Fila: " + i + " Columna: " + j);
                sudoku[i][j]=in.nextInt();
            }
        }
        muestraSudoku();
    }
    public static void muestraSudoku(){
    
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                System.out.println(sudoku[i][j] + " ");
            }    
        }
        comprobarSudoku();
    }
    public static void comprobarSudoku(){
        
        //Aqui haremos la comprobacion de filas, para eso nos movemos por la columna como variable estatica.
        while(comprobarColumna<columna){
            for(int i=0; i<fila; i++){
                filaSudoku[i] = sudoku[i][comprobarColumna];
                if(i==fila){
                    //Una vez rellenada la array, cambiamos de metodo para comprobar si la array esta repetida.
                    compruebaLinea();
                }
            }comprobarColumna++;
        }
        
        //Hacemos el mismo procedimiento para las columnas.
        while(comprobarFila<fila){
            for(int i=0; i<columna; i++){
                filaSudoku[i] = sudoku[comprobarFila][i];
                if(i==columna){
                    compruebaColumna();
                }
            }comprobarFila++;
        }
        
        //Y por ultimo, por recuadros
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
            sudokuMini[i][j]=sudoku[i][j];
                if(j==3){
                    compruebaRecuadro();
                }
            }    
        }
        
        
        
    }
    
    public static void compruebaLinea(){
        //Empezamos ordenando la array para encontrar los numeros mas facilmente 
        Arrays.sort(filaSudoku);
        
        for(int j=0; j<fila; j++){
            //forzamos a que sea filaSudoku +1 porque puede ser que aparte de que se repita un numero, puede faltar otro.
            //Por lo que lo mas sencillo es acotar el caso al resultado deseado.    
            if(filaSudoku[j]!=filaSudoku[j+1]+1){
                //Entonces se ira a muestraResultado, porque ira directamente a mostrar el resultado.
                sudokuNoValido = true;
                muestraResultado();
            }
        }    
    }
    
    public static void compruebaColumna(){
        //Empezamos ordenando la array para encontrar los numeros mas facilmente 
        Arrays.sort(filaSudoku);
        
        for(int j=0; j<columna; j++){
            //forzamos a que sea filaSudoku +1 porque puede ser que aparte de que se repita un numero, puede faltar otro.
            //Por lo que lo mas sencillo es acotar el caso al resultado deseado.    
            if(filaSudoku[j]!=filaSudoku[j+1]+1){
                //Entonces se ira a muestraResultado, porque ira directamente a mostrar el resultado.
                sudokuNoValido = true;
                muestraResultado();
            }
        }
        
    }
    
    public static void compruebaRecuadro(){
    
        for(int i=0; i<filaMini; i++){    
            for(int j=0; j<columnaMini; j++){
                Arrays.sort(sudokuMini[i][j]);
            }
        }
        
        
    
    
    }
    
    
    public static void muestraResultado(){
    
        if(sudokuNoValido==true){
            System.out.println("El sudoku no es valido");
        }else{
            System.out.println("El sudoku esta formado correctamente");
        }
    
    }
    
}
