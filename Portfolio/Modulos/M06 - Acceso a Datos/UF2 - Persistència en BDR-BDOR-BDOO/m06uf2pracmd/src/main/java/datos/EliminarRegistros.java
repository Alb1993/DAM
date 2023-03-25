/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entitats.Combat;
import entitats.Dron;
import entitats.Mecanic;
import entitats.Missio;
import entitats.Pilot;
import entitats.Transport;
import main.M06UF2PracMD;
import main.SingleSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

/**
 *
 * @author bhugo
 */
public class EliminarRegistros {
    private static final Logger logger = LogManager.getLogger(M06UF2PracMD.class);
    private static Session session;
    
    public static void eliminarCombate(int idInicial, int idFinal) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();
        
        for (int i = idInicial; i <= idFinal; i++) {
            Combat combat = session.get(Combat.class, i);
            session.remove(combat);
        }

        session.getTransaction().commit();
    }


    public static void eliminarTransporte(int idInicial, int idFinal) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();
        for (int i = idInicial; i <= idFinal; i++) {
            Transport transport = session.get(Transport.class, i);
            session.remove(transport);
        }

        session.getTransaction().commit();
    }


    public static void eliminarDron(int idInicial, int idFinal) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();
        for (int i = idInicial; i <= idFinal; i++) {
            Dron dron = session.get(Dron.class, i);
            session.remove(dron);
        }

        session.getTransaction().commit();

    }


    public static void eliminarMecanico(int idInicial, int idFinal) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();
        for (int i = idInicial; i <= idFinal; i++) {
            Mecanic mecanic = session.get(Mecanic.class, i);
            session.remove(mecanic);
        }

        session.getTransaction().commit();
        
    }


    public static void eliminarPiloto(int idInicial, int idFinal) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();
        for (int i = idInicial; i <= idFinal; i++) {
            Pilot pilot = session.get(Pilot.class, i);
            session.remove(pilot);
        }

        session.getTransaction().commit();

    }


    public static void eliminarMision(int idInicial, int idFinal) {
        session = SingleSession.getInstance().getSessio();
        session.beginTransaction();
        for (int i = idInicial; i <= idFinal; i++) {
            Missio missio = session.get(Missio.class, i);
            session.remove(missio);
        }

        session.getTransaction().commit();
    }
}
