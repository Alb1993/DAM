package datos;

import entitats.Combat;
import entitats.Dron;
import entitats.Mecanic;
import entitats.Missio;
import entitats.Pilot;
import entitats.Transport;
import main.ClassFactory;
import main.M06UF2PracMD;
import main.SingleSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase que contiene las funciones de creado de objetos a partir de las
 * funciones que contiene el ClassFactory
 */
public class CrearRegistros {

    private static final Logger logger = LogManager.getLogger(M06UF2PracMD.class);
    private static final ClassFactory factory = new ClassFactory();
    private static Session session;

    /**
     * Función para la creación de objetos tipo Combat
     *
     * @param cantidad
     */
    public static void crearCombate(int cantidad) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();

        for (int i = 0; i < cantidad; i++) {
            Combat c = (Combat) factory.aeronauFactory(Combat.class);
            session.persist(c);
        }

        session.getTransaction().commit();
        logger.info(" ======= Naves de combate creadas correctamente =======");
    }

    /**
     * Función para la creación de objetos tipo Transport
     *
     * @param cantidad
     */
    public static void crearTransporte(int cantidad) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();

        for (int i = 0; i < cantidad; i++) {
            Transport t = (Transport) factory.aeronauFactory(Transport.class);
            session.persist(t);
        }

        session.getTransaction().commit();
        logger.info(" ======= Naves de transporte creadas correctamente =======");

    }

    /**
     * Función para la creación de objetos tipo Dron
     *
     * @param cantidad
     */
    public static void crearDron(int cantidad) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();

        for (int i = 0; i < cantidad; i++) {
            Dron d = (Dron) factory.aeronauFactory(Dron.class);
            session.persist(d);
        }

        session.getTransaction().commit();
        logger.info(" ======= Naves con Dron creadas correctamente =======");

    }

    /**
     * Función para la creación de objetos tipo Mecanic
     *
     * @param cantidad
     */
    public static void crearMecanico(int cantidad) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();

        for (int i = 0; i < cantidad; i++) {
            Mecanic m = (Mecanic) factory.soldatFactory(Mecanic.class);
            session.persist(m);
        }

        session.getTransaction().commit();
        logger.info(" ======= Mecanicos creados correctamente =======");

    }

    /**
     * Función para la creación de objetos tipo Pilot
     *
     * @param cantidad
     */
    public static void crearPiloto(int cantidad) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();

        for (int i = 0; i < cantidad; i++) {
            Pilot p = (Pilot) factory.soldatFactory(Pilot.class);
            session.persist(p);
        }

        session.getTransaction().commit();
        logger.info(" ======= Pilotos creados correctamente =======");

    }

    /**
     * Función para la creación de objetos tipo Missio
     *
     * @param cantidad
     */
    public static void crearMision(int cantidad) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();

        for (int i = 0; i < cantidad; i++) {
            Missio m = factory.missioFactory();
            session.persist(m);
        }

        session.getTransaction().commit();
        logger.info(" ======= Misiones creadas correctamente =======");
    }
}
