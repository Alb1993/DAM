package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import enunciat.Alumne;
import enunciat.Turista;
import respostes.RespostesLambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
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
    public void testLambda3() {
        
        Supplier s = RespostesLambda.respostaLambda3();
        
        assertTrue(s.get().getClass().toGenericString().contains("Persona"));
        
    }
    
    @Test
    public void testLambda4(){
        
        Turista t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
        
        // generem turistes
        t1 = new Turista("12345611A","Oliver", "Vintro", "Valls", 14, 3, 1);
        t2 = new Turista("12345612A","Lluis", "Garcia", "Marti", 15, 3,2);
        t3 = new Turista("12345613A","Israel", "Lledo", "Viga", 25, 3,3); //
        t4 = new Turista("12345614A","Anna", "Ros", "Avila", 21, 1,4);
        t5 = new Turista("12345615A","Jordi", "Coromina", "Cabre", 14, 3,5);
        t6 = new Turista("12345616A","Esther", "Corado", "Pisa", 30, 2,6); //
        t7 = new Turista("12345618A","Joana", "Fill", "Lopez", 33, 3,7);
        t8 = new Turista("12345619A","Imma", "Irio", "Castro", 40, 2,8); //
        t9 = new Turista("12345620A","Marta", "Pals", "Ares", 55, 2,9);
        t10 = new Turista("12345621A","Lourdes", "Llanas", "Auferill", 30, 3,10);
        
        list = new ArrayList<>(Arrays.asList(t1,t2,t4,t5,t7,t9,t10));
        assertTrue(RespostesLambda.respostaLambda4(list).isEmpty());
        
        Random rnd = new Random();
        
        Integer n = rnd.nextInt(1, 3);
        
        switch(n){
            
            case 1 -> {
                
                list.add(t3);
                assertTrue(RespostesLambda.respostaLambda4(list).size() == 1);
            }
            
            case 2 -> {
                
                list.add(t3);
                list.add(t6);
                assertTrue(RespostesLambda.respostaLambda4(list).size() == 2);
                
            }
            
            case 3 -> {
                
                list.add(t3);
                list.add(t6);
                list.add(t8);
                assertTrue(RespostesLambda.respostaLambda4(list).size() == 3);
                
            }
        }
    }
}
