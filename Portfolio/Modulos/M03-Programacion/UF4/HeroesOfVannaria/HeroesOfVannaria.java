/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeroesOfVannaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author mengu
 */
public class HeroesOfVannaria {
    
    public static void jugar(Scanner in) throws IOException{
        boolean sortir = false;
        ArrayList<Personatge> arrayPersonatges = new ArrayList<Personatge>();
        while(!sortir){
           
            String opcion = mostrarMenu(in);
            switch(opcion){
                case "1":
                    crearPersonatge(arrayPersonatges);
                    break;
                case "2":
                    combat(arrayPersonatges, in);
                    break;
                case "3":
                    arrayPersonatges=llegirFitxer(in);      
                    break;
                case "4":
                    modificacioPersonatges(arrayPersonatges,in);
                case "x":
                    sortir = true;
                    break;
                default:
                    System.out.println("ERROR: opcio incorrecta."+
                            "Premi Enter per continuar");
                    in.nextLine();
                    break;
            }
        }
    }
    
    public static void crearPersonatge(ArrayList<Personatge> arrayPersonatges) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Como quieres crear los personajes?");
        System.out.println("1. Modo Manual");
        System.out.println("2. Modo Automatico");
        int opcion = in.nextInt();
        switch (opcion) {
            case 1:
                creacionManual(in,arrayPersonatges);
                break;
            case 2:
                creacionAutomatico(in,arrayPersonatges);
        }
    }
    
    public static String[][] puntoDeGuardado(String[][] caracteristica, Scanner in, int posicion, Personatge personaje)
    {
            caracteristica[posicion][0] = personaje.getNom();
            caracteristica[posicion][1] = personaje.getClass().getSimpleName();
            caracteristica[posicion][2] = personaje.getArma().getNom();
            caracteristica[posicion][3] = personaje.getForca() + "";
            caracteristica[posicion][4] = personaje.getConstitucio() + "";
            caracteristica[posicion][5] = personaje.getVelocitat() + "";
            caracteristica[posicion][6] = personaje.getIntelligencia() + "";
            caracteristica[posicion][7] = personaje.getSort() + "";
            
        return caracteristica;
    }
    
    public static void modificacioPersonatges(ArrayList<Personatge> arrayPersonatges,Scanner in){
        System.out.println("Introduce el personaje a modificar: ");
        String nombrePersonaje=in.nextLine();
        
        System.out.println("Introduce nuevo nombre:");
        String nuevoNombre=in.nextLine();        
        
        for(int i=0;i<arrayPersonatges.size();i++){
            if(arrayPersonatges.get(i).getNom().equals(nombrePersonaje)){
                arrayPersonatges.get(i).setNom(nuevoNombre);
                arrayPersonatges.get(i).setForca(3);
                arrayPersonatges.get(i).setConstitucio(3);
                arrayPersonatges.get(i).setVelocitat(3);
                arrayPersonatges.get(i).setIntelligencia(3);
                arrayPersonatges.get(i).setSort(3);
                asignaEstadisticasManual(arrayPersonatges.get(i),in);
                arrayPersonatges.get(i).calculaDerivades();
            }
        }
        
    
    }
    
    
    public static void escrituraFichero(String[][] caracteristica, Scanner in) throws IOException
    {
        System.out.println("Introduce ruta archivo: ");
        String ruta=in.nextLine();
        BufferedWriter sortida = new BufferedWriter(new FileWriter(ruta + "/personatges.csv"));
        for (int i = 0; i < caracteristica.length; i++) {
            for (int j = 0; j < caracteristica[i].length; j++) {
                sortida.write(caracteristica[i][j] + "\n");
            }
        }
        sortida.close();
    
    }
    
    public static ArrayList<Personatge> llegirFitxer(Scanner in) {
        
        String ruta=in.nextLine();
        
        ArrayList<Personatge> arrayPersonatges = new ArrayList<Personatge>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(ruta + "/personatges.csv"));

            int i = 0;
            String personatgeStr = entrada.readLine();
            while(personatgeStr != null){
                String[] caracteristica = personatgeStr.split(";");
                Arma miArma=buscaArma(caracteristica[2]);    
                String nom = caracteristica[0];
                String classe = caracteristica[1];
                int forca         = Integer.parseInt(caracteristica[3]);
                int constitucio   = Integer.parseInt(caracteristica[4]);
                int velocitat     = Integer.parseInt(caracteristica[5]);
                int intelligencia = Integer.parseInt(caracteristica[6]);
                int sort          = Integer.parseInt(caracteristica[7]);

                Personatge personaje = null;
                switch (classe) {
                    case "Guerrer":
                        personaje = new Guerrer(nom,forca,constitucio,velocitat,intelligencia,sort,miArma);
                        arrayPersonatges.add(personaje);
                        break;
                        
                    case "Cavaller":
                        personaje = new Cavaller(nom,forca,constitucio,velocitat,intelligencia,sort,miArma);
                        arrayPersonatges.add(personaje);
                        break;
                        
                    case "Valkiria":
                        personaje = new Valkiria(nom,forca,constitucio,velocitat,intelligencia,sort,miArma);
                        arrayPersonatges.add(personaje);                        
                        break;
                        
                    case "Assassi­":
                        personaje = new Assassi(nom,forca,constitucio,velocitat,intelligencia,sort,miArma);                        
                        arrayPersonatges.add(personaje);
                        break;
                }
                personatgeStr = entrada.readLine();
            }
                
            entrada.close();
            
            

        } catch (FileNotFoundException fnf) {
            //fnf.printStackTrace();
            System.out.println("Error fitxer no trobat.");
        } catch (IOException ioe) {
            System.out.println("Error I/O: " + ioe.getMessage());
        }
        
        mostrarArray(arrayPersonatges);
        return arrayPersonatges;
        
    }
    
    public static void mostrarArray(ArrayList<Personatge> arrayPersonatges){
        for(int i=0;i<arrayPersonatges.size();i++){
            arrayPersonatges.get(i).getNom();
            arrayPersonatges.get(i).getArma().getNom();
            arrayPersonatges.get(i).getForca();
            arrayPersonatges.get(i).getConstitucio();
            arrayPersonatges.get(i).getVelocitat();
            arrayPersonatges.get(i).getIntelligencia();
            arrayPersonatges.get(i).getSort();
            arrayPersonatges.get(i).getClass().getSimpleName();
        }
    
    
    }
    
    public static Arma buscaArma(String nombreArma)
    {
        if(nombreArma.equals("Daga")){
        Arma daga = new Arma("Daga",5,15);
        return daga;
        }else if(nombreArma.equals("Martell de combat")){
        Arma martell = new Arma("Martell de combat",15,5);
        return martell;
        }else if(nombreArma.equals("Espasa")){
        Arma espasa = new Arma("Espasa",10,10);
        return espasa;
        }
        return null;
    }

    public static void creacionManual(Scanner in,ArrayList<Personatge> arrayPersonatges) throws IOException {
        System.out.println("Cuantos personajes quieres crear?");
        int cantPersonajes = introNumero(in);
        in.nextLine();
        String[][] caracteristica = new String[cantPersonajes][8];
        for (int i = 0; i < cantPersonajes; i++) {
            System.out.println("Nombre para el personaje " + i + ":");
            String nombre = in.nextLine();
            System.out.println("Clase para el personaje " + i + ":");
            System.out.println("1.Guerrer");
            System.out.println("2.Assassí");
            System.out.println("3.Cavaller");
            System.out.println("4.Valkiria");
            int opcion = introNumero(in);
            in.nextLine();
            Personatge personaje = creaPersonaje(opcion, nombre, arrayPersonatges);
            muestraArmas();
            int opcionArma = introNumero(in);
            Arma armaEscogida = escogeArma(in, opcionArma, personaje);
            personaje.setArma(armaEscogida);
            asignaEstadisticasManual(personaje, in);
            personaje.calculaDerivades();
            personaje.setNiv(0);
            arrayPersonatges.add(personaje);
            muestraPersonaje(personaje, caracteristica);
            puntoDeGuardado(caracteristica,in,i,personaje);
            
        }
        escrituraFichero(caracteristica,in);
    }
    
    
    public static void creacionAutomatico(Scanner in,ArrayList<Personatge> arrayPersonatges) throws IOException {
        System.out.println("Cuantos personajes quieres crear?");
        int cantPersonajes = introNumero(in);
        in.nextLine();
        String[][] caracteristica = new String[cantPersonajes][8];
        for (int i = 0; i < cantPersonajes; i++) {
            String nombre = "Personaje" + i + "";
            int opcion = (int) ((Math.random() * 4) + 1);
            Personatge personaje = creaPersonaje(opcion, nombre, arrayPersonatges);
            int opcionArma = (int) ((Math.random() * 3) + 1);
            Arma armaEscogida = escogeArma(in, opcionArma, personaje);
            personaje.setArma(armaEscogida);
            asignaEstadisticasAutomaticas(personaje);
            personaje.calculaDerivades();
            personaje.setNiv(0);
            arrayPersonatges.add(personaje);
            muestraPersonaje(personaje, caracteristica);
            puntoDeGuardado(caracteristica,in,i,personaje);
            
        }
    escrituraFichero(caracteristica, in);
    }
    
    public static void asignaEstadisticasManual(Personatge personaje, Scanner in) {
        int estadisticas = 45;

        while (estadisticas > 0) {
            int opcion = eligeOpcion(in, estadisticas);
            System.out.println("Introduce cantidad");
            int cantidad = introNumero(in);
            in.nextLine();
            if (compruebaValor(opcion, cantidad, personaje)) {
                asignaStat(personaje, opcion, cantidad);
                estadisticas = estadisticas - cantidad;
            } else {
                System.out.println("No se puede introducir ese valor.");
            }
        }

    }
    
    public static boolean compruebaValor(int opcion, int cantidad, Personatge personaje) {
        switch (opcion) {
            case 1:
                if ((personaje.getForca() + cantidad) < 18) {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if ((personaje.getConstitucio() + cantidad) < 18) {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if ((personaje.getVelocitat() + cantidad) < 18) {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if ((personaje.getIntelligencia() + cantidad) < 18) {
                    return true;
                } else {
                    return false;
                }           
            case 5:
                if ((personaje.getSort() + cantidad) < 18) {
                    return true;
                } else {
                    return false;
                }

        }
        return false;
    }
    
    public static int getRandomInt() {
        return (int) (Math.floor(Math.random() * 8));
    }

    public static int eligeOpcion(Scanner in, int estadisticas) {
        System.out.println("Puntos Restantes: " + estadisticas);
        System.out.println("Que Estadistica quieres mejorar?");
        System.out.println("1.Fuerza");
        System.out.println("2.Constitucion");
        System.out.println("3.Velocidad");
        System.out.println("4.Inteligencia");
        System.out.println("5.Suerte");
        int opcion = in.nextInt();
        return opcion;
    }
    
    public static void asignaStat(Personatge personaje, int opcion, int cantidad) {
        switch (opcion) {
            case 1:
                personaje.setForca(personaje.getForca() + cantidad);
                break;
            case 2:
                personaje.setConstitucio(personaje.getConstitucio() + cantidad);
                break;
            case 3:
                personaje.setVelocitat(personaje.getVelocitat() + cantidad);
                break;
            case 4:
                personaje.setIntelligencia(personaje.getIntelligencia() + cantidad);
                break;
            case 5:
                personaje.setSort(personaje.getSort() + cantidad);
                break;
        }
    }
    
    public static void asignaEstadisticasAutomaticas(Personatge personaje) {
        int estadisticas = 45;
        while (estadisticas > 0) {
            int opcion = (int) (Math.random() * (5 - 1) + 1);
            int cantidad = getRandomInt();
            if (cantidad > estadisticas) {
                cantidad = estadisticas;
            }
            if (compruebaValor(opcion, cantidad, personaje)) {
                asignaStat(personaje, opcion, cantidad);
                estadisticas = estadisticas - cantidad;
            }

        }
    }

    public static void muestraArmas() {
        System.out.println("Armas Disponibles:");
        System.out.println("1. Daga");
        System.out.println("2. Espasa");
        System.out.println("3. Martell de combat");

    }
    
    public static Arma escogeArma(Scanner in, int opcionArma, Personatge personaje) {
        switch (opcionArma) {
            case 1:
                Arma Daga = new Arma("Daga", 5, 15);
                return Daga;
            case 2:
                Arma Espasa = new Arma("Espasa", 10, 10);
                return Espasa;
            case 3:
                Arma MartellDeCombat = new Arma("Martell de Combat", 15, 5);
                return MartellDeCombat;
        }
        return null;
    }

    public static int introNumero(Scanner in) {
        int num = in.nextInt();
        return num;
    }
    
    public static void muestraPersonaje(Personatge personaje, String[][] caracteristica) {
        System.out.println("Nombre: " + personaje.getNom());
        System.out.println("Arma: " + personaje.getArma().getNom());
        System.out.println("Fuerza: " + personaje.getForca());
        System.out.println("Constitucion: " + personaje.getConstitucio());
        System.out.println("Velocidad: " + personaje.getVelocitat());
        System.out.println("Inteligencia: " + personaje.getIntelligencia());
        System.out.println("Suerte: " + personaje.getSort());
        System.out.println("Clase: " + personaje.getClass().getSimpleName());
        System.out.println("");
    }
    
    public static Personatge creaPersonaje(int opcion, String nombre, ArrayList<Personatge> arrayPersonatges) {
        switch (opcion) {
            case 1:
                Guerrer guerrero = new Guerrer(nombre, 3, 3, 3, 3, 3);
                return guerrero;

            case 2:
                Assassi asesino = new Assassi(nombre, 3, 3, 3, 3, 3);
                return asesino;

            case 3:
                Cavaller caballero = new Cavaller(nombre, 3, 3, 3, 3, 3);
                return caballero;

            case 4:
                Valkiria valkiria = new Valkiria(nombre, 3, 3, 3, 3, 3);
                return valkiria;
        }
        return null;
    }
    
    public static void combat(ArrayList<Personatge> arrayPersonatges, Scanner in){
        Dau dau1 = new Dau(20);
        Dau dau2 = new Dau(20);
        Dau dau3 = new Dau(20);
        System.out.println("Selecciona el primer combatent:");
                for (int i=0; i<arrayPersonatges.size(); i++){
                    System.out.printf("%d - %s%n", (i+1), arrayPersonatges.get(i));
                }
        int c1 = Utils.llegeixEnterRang(in, 1, arrayPersonatges.size());
        Personatge atacant = arrayPersonatges.remove(c1 - 1);
        
        System.out.println("Selecciona el segon combatent: ");
             for (int i=0; i<arrayPersonatges.size(); i++){
                System.out.printf("%d - %s%n", (i+1), arrayPersonatges.get(i));
             }
             
             int c2 = Utils.llegeixEnterRang(in, 1, arrayPersonatges.size());
             Personatge defensor = arrayPersonatges.get(c2 - 1);
             arrayPersonatges.add(c1-1, atacant);
             Personatge tmp;
             if (atacant.getVelocitat() < defensor.getVelocitat()){
                 tmp = atacant;
                 atacant = defensor;
                 defensor = tmp;
             }
             System.out.println("------ INICI DEL COMBAT ------");
             System.out.println(atacant.getNom() + " contra " + defensor.getNom());
    
    boolean combatFinalitzat = false;
    int ronda = 1;
    while(!combatFinalitzat){
        System.out.println(" Ronda`"+ronda);
        ronda++;
        
        if(atacant.ataca(dau1, dau2, dau3)){
            System.out.println(atacant.getNom()+ "ataca");
            if(!defensor.esquiva(dau1, dau2, dau3)){
                System.out.println(defensor.getNom() + "falla l'esquiva");
                defensor.repDany(atacant);
                System.out.println(defensor.getNom() + "rep" + atacant.getPd() + "punts de dany i la seva PS baixa a " + defensor.getPs());
            }else{
                System.out.println(defensor.getNom() + " esquiva l'atac ");
            }
        }else{
            System.out.println(atacant.getNom() + "falla l'atac ");
        }
        if(defensor.getPs() <= 0){
            combatFinalitzat = true;
            System.out.println(defensor.getNom() +" cau derrotat ");
            System.out.println(atacant.getNom() + " guanya el combat!!");
            int experiencia = defensor.getConstitucio() + defensor.getForca();
            atacant = añadirExp(atacant, experiencia);
            }else{
            tmp = atacant;
            atacant = defensor;
            defensor = tmp;
        }
       }
      }
    
    public static Personatge añadirExp(Personatge personaje, int experiencia)
    {
        System.out.println("El personaje " + personaje.getNom() + " ha ganado " + Math.abs(experiencia) + " puntos de experiencia!");
        personaje.pe += Math.abs(experiencia);
        if(personaje.niv == 0 && personaje.pe >= 100)
        {
            actualizaNivel(personaje);
        }
        else if(personaje.niv == 1 && personaje.pe >= 200)
        {
            actualizaNivel(personaje);
        }
        else if(personaje.niv == 2 && personaje.pe >= 500)
        {
            actualizaNivel(personaje);
        }
        else if(personaje.niv == 3 && personaje.pe >= 1000)
        {
            actualizaNivel(personaje);
        }
        else if(personaje.niv == 4 && personaje.pe >= 5000)
        {
            actualizaNivel(personaje);
        }
        return personaje;
    }
    
    public static Personatge actualizaNivel(Personatge personaje)
    {
        personaje.niv++;
        personaje.setForca(personaje.getForca()+1);
        personaje.setConstitucio(personaje.getConstitucio()+1);
        personaje.setIntelligencia(personaje.getIntelligencia()+1);
        personaje.setVelocitat(personaje.getVelocitat()+1);
        personaje.setSort(personaje.getSort()+1);
        personaje.calculaDerivades();
        
        return personaje;
    }
               
    public static String mostrarMenu(Scanner in){
        System.out.println("-----------HEROES OF VANNARIA------------");
        System.out.println("1 - Crear Personatge");
        System.out.println("2 - Iniciar Combat");
        System.out.println("3 - Cargar Personatges");
        System.out.println("4 - Modificar Personatges");
        System.out.println("X - Sortir");
        String opcion=in.nextLine();
        return opcion;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        jugar(in);
    }
    
    
}
