package main;

import entitats.Combat;
import entitats.Dron;
import entitats.Mecanic;
import entitats.Missio;
import entitats.Pilot;
import entitats.Transport;
import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;


/**
 * @version 1.0
 * @author FPShare
 * 
 * Clase que contiene el menú de usuario para trabajar sobre la BBDD
 */
public class M06UF2PracMD {
    static Session session;
    private static final Scanner IN = new Scanner(System.in);
    private static final Logger logger = LogManager.getLogger(M06UF2PracMD.class);

    public static void main(String[] args) {
        //session = SingleSession.getInstance().getSessio();
        System.out.print("Introduce el nombre de la base de datos (si no tienes, deja en blanco este campo y se te creará una nueva): ");
        String nombreBD = IN.nextLine();
        System.out.print("Introduce tu usuario: ");
        String user = IN.nextLine();
        System.out.print("Introduce la contraseña: ");
        String password = IN.nextLine();
        session = SingleSession.getInstance().sessionConfig(nombreBD, user, password);
        menuPrincipal();
    }

    // Función para la creación de registros
    public static void creacionObjetos() {
        logger.info(" ======= Crear registros =======");
        System.out.println("--------------------------------------");
        System.out.println("¿Que deseas crear?");
        System.out.println("");

        System.out.println("¿Cuantos quieres crear?");
        int cantidad = IN.nextInt();

        int opcionUser = objetoSeleccionado();

        switch (opcionUser) {
            case 1: {
                datos.CrearRegistros.crearCombate(cantidad);
                menuPrincipal();

            }

            case 2: {
                datos.CrearRegistros.crearTransporte(cantidad);
                menuPrincipal();

            }

            case 3: {
                datos.CrearRegistros.crearDron(cantidad);
                menuPrincipal();

            }

            case 4: {
                datos.CrearRegistros.crearMecanico(cantidad);
                menuPrincipal();

            }

            case 5: {
                datos.CrearRegistros.crearPiloto(cantidad);
                menuPrincipal();

            }

            case 6: {
                datos.CrearRegistros.crearMision(cantidad);
                menuPrincipal();

            }
        }
    }

    // Función para la eliminación de registros
    public static void eliminacionObjetos() {
        logger.info(" ======= Eliminar registros =======");
        System.out.println("--------------------------------------");
        System.out.println("¿Que deseas eliminar?");
        System.out.println("");

        int opcionUser = objetoSeleccionado();

        System.out.println("Dime un id inicial para empezar a elminar");
        int idInicial = IN.nextInt();
        System.out.println("Ahora dime un numero para ponelo como rango final");
        int idFinal = IN.nextInt();
        
        switch (opcionUser) {
            case 1: {
                datos.EliminarRegistros.eliminarCombate(idInicial, idFinal);
                System.out.println("Combates eliminado correctamente");
                menuPrincipal();
            }

            case 2: {
                datos.EliminarRegistros.eliminarTransporte(idInicial, idFinal);
                System.out.println("Transportes eliminado correctamente");
                menuPrincipal();
            }

            case 3: {
                datos.EliminarRegistros.eliminarDron(idInicial, idFinal);
                System.out.println("Drones eliminado correctamente");
                menuPrincipal();
            }

            case 4: {
                datos.EliminarRegistros.eliminarMecanico(idInicial, idFinal);
                System.out.println("Mecanicos eliminado correctamente");
                menuPrincipal();
            }

            case 5: {
                datos.EliminarRegistros.eliminarPiloto(idInicial, idFinal);
                System.out.println("Pilotos eliminado correctamente");
                menuPrincipal();
            }

            case 6: {
                datos.EliminarRegistros.eliminarMision(idInicial, idFinal);
                System.out.println("Misiones eliminado correctamente");
                menuPrincipal();
            }
        }
    }

    // Función para listar los registros de la BBDD
    public static void listadoObjetos() {
        logger.info(" ======= Listar registros =======");
        System.out.println("--------------------------------------");
        System.out.println("¿Que deseas listar?");
        System.out.println("");
        
        int opcionUser = objetoSeleccionado();
        
        System.out.println("Indica el identificador inicial:");
        int indicadorIni = IN.nextInt();
        
        System.out.println("Indica el identificador final:");
        int indicadorFi = IN.nextInt();

        switch (opcionUser) {
            case 1: {
                List<Combat> combates = datos.ListarRegistros.ListarCombat(indicadorIni, indicadorFi);
                
            for (Combat combate : combates) {
                
                System.out.println(combate.toString());
            }
                menuPrincipal();

            }

            case 2: {
                
                 List<Transport> transports = datos.ListarRegistros.ListarTrasnport(indicadorIni, indicadorFi);
                 
                  for (Transport transport : transports) {
                
                        System.out.println(transport.toString());
                    }
                
                menuPrincipal();

            }

            case 3: {
                
                 List<Dron> drons = datos.ListarRegistros.ListarDrons(indicadorIni, indicadorFi);
                 
                  for (Dron dron : drons) {
                
                        System.out.println(dron.toString());
                    }
                
               menuPrincipal();

            }

            case 4: {
                
                 List<Mecanic> mecanics = datos.ListarRegistros.ListarMecanics(indicadorIni, indicadorFi);
                 
                  for (Mecanic mecanic : mecanics) {
                
                        System.out.println(mecanic.toString());
                    }
                
                menuPrincipal();

            }

            case 5: {
                
                  List<Pilot> pilots = datos.ListarRegistros.ListarPilots(indicadorIni, indicadorFi);
                 
                  for (Pilot pilot : pilots) {
                
                        System.out.println(pilot.toString());
                    }
                
                 menuPrincipal();

            }

            case 6: {
                
                List<Missio> missions = datos.ListarRegistros.ListarMissions(indicadorIni, indicadorFi);
                 
                  for (Missio missio : missions) {
                
                        System.out.println(missio.toString());
                    }
                
                 menuPrincipal();

            }
        }
    }

    // Función de seleccionado de objeto por parte del usuario
    public static int objetoSeleccionado() {

        System.out.println("1. Aeronave de Combate");
        System.out.println("2. Aeronave de Transporte");
        System.out.println("3. Aeronave con Dron");
        System.out.println("4. Soldado Mecánico");
        System.out.println("5. Soldado Piloto");
        System.out.println("6. Misión");

        int opcionUser = IN.nextInt();

        return opcionUser;
    }

    // Función de selección principal
    public static void menuPrincipal() {

        System.out.println("Bienvenido usuario, ¿Qué deseas hacer?");
        System.out.println("--------------------------------------");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Crear un elemento");
        System.out.println("2. Eliminar un elemento");
        System.out.println("3. Listar un elemento");
        System.out.println("4. Salir");

        int opcionUser = IN.nextInt();

        switch (opcionUser) {
            case 1: {
                System.out.println("");
                creacionObjetos();
            }

            menuPrincipal();

            case 2: {
                System.out.println("");
                eliminacionObjetos();
            }

            menuPrincipal();

            case 3: {
                System.out.println("");
                listadoObjetos();
            }

            menuPrincipal();

            case 4: {
                logger.info(" ======= Nos vemos!!! =======");
                System.exit(0);
            }
        }
    }
}
