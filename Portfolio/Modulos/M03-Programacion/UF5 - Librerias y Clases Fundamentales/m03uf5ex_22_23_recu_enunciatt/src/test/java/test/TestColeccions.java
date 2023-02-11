package test;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import enunciat.Accio;
import enunciat.Pagina;
import enunciat.Document;
import enunciat.TipusAccio;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


/**
 *
 * @author manel
 */
public class TestColeccions{
    
   private TestInfo testInfo;
    
    @BeforeEach
    public void init(TestInfo testInfo) {
        this.testInfo = testInfo;
    }
    
    @Test
    public void apartat1() throws Exception {
        
        System.out.println("TEST: " + testInfo.getDisplayName());
        
        //creacio de document
        Document doc1 = new Document(4);
        
        Pagina p1 = new Pagina(1, "Titol 1", "Text 1", 40, 15);
        Pagina p2 = new Pagina(2, "Titol 2", "Text 2", 40, 15);
        Pagina p3 = new Pagina(3, "Titol 3", "Text 3", 40, 15);
        Pagina p4 = new Pagina(4, "Titol 4", "Text 4", 40, 15);
        Pagina p5 = new Pagina(5, "Titol 5", "Text 5", 40, 15);

        // afegir pagines a document
        assertTrue(doc1.afegeixPagina(p1));
        assertTrue(doc1.afegeixPagina(p2));
        assertTrue(doc1.afegeixPagina(p3));

         //afegir pagina repetida
        assertFalse(doc1.afegeixPagina(p3));

        // excedir num pagines del document
        assertTrue(doc1.afegeixPagina(p4));
        assertFalse(doc1.afegeixPagina(p5));


        //consultar num pagines
        assertTrue(doc1.numPagines() == 4);

        //retornar pagina
        assertTrue(doc1.getPagina(2) == p2);

        //suprimir pagina
        assertTrue(doc1.suprimeixPagina(2));
        
        //no retornar pagina
        assertFalse(doc1.getPagina(2) == p2);

        //suprimir pagina inexistent
        assertFalse(doc1.suprimeixPagina(6));
    }
    
      @Test
      public void apartat2() throws Exception {
        
       System.out.println("TEST: " + testInfo.getDisplayName());
        
        //creacio de document
        Document doc1 = new Document(4);
        
         // creació d'accions
        Accio a1 = new Accio(LocalTime.now(), TipusAccio.CURSIVA, "U:ABCD992210");
        Accio a2 = new Accio(LocalTime.now(), TipusAccio.AUGMENTAR_FONT, "U:ABCD992211");
        Accio a3 = new Accio(LocalTime.now(), TipusAccio.ELIMINAR_CARACTER, "U:ABCF992415");
        Accio a4 = new Accio(LocalTime.now(), TipusAccio.NEGRETA, "U:ABCG993211");
        Accio a5 = new Accio(LocalTime.now(), TipusAccio.AUGMENTAR_FONT, "U:AXCD922211");
        
        
        //afegir accions
        assertTrue(doc1.addAccio(a1));
        assertTrue(doc1.addAccio(a2));
        assertTrue(doc1.addAccio(a3));
        
        //treure accions
        assertTrue(doc1.undoAccio().equals(a3));
        assertTrue(doc1.undoAccio().equals(a2));
        
        //consultar accions
        assertTrue(doc1.darreraAccio().equals(a1));
        assertTrue(doc1.darreraAccio().equals(a1));
        assertTrue(doc1.darreraAccio().equals(a1));

       
    }
}
