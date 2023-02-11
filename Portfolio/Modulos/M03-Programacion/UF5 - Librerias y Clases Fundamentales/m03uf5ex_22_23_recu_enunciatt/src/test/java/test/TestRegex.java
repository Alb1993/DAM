package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.github.javafaker.Faker;
import enunciat.Accio;
import enunciat.Logic;
import enunciat.Pagina;
import enunciat.TipusAccio;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


/**
 *
 * @author manel
 */
public class TestRegex {
    
    private static Faker jfk;
    
    private TestInfo testInfo;
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
        
        jfk = new Faker();
        
    }

    
    @BeforeEach
    public void init(TestInfo testInfo) {
        this.testInfo = testInfo;
    }
    
    @Test
    public void apartat1() {
        
       System.out.println("TEST: " + testInfo.getDisplayName());
       
        // creació d'accions
      Accio a1 = new Accio(LocalTime.now(), TipusAccio.CURSIVA, "U:ABCD992210");
      Accio a2 = new Accio(LocalTime.now(), TipusAccio.AUGMENTAR_FONT, "U:ZZZZ000000");
      Accio a3 = new Accio(LocalTime.now(), TipusAccio.ELIMINAR_CARACTER, "V:zZZZ000000");
      Accio a4 = new Accio(LocalTime.now(), TipusAccio.NEGRETA, "U;ZZZZ00000");
      Accio a5 = new Accio(LocalTime.now(), TipusAccio.AUGMENTAR_FONT, "U:ABCD3000000");
      Accio a6 = new Accio(LocalTime.now(), TipusAccio.COLOR_FONT, "UABCD3000000");
      Accio a7 = new Accio(LocalTime.now(), TipusAccio.CURSIVA, "U ABCD992210");
        
      assertTrue(Logic.validaPropietariAccio(a1));
      assertTrue(Logic.validaPropietariAccio(a2));
      assertFalse(Logic.validaPropietariAccio(a3));
      assertFalse(Logic.validaPropietariAccio(a4));
      assertFalse(Logic.validaPropietariAccio(a5));
      assertFalse(Logic.validaPropietariAccio(a6));
      assertFalse(Logic.validaPropietariAccio(a7));
    }
    
    @Test
    public void apartat2() {
        
        System.out.println("TEST: " + testInfo.getDisplayName());
        
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
        
        Pagina p = new Pagina();
        
        p.setText(txt);
        
        posicions2 = Logic.extrauAdrecesIP(p);
        
        if (posicions2 != null)
        {
            assertTrue(posicions1.equals(posicions2));
        }
        else
            assertTrue(posicions1.isEmpty());
    }

}

