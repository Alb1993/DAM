package EjerciciosRepasoUF2;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

public class ExamenUF2Ex01 {
    
    /*En un tauler de joc de taula de 8 x 8 caselles l’hem d’incialitzar situant aleatòriament
    20 fitxes blanques.
    
    A continuació volem col·locar 4 fitxes negres al tauler amb la condició que no
    estiguin en contacte amb les vores ni ocupin el lloc d’una altra fitxa ja existent.
    
    El joc consisteix en introduir una posició (fila i columna) cada vegada amb cadascuna
    de les 4 fitxes negres que es volen col·locar.

    Les regles perquè cadascuna de les 4 fitxes negres es puguin col·locar són:
        ● La casella ha d’estar buida (no pot haver una de les fitxes blanca ni cap altre de
        les fitxes negres que hem col·locat nosaltres)
        ● No es pot col·locar una fitxa negra a la vora del tauler (les fitxes blanques
        inicials sí poden estar a la vora).
    El programa ens ha de dir si es poden col.locar o no cadascuna de les 4 fitxes negres.
    Les posicions que introdueix l’usuari per col·locar les fitxes van de la 1 a la 8 (tant per
    fila com per columna).
    
    Disposem de 10 intents en total.
    
    L’aplicació ha de crear un array bidimensional de 8x8 on a cada posició pot haver:
        ● 0: Indica que no ni ha fitxa.
        ● 1: Indica que hi ha una fitxa de les 20 blanques originals (B) que s’han col·locat
        aleatòriament.
        ● 2: S’ha fet un intent vàlid de col·locar una de les 4 fitxes negres sobre aquesta
        casella
    */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] tabla = creaTabla();
        int fichaNegra = 0, intento=0;
        while (fichaNegra < 4) {
            muestraTabla(tabla);
            intento++;
            System.out.println("Intent " + intento + " :");
            System.out.print("Fila: ");
            int fila = introPosicion(in);
            System.out.println("");
            System.out.print("Columna: ");
            int columna = introPosicion(in);
            boolean posicionValida = compruebaBordes(fila, columna);
            if (posicionValida) {
                boolean posicionLibre = existeFicha(tabla, fila, columna);
                if (posicionLibre) {
                    System.out.println("Perfecto, la posicion es valida.");
                    tabla[fila][columna] = 2;
                    fichaNegra++;
                }
            }
        }
        System.out.println("Enhorabuena!, Has Ganado!");
        muestraTabla(tabla);
    }

    public static int[][] creaTabla() {
        int[][] tabla = new int[8][8];
        Random rand = new Random();
        int fichaBlanca = 0;
        for (int i = 0; i < tabla.length && fichaBlanca < 20; i++) {
            for (int j = 0; j < tabla[i].length && fichaBlanca < 20; j++) {
                if (rand.nextBoolean() == true) {
                    tabla[i][j] = 1;
                    fichaBlanca++;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        return tabla;
    }

    public static int introPosicion(Scanner in) {
        int posicion = in.nextInt();
        return posicion;
    }

    public static boolean compruebaBordes(int fila, int columna) {
        boolean valido = false;
        //Si fila o columna son 0 o 7, el numero no vale.
        if (fila == 0 || fila == 7) {
            System.out.println("No es Valido, Toca el borde");
            if (columna == 0 || columna == 7) {
                System.out.println("No es Valido, Toca el borde");
            }
        } else if (columna == 0 || columna == 7) {
            System.out.println("No es Valido, Toca el borde");
        } else {
            //De lo contrario, ponemos valido en true i devolveremos ese booleano.
            valido = true;
        }

        return valido;
    }

    public static boolean existeFicha(int[][] tabla, int fila, int columna) {
        if (tabla[fila][columna] == 2) {
            System.out.println("No es valida. Ya hay una ficha.");
            return false;
        } else {
            return true;
        }
    }

    public static void muestraTabla(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int numero : tabla[i]) {
                if (numero == 0) {
                    System.out.print("0 ");
                } else if (numero == 1) {
                    System.out.print("B ");

                } else {
                    System.out.print("N ");
                }
            }
            System.out.println("");
        }
    }

}
