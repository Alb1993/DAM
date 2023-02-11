package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import enunciat.AlumneCicleInfantil;
import enunciat.Persona;
import enunciat.Treballador;
import respostes.RespostesExcepcions;
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
    public void testExcepcions2() {
        
        Treballador t1;
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls", 36, -1000, 10);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            fail();
            
        } catch (Exception ex) {
            
               if (ex.getClass().toGenericString().contains("SouBrutException"))
                assertTrue(true);
            else
                fail();
        }
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 10000, 10);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            fail();
            
        } catch (Exception ex) {
                 if (ex.getClass().toGenericString().contains("SouBrutException"))
                assertTrue(true);
            else
                fail();
        }      
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 999, 1);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            fail();
            
        } catch (Exception ex) {
                 if (ex.getClass().toGenericString().contains("CategoriaException"))
                assertTrue(true);
            else
                fail();
        }  
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 1999, 2);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            fail();
            
        } catch (Exception ex) {
                 if (ex.getClass().toGenericString().contains("CategoriaException"))
                assertTrue(true);
            else
                fail();
        }  
       
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 2999, 3);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            fail();
            
        } catch (Exception ex) {
                 if (ex.getClass().toGenericString().contains("CategoriaException"))
                assertTrue(true);
            else
                fail();
        }  
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 1000, 1);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            assertTrue(true);
            
        } catch (Exception ex) {
               
                fail();
        }  
        
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 2000, 2);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            assertTrue(true);
            
        } catch (Exception ex) {
               
                fail();
        }  
        
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 3000, 3);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            assertTrue(true);
            
        } catch (Exception ex) {
               
                fail();
        }  
        
        
        try {
            
            t1 = new Treballador("12345611A","Joan", "Vintro", "Valls",36, 4000, 3);
            
            RespostesExcepcions.respostaExcepcions2(t1);
            
            assertTrue(true);
            
        } catch (Exception ex) {
               
                fail();
        }  
         
    }
    
     /**
     *
     */
    @Test
    public void testExcepcions3() {
        
        Random rnd = new Random();
        int n1, n2;
        Double resultat;
        
        for (int i = 0; i<1000; i++)
        {
            n1 = rnd.nextInt(48, 90);
            n2 = rnd.nextInt(48, 90);
            
            String p1, p2;
            
            p1 = String.valueOf((char)n1);
            p2 = String.valueOf((char)n2);

            resultat = RespostesExcepcions.repostaExcepcions3(p1,p2);
            
            if ( n1 > 47 && n1 < 58 && n2 > 48 && n2 < 58)
                assertTrue(resultat.equals(Double.valueOf(p1) / Integer.valueOf(p2)));
            else
                assertTrue(resultat.equals(-1d));
        }
    
    }
}
