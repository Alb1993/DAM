package main;

import com.github.javafaker.Faker;
import entitats.Aeronau;
import entitats.Combat;
import entitats.Dron;
import entitats.Mecanic;
import entitats.Missio;
import entitats.Pilot;
import entitats.Pilotada;
import entitats.Soldat;
import entitats.Transport;
import interficies.TesteableFactory;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0
 * @author FPShare
 */
public class ClassFactory implements TesteableFactory {

    /**
     *
     * Instanciamos 2 objetos: Faker, Random y la Lista de
     * Soldados a rellenar.
     */
    private final Faker FAKER = new Faker();
    private final Random RAND = new Random();

    public ClassFactory() {
    }

    
    
    @Override
    public Aeronau addMecanicsToPilotada(List<Soldat> lo, Pilotada p) throws Exception {
        List<Mecanic> mecanics = new ArrayList<>();

        for (Soldat soldat : lo) {
                mecanics.add((Mecanic) soldat);
        }
        if (mecanics.size() > 2) {
            throw new Exception("Una aeronave pilotada no puede tener mas de 2 mecanicos");
        } else {
            p.setMecanics(mecanics);
        }

        return p;
    }

    @Override
    public Aeronau addMissionsToAeronau(List<Missio> lm, Aeronau a) throws Exception {
        if (lm.size() > 2) {
            throw new Exception("Una aeronave no puede tener mas de 2 misiones");
        } else {
            //Añadimos una lista de Misiones a una aeronave.
            a.setMissions(lm);
        }
        //Devolvemos la aeronave.
        return a;
    }

    @Override
    public Missio addAeronausToMissio(List<Aeronau> la, Missio m) throws Exception {
        if (la.size() > 8) {
            throw new Exception("Una mision no puede tener mas de 8 aeronaves");
        } else {
            //Añadimos las Aeronaves a una Mision.
            m.setAeronaus(la);
        }
        //Devolvemos la mision.
        return m;
    }

    @Override
    public Aeronau addPilotToAeronauPilotada(Pilot p, Pilotada a) throws Exception {
        a.setPilotAeronau(p);
        return a;
    }

    @Override
    public Aeronau aeronauFactory(Class<?> tipus) {

        // Aeronave
        String nombreNave = FAKER.bothify("####") + "-" + FAKER.letterify("#####") + "-" + FAKER.numerify("#####");
        float kmRecorridos = FAKER.number().randomNumber();
        Date fechaConstruccion = Utils.convertirSqlDate(FAKER.date().birthday());
        boolean operativa = RAND.nextBoolean();
        int estado = FAKER.number().numberBetween(1, 100);
        ArrayList<Missio> missions = null;

        //Pilotada (Combat y Transport)
        Pilot pilotAeronau = null;
        int edad_piloto = FAKER.number().numberBetween(16, 65);
        ArrayList<Mecanic> mecanics = null;

        if (tipus == Combat.class) {
            float versionArmamento = FAKER.number().randomNumber();
            Combat combat = new Combat(versionArmamento, pilotAeronau, edad_piloto, mecanics, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
            return combat;
        } else if (tipus == Transport.class) {
            float carga = FAKER.number().randomNumber();
            Transport transport = new Transport(carga, pilotAeronau, edad_piloto, mecanics, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
            return transport;
        } else if (tipus == Dron.class) {
            String tipoDron = FAKER.bothify("####");
            boolean armas = RAND.nextBoolean();
            Dron dron = new Dron(fechaConstruccion, armas, tipoDron, nombreNave, kmRecorridos, fechaConstruccion, operativa, estado, missions);
            return dron;
        }
        return null;
    }

    @Override
    public List<Soldat> mecanicsFactory(int elements) {
        /**
         * *
         * Instanciamos 2 objetos: Faker, Random y la Lista de Soldados a
         * rellenar.
         */
        List<Soldat> mecanics = new ArrayList<>();
        /**
         * Generamos atributos random, los añadimos a un objeto mecanico y
         * despues añadimos el mecanico a nuestro Array de Soldados.
         */
        for (int i = 0; i < elements; i++) {
            String claveMecanico = FAKER.bothify("########");
            float versionHerramientas = FAKER.number().randomNumber();
            int navesReparadas = FAKER.number().numberBetween(0, 999);
            int edad = FAKER.number().numberBetween(16, 65);
            String nombre = FAKER.name().firstName();
            float versionTransmisor = FAKER.number().randomNumber();
            Date fechaAlistamiento = Utils.convertirSqlDate(FAKER.date().birthday());
            boolean operativo = RAND.nextBoolean();
            Mecanic mecanic = new Mecanic(claveMecanico, versionHerramientas, navesReparadas, edad, nombre, versionTransmisor, fechaAlistamiento, operativo);
            mecanics.add(mecanic);
        }
        return mecanics;
    }

    @Override
    public Missio missioFactory() {
        /**
         *
         * Iniciamos una transaccion con SingleSession.
         */
        String tituloMision = FAKER.job().title();
        String descripcion = FAKER.gameOfThrones().quote();
        float recompensa = FAKER.number().randomNumber();
        Date fechaPublicacion = Utils.convertirSqlDate(FAKER.date().birthday());
        boolean completada = RAND.nextBoolean();
        List<Aeronau> aeronaus = null;
        Missio missio = new Missio(tituloMision, descripcion, recompensa, fechaPublicacion, completada, aeronaus);
        return missio;
    }

    @Override
    public List<Missio> missionsFactory(int elements) {
        List<Missio> missions = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            Missio missio = (Missio) missioFactory();
            missions.add(missio);
        }
        return missions;
    }

    @Override
    public List<Soldat> pilotsFactory(int elements) {
        List<Soldat> pilots = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            Pilot pilot = (Pilot) soldatFactory(Pilot.class);
            pilots.add(pilot);
        }
        return pilots;
    }

    @Override
    public Soldat soldatFactory(Class<?> tipus) {

        if (tipus == Mecanic.class) {
            /**
             * Generamos atributos random, los añadimos a un objeto mecanico y
             * despues añadimos el mecanico a nuestro Array de Soldados.
             */
            String claveMecanico = FAKER.bothify("########");
            float versionHerramientas = FAKER.number().randomNumber();
            int navesReparadas = FAKER.number().numberBetween(0, 999);
            int edad = FAKER.number().numberBetween(16, 65);
            String nombre = FAKER.name().firstName();
            float versionTransmisor = FAKER.number().randomNumber();
            Date fechaAlistamiento = Utils.convertirSqlDate(FAKER.date().birthday());
            boolean operativo = RAND.nextBoolean();
            Mecanic mecanic = new Mecanic(claveMecanico, versionHerramientas, navesReparadas, edad, nombre, versionTransmisor, fechaAlistamiento, operativo);
            /**
             * Persistimos el objeto Mecanic i devolvemos el objeto.
             */
            return mecanic;
        } else if (tipus == Pilot.class) {
            /**
             * Generamos atributos random, los añadimos a un objeto mecanico y
             * despues añadimos el mecanico a nuestro Array de Soldados.
             */
            String clavePiloto = FAKER.bothify("########");
            float distanciaPilotadaKM = FAKER.number().randomNumber();
            int edad = FAKER.number().numberBetween(16, 65);
            String nombreClave = FAKER.bothify("####") + "-" + FAKER.letterify("#####") + "-" + FAKER.numerify("#####");
            float versionTransmisor = FAKER.number().randomNumber();
            Date fechaAlistamiento = Utils.convertirSqlDate(FAKER.date().birthday());
            boolean operativo = RAND.nextBoolean();
            Pilot pilot = new Pilot(clavePiloto, distanciaPilotadaKM, edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
            /**
             * Persistimos el objeto Pilot i devolvemos el objeto.
             */
            return pilot;
        } else if (tipus == Combat.class) {
            Combat combat = (Combat) aeronauFactory(Combat.class);
            Soldat soldat = combat.getPilotAeronau();
            return soldat;
        }
        return null;
    }
}
