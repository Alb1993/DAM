/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2AI;

/**
 *
 * @author Albert
 */
public class prueba1 {
    
    public static int lecturaDatos(Scanner in){
        int n = 0;
        boolean correcte = false;
        
        do {//hacemos un bucle while para comprobar si el dato es correcto o no.
            System.out.print("Introdueix un nombre enter: ");//Pregunta el dato
            if (!in.hasNextInt()){//Introduces el numero i devuelve true/false si es un numero o no.
                System.out.println("No es un enter");
            }else{
                correcte = true;//cambias a true, con lo que se cierra el bucle.
                n=in.nextInt();//guardas el dato.
            }
            in.nextLine();//Se usa para limpiar, para quitar los datos introducidos en el in, ya que no son necesarios.
        }while(!correcte);
        return n;
    }
    
}
