package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Enunciat.AlumneCicleInfantil;
import Enunciat.Persona;
import Respostes.RespostesExcepcions;
import java.util.Random;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manel
 */
public class TestExcepcions {
    
     boolean showSamples = false;
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @BeforeEach
    public void setUp() {
    }
    
    /**
     *
     */
    @AfterEach
    public void tearDown() {
    }

   
     /**
     *
     */
    @Test
    public void testExcepcions1() {
        
        Persona tutorLegal;
        AlumneCicleInfantil a1;
        
        try {
            
            tutorLegal = new Persona("12345611A","Maria", "Rull", "Garcia", 27);
            
            a1 = new AlumneCicleInfantil(299, 3, "","Eric", "Oller", "Valls", 3, tutorLegal);
            
            RespostesExcepcions.respostaExcepcions1(a1);
            
            assertTrue(true);
            
        } catch (Exception ex) {
            
            fail();
        }
        
        try {
            
            tutorLegal = null;
            
            a1 = new AlumneCicleInfantil(299, 3, "","Eric", "Oller", "Valls", 3, tutorLegal);
            
            RespostesExcepcions.respostaExcepcions1(a1);
            
            fail();
            
        } catch (Exception ex) {
            
            if (ex.getClass().toGenericString().contains("AlumneException"))
                assertTrue(true);
            else
                fail();
        }
        
        try {
            
            tutorLegal = new Persona("12345611A","Maria", "Rull", "Garcia", 16);
            
            a1 = new AlumneCicleInfantil(299, 3, "","Eric", "Oller", "Valls", 3, tutorLegal);
            
             RespostesExcepcions.respostaExcepcions1(a1);
            
            fail();
            
        } catch (Exception ex) {
            
              if (ex.getClass().toGenericString().contains("AlumneException"))
                assertTrue(true);
            else
                fail();
        }
    }
    
    
    @Test
    public void testExcepcions4() {
        
        Random rnd = new Random();
        int n1, n2;
        String resultat;
 
        // bateria de N proves
        for (int i = 0; i<1000; i++)
        {
            // genera dos caràcters ascii aleatoris
            n1 = rnd.nextInt(48, 90);
            n2 = rnd.nextInt(48, 90);
            
            //els passem a string
            String p1 = String.valueOf((char)n1);
            String p2 = String.valueOf((char)n2);
            
            //obtenim el resultat
            resultat = RespostesExcepcions.respostaExcepcions4(p1, p2);
            
            // si els caracters eren nombres
            if ( n1 > 47 && n1 < 58 && n2 > 47 && n2 < 58)
            {   
                Integer r1 = Integer.parseInt(p1);
                Integer r2 = Integer.parseInt(p2); 
                
                // verifiquem el càlcul correcte
                assertTrue(String.valueOf(r1*r2).equals(resultat));
            }
            else
                // verifiquem que era error
                assertTrue(resultat.equals("ERROR"));
            
            if (showSamples)
                System.out.println(String.format("p1=%1$s p2=%2$s retorn=%3$s", p1, p2, resultat));
        }
    }
}
