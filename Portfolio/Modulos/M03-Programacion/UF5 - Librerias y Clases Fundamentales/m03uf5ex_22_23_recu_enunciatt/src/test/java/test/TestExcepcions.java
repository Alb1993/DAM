package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import enunciat.Pagina;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


/**
 *
 * @author manel
 */
public class TestExcepcions {
    
    private TestInfo testInfo;
    
    @BeforeEach
    public void init(TestInfo testInfo) {
        this.testInfo = testInfo;
    }
    
    @Test
    public void apartat1() {
        
       System.out.println("TEST: " + testInfo.getDisplayName());
        
        try {
            Pagina p = new Pagina(1, "Titol 1", "Text 1", 100, 4);
            fail();
        } catch (Exception ex) {
             assertTrue(ex.getMessage().trim().toLowerCase().contains("la mida de la font ha d'estar entre 5 i 99"));
        }
        
        try {
            Pagina p = new Pagina(1, "Titol 1", "Text 1", 100, 100);
            fail();
        } catch (Exception ex) {
             assertTrue(ex.getMessage().trim().toLowerCase().contains("la mida de la font ha d'estar entre 5 i 99"));
        }
        
        try {
            Pagina p = new Pagina(1, "Titol 1", "Text 1", 100, 15);
          
        } catch (Exception ex) {
             fail();
        }
    }
    
    @Test
    public void apartat2() {
        
       System.out.println("TEST: " + testInfo.getDisplayName());
        
         try {
            Pagina p1 = new Pagina(0, "Titol 1", "Text 1", 5, 15);
            fail();
        } catch (Exception ex) {
            if (ex.getClass().toGenericString().contains("DocException"))
                assertTrue(true);
            else
                fail();

        }
        
        try {
            Pagina p2 = new Pagina(-1, "Titol 1", "Text 1", 5, 15);
            fail();
        } catch (Exception ex) {
            
            if (ex.getClass().toGenericString().contains("DocException"))
                 assertTrue(true);
            else
                fail();

        }
        
        try {
            Pagina p3 = new Pagina(1, "Titol 1", "Text 1", 5, 15);
          
        } catch (Exception ex) {
             fail();
        }
    }
}
