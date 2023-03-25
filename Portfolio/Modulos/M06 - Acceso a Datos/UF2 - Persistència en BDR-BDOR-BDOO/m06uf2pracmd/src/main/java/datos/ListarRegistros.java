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
import java.util.ArrayList;
import java.util.List;
import main.SingleSession;
import org.hibernate.Session;


/**
 *
 * @author andre
 */
public class ListarRegistros {
       
        private static Session session;
        
        public static List<Combat> ListarCombat(int idInicial, int idFinal){
             session = SingleSession.getInstance().getSessio();
            
            List<Combat> combates = new ArrayList();
            
            for (int i = idInicial; i <= idFinal; i++) {
                combates.add(session.get(Combat.class, i));
            }
            
            return combates;
        }
        
         public static List<Transport> ListarTrasnport(int idInicial, int idFinal){
             session = SingleSession.getInstance().getSessio();
           
            List<Transport> transports = new ArrayList();
            
            for (int i = idInicial; i <= idFinal; i++) {
                transports.add(session.get(Transport.class, i));
            }
            
            return transports;
        }
         
        public static List<Mecanic> ListarMecanics(int idInicial, int idFinal){
             session = SingleSession.getInstance().getSessio();
             
            List<Mecanic> mecanics = new ArrayList();
            
            for (int i = idInicial; i <= idFinal; i++) {
                
                mecanics.add(session.get(Mecanic.class, i));
              
            }
            
            return mecanics;
        }
        
          public static List<Missio> ListarMissions(int idInicial, int idFinal){
             session = SingleSession.getInstance().getSessio();
             
            List<Missio> missions = new ArrayList();
            
            for (int i = idInicial; i <= idFinal; i++) {
                
                missions.add(session.get(Missio.class, i));
              
            }
            
            return missions;
        }
          
         public static List<Pilot> ListarPilots(int idInicial, int idFinal){
             session = SingleSession.getInstance().getSessio();
             
            List<Pilot> pilots = new ArrayList();
            
            for (int i = idInicial; i <= idFinal; i++) {
                
                pilots.add(session.get(Pilot.class, i));
              
            }
            
            return pilots;
        }
         
        public static List<Dron> ListarDrons(int idInicial, int idFinal){
             session = SingleSession.getInstance().getSessio();
            
            List<Dron> drons = new ArrayList();
            
            for (int i = idInicial; i <= idFinal; i++) {
                
                drons.add(session.get(Dron.class, i));
              
            }
            
            return drons;
        }
    
    
}
