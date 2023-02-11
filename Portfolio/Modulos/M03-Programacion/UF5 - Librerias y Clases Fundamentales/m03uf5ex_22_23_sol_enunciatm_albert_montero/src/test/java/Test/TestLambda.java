package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Enunciat.Alumne;
import Enunciat.Turista;
import Respostes.RespostesLambda;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
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
public class TestLambda {
    
    boolean showSamples = false;
    
    static List<Turista> list;
    
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
    

    @Test
    public void testLambda1() {
        
        list = new ArrayList<>();
        
        Random rnd = new Random();
        Integer bound = rnd.nextInt(2, 10);
        
        for (int i = 1; i < bound ; i++)
        {
            // generem turistes
            list.add(new Turista("12345611A","Joan", "Vintro", "Valls", 14, 3, 1));
            list.add(new Turista("12345612A","Lluis", "Garcia", "Marti", 15, 3,2));
            list.add(new Turista("12345613A","Maria", "Lledo", "Viga", 25, 3,3));
            list.add(new Turista("12345614A","Anna", "Ros", "Avila", 12, 3,4));
            list.add(new Turista("12345615A","Jordi", "Coromina", "Cabre", 14, 3,5));
            list.add(new Turista("12345616A","Esther", "Corado", "Pisa", 11, 1,6));
            list.add(new Turista("12345618A","Joana", "Fill", "Lopez", 33, 3,7));
            list.add(new Turista("12345619A","Pere", "Irio", "Castro", 40, 2,8));
            list.add(new Turista("12345620A","Marta", "Pals", "Ares", 55, 2,9));
            list.add(new Turista("12345621A","Lourdes", "Llanas", "Auferill", 30, 3,10));
        }
        
        assertTrue(RespostesLambda.respostaLambda1("X", list).isEmpty()); 
        assertTrue(RespostesLambda.respostaLambda1("J", list).size() == 3*(bound-1)); 
        assertTrue(RespostesLambda.respostaLambda1("M", list).size() == 2*(bound-1));
    }
    
    @Test
    public void testLambda2() {
        
        Alumne a1 = new Alumne(299, 5, "","Eric", "Oller", "Valls", 10);
        
        Predicate p = RespostesLambda.respostaLambda2();
        
        assertTrue(p.test(a1));
        
        a1 = new Alumne(299, 6, "","Eric", "Oller", "Valls", 10);
        
        p = RespostesLambda.respostaLambda2();
        
        assertTrue(p.test(a1));
        
        a1 = new Alumne(299, 2, "","Eric", "Oller", "Valls", 10);
        
        p = RespostesLambda.respostaLambda2();
        
        assertFalse(p.test(a1));
        
        a1 = new Alumne(299, 7, "","Eric", "Oller", "Valls", 10);
        
        p = RespostesLambda.respostaLambda2();
        
        assertFalse(p.test(a1));
        
    }
}
