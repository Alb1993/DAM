package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import respostes.RespostesRegex;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
public class TestRegex {
    
     boolean showSamples = false;
    
    static Faker jfk;
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
        
        jfk = new Faker();
        
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
    public void testRegex3() { 
        
        String bothifyStr = "--???###???###???###--";
        
        Random rnd = new Random();
        String txt = "";
        
        Integer n1 = 0;
        
        for (int i = 0; i < 100; i++)
        {
            Integer n = rnd.nextInt(1, 6);
            
            if (n == 1)
            {
                txt += jfk.bothify(bothifyStr);
                n1++;
            }
            
            if (n == 2)
            {
                txt += jfk.internet().ipV4Address();
            }
            
            if (n == 3)
            {
                txt += rnd.nextInt(256,999) + "."+ rnd.nextInt(256,999) + "." +rnd.nextInt(256,999) + "." +rnd.nextInt(256,999);
            }
            
            if (n == 5)
            {
                txt += jfk.backToTheFuture().character();
            }
            
            if (n == 6)
            {
                txt += jfk.animal().name();
            }
            
            txt += jfk.aviation().aircraft();
        }
        
        assertTrue(RespostesRegex.respostaRegex3(txt).equals(n1));
        
    }
    
    
    
    @Test
    public void testRegex5() {
        
        ArrayList<String> posicions1 = new ArrayList<>();
        List<String> posicions2 = null;
        
        Random rnd = new Random();
        String txt = "";
        char[] correspondingLetters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        for (int i = 0; i < 1000; i++)
        {
            Integer n = rnd.nextInt(1, 10);
            
            //dni correcte
            if (n == 1)
            {
                String number = jfk.numerify("########");
                int index = Integer.parseInt(number) % 23;
                char letter = correspondingLetters[index];
                String dni = number+letter;
                txt += dni;
                posicions1.add(dni);
            }
            
            if (n == 2)
            {
                txt += jfk.internet().ipV4Address();
            }
            
            //dni erroni
            if (n == 3)
            {
                Integer number = rnd.nextInt(11111111, 99999999);
                int index = number % 23;
                char letter = correspondingLetters[index];
                String dni = Integer.toString(number+1)+letter;
                txt += dni;
            }
            
            if (n == 5)
            {
                txt += jfk.backToTheFuture().character();
            }
            
            if (n == 6)
            {
                txt += jfk.animal().name();
            }
            
            txt += jfk.aviation().aircraft();
        }
        
        posicions2 = RespostesRegex.respostaRegex5(txt);
        
        if (posicions2 != null)
        {
            assertTrue(posicions1.equals(posicions2));
        }
        else
            assertTrue(posicions1.isEmpty());
        
    }
}

