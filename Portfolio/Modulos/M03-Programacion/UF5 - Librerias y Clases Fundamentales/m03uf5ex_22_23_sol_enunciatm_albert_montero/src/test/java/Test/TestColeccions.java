package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Enunciat.Persona;
import Enunciat.Turista;
import Respostes.RespostesColeccions;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manel
 */
public class TestColeccions {
    
    static Persona p1,p2,p3,p4,p5,p6,p7,p8,p9, p10;
    
    static Turista t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    
    static Faker jfk;
    
    boolean showSamples = false;
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
        
        jfk = new Faker();
        
        // generem persones
        p1 = new Persona("12345611A","Joan", "Vintro", "Valls", 14);
        p2 = new Persona("12345612A","Lluis", "Garcia", "Marti", 15);
        p3 = new Persona("12345613A","Maria", "Lledo", "Viga", 25);
        p4 = new Persona("12345614A","Anna", "Ros", "Avila", 12);
        p5 = new Persona("12345615A","Jordi", "Coromina", "Cabre", 14);
        p6 = new Persona("12345616A","Esther", "Corado", "Pisa", 11);
        p7 = new Persona("12345618A","Joana", "Fill", "Lopez", 33);
        p8 = new Persona("12345619A","Pere", "Irio", "Castro", 40);
        p9 = new Persona("12345620A","Marta", "Pals", "Ares", 55);
        
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
    public void testColeccions1() {
        
       Stack<Persona> s = new Stack<>();
       
       List<Persona> l;
       
       s.push(p1);
       s.push(p2);
       s.push(p3);
       s.push(p4);
       s.push(p5);
       s.push(p6);
       s.push(p7);
       s.push(p8);
       s.push(p9);
       
       l = RespostesColeccions.respostaColeccions1(s, 4);
       
       assertTrue(l.get(0).equals(p9));
       assertTrue(l.get(1).equals(p8));
       assertTrue(l.get(2).equals(p7));
       assertTrue(l.get(3).equals(p6));
    }
    
    @Test
    public void testColeccions4() {
        
        List<Persona> llista = new ArrayList<>();
        Integer n = jfk.random().nextInt(100, 1000);
        
         // generem persones
         for (int i = 0; i < n; i++)
         {
             llista.add(new Persona(jfk.idNumber().valid(),jfk.name().name(),jfk.name().firstName(), jfk.name().lastName(), jfk.random().nextInt(1,99)));
         }
         
         List<Persona> llistaOrdenada = RespostesColeccions.respostaColeccions4(llista);
         
         assertTrue(llista.size() == n);
         
        for (int i = 0; i < n-1; i++)
        {
            assertTrue( ((Persona)llistaOrdenada.get(i)).getEdat() <=  ((Persona)llistaOrdenada.get(i+1)).getEdat() );
        }
         
    }
    
    
}
