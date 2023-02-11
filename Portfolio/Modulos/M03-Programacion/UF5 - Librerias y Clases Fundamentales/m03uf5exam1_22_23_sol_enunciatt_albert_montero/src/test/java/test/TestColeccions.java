package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import enunciat.Turista;
import respostes.RespostesColeccions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manel
 */
public class TestColeccions {
    
    static Turista t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
        
         // generem turistes
        t1 = new Turista("12345611A","Joan", "Vintro", "Valls", 14, 3, 1);
        t2 = new Turista("12345612A","Lluis", "Garcia", "Marti", 15, 3,2);
        t3 = new Turista("12345613A","Maria", "Lledo", "Viga", 25, 3,3);
        t4 = new Turista("12345614A","Anna", "Ros", "Avila", 12, 3,4);
        t5 = new Turista("12345615A","Jordi", "Coromina", "Cabre", 14, 3,5);
        t6 = new Turista("12345616A","Esther", "Corado", "Pisa", 11, 1,6);
        t7 = new Turista("12345618A","Joana", "Fill", "Lopez", 33, 3,7);
        t8 = new Turista("12345619A","Pere", "Irio", "Castro", 40, 2,8);
        t9 = new Turista("12345620A","Marta", "Pals", "Ares", 55, 2,9);
        t10 = new Turista("12345621A","Lourdes", "Llanas", "Auferill", 30, 3,10);
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
    
    @Test
    public void testColeccions2() {
        
        Map<String,Turista> dades = new HashMap<>();
        
        dades.put(t1.getDni(), t1);
        dades.put(t2.getDni(), t2);
        dades.put(t3.getDni(), t3);
        dades.put(t4.getDni(), t4);
        
        assertTrue(RespostesColeccions.respostaColeccions2(dades, t2.getDni()).equals(t2));
        assertTrue(RespostesColeccions.respostaColeccions2(dades, t1.getDni()).equals(t1));
        assertFalse(RespostesColeccions.respostaColeccions2(dades, t1.getDni()).equals(t2));
        assertFalse(RespostesColeccions.respostaColeccions2(dades, t3.getDni()).equals(t4));
        assertTrue(RespostesColeccions.respostaColeccions2(dades, t5.getDni()) == null);
        
    }
    
    @Test
    public void testColeccions3() {
        
        List<Turista> llista = Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10);

        List<Turista> llistaOrdenada = RespostesColeccions.respostaColeccions3(llista);

        assertTrue(llistaOrdenada.get(0).equals(t6));
        assertTrue(llistaOrdenada.get(1).equals(t8));
        assertTrue(llistaOrdenada.get(2).equals(t9));
        assertTrue(llistaOrdenada.get(3).equals(t1));
        assertTrue(llistaOrdenada.get(4).equals(t2));
        assertTrue(llistaOrdenada.get(5).equals(t3));
        assertTrue(llistaOrdenada.get(6).equals(t4));
        assertTrue(llistaOrdenada.get(7).equals(t5));
        assertTrue(llistaOrdenada.get(8).equals(t7));
        assertTrue(llistaOrdenada.get(9).equals(t10));
    }
}
