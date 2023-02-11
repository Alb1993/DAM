package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Respostes.RespostesRegex;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
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
    public void testRegex4() {   
        
        Random rnd = new Random();
        String txt = "";
        
        Integer index = 1;
        ArrayList<Integer> posicions1 = new ArrayList<>();
        List<Integer> posicions2 = null;
        
        
        for (int i = 0; i < 100; i++)
        {
            Integer n = rnd.nextInt(1, 10);
            
            if (n == 1)
            {
                posicions1.add(index);
                String s1 = " "+jfk.internet().ipV4Address()+" ";
                index+=s1.length();
                txt+= s1;
            }
            
            if (n == 3)
            {
                String s2 = " "+rnd.nextInt(256,999) + "."+ rnd.nextInt(256,999) + "." +rnd.nextInt(256,999) + "." +rnd.nextInt(256,999)+" ";
                index+=s2.length();
                txt+= s2;
            }
            
            txt += (char)rnd.nextInt(65, 90);
            
            index++;
            
        }
        
        posicions2 = RespostesRegex.respostaRegex4(txt);
        
        if (posicions2 != null)
        {
            assertTrue(posicions1.equals(posicions2));
        }
        else
            assertTrue(posicions1.isEmpty());
    }
    
    @Test
    public void testRegex6() {
        
       
        String lletresOk="BCDFGHJKLMNPRSTVWXYZ";
        String lletresError="AEIOUQÑ";
       
        
        Random rnd = new Random();
      
        
        for (int i = 0; i < 1000; i++)
        {
            boolean b = rnd.nextBoolean();
            
            // matricula ok
            if (b)
            {
                String m = String.format("%04d", rnd.nextInt(1, 9999));
                for (int j = 1; j<4; j++)
                    m += lletresOk.charAt(rnd.nextInt(lletresOk.length()));
                
                if (showSamples)
                    System.out.println(m + "=true");
                
                assertTrue(RespostesRegex.respostaRegex6(m));
                
            }   //matricula error
            else
            {
                String m = Integer.toString(rnd.nextInt(1, 99999));
                
                Integer bound = rnd.nextInt(6);
                
                for (int j = 1; j < bound; j++)
                    m += rnd.nextBoolean()?lletresError.charAt(rnd.nextInt(lletresError.length())):" ";
                
                if (showSamples)
                    System.out.println(m + "=false");
                
                assertFalse(RespostesRegex.respostaRegex6(m));
            }
        }
                
    }
}

