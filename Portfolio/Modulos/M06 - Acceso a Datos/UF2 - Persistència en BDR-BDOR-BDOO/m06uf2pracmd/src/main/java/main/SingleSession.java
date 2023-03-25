/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author FPShare
 */
public class SingleSession {
    public static SingleSession instance = null;
    public Session session;


    /***
     * Declaramos los Atributos de la clase SingleSession, que seran los objetos Session y SessionFactory.
     */
    public SingleSession() {
    Configuration config = new Configuration();
    config.configure("hibernateConfig/hibernate.cfg.xml");
    config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/m06uf2pracmd?createDatabaseIfNotExist=true");
    config.setProperty("hibernate.connection.username", "root");
    config.setProperty("hibernate.connection.password", "123456");
    SessionFactory sessionFactory = config.buildSessionFactory();
    //SessionFactory sessionFactory = new Configuration().configure("hibernateConfig/hibernate.cfg.xml").buildSessionFactory();
    session = sessionFactory.openSession();
    }
    /***
     * Funcion que genera una nueva Instancia de SingleSession.
     * @return 
     */
    public static SingleSession getInstance() {
        if (instance == null) {
            instance = new SingleSession();
        }
        return instance;
    }

    /***
     * A travès del metodo getSession, podemos devolver una session abierta en vez de Instanciar otra session, 
     * Al no haber dos sessiones abiertas, tendremos menos errores al hacer el RollBack.
     * 
     * @return 
     */
    public Session getSessio() {
        return session;
    }
    
    public Session sessionConfig(String bd, String user, String pass) {
            Configuration config = new Configuration();
            config.configure("hibernateConfig/hibernate.cfg.xml");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/" + bd + "?createDatabaseIfNotExist=true");
            config.setProperty("hibernate.connection.username", user);
            config.setProperty("hibernate.connection.password", pass);
            SessionFactory sessionFactory = config.buildSessionFactory();
            session = sessionFactory.openSession();
        return session;
    }
    
    
}
