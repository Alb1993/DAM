package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import enunciat.Logic;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;




public class TestLambda {
    
    private TestInfo testInfo;
    
    @BeforeEach
    public void init(TestInfo testInfo) {
        this.testInfo = testInfo;
    }
    
    @Test
    public void apartat1() {
        
         System.out.println("TEST: " + testInfo.getDisplayName());
        
         List<String> noms = new ArrayList<>(Arrays.asList( "Hakim",
                                                            "Harriet",
                                                            "Adrian",
                                                            "Ammarah",
                                                            "Danika",
                                                            "Ashwin",
                                                            "Hayleigh",
                                                            "Hadiqa",
                                                            "Romany",
                                                            "Kourtney",
                                                            "Sian",
                                                            "Rudy",
                                                            "May",
                                                            "Sadie",
                                                            "Zishan",
                                                            "Emyr",
                                                            "Alivia",
                                                            "Eliana",
                                                            "Jaylan",
                                                            "Reo",
                                                            "Luc",
                                                            "Yosef",
                                                            "Chantel",
                                                            "Pia",
                                                            "Om",
                                                            "Jo",
                                                            "Melinda",
                                                            "Misha",
                                                            "Madison",
                                                            "Borys"));
         
                        assertEquals(Arrays.asList(
                                                           "Melinda",
                                                           "Misha",
                                                           "Madison"), Logic.metode_1(noms));
         
    }
    
     @Test
    public void apartat2() {
        
         System.out.println("TEST: " + testInfo.getDisplayName());
        
         List<String> noms = new ArrayList<>(Arrays.asList( "Hakim",
                                                            "Harriet",
                                                            "Adrian",
                                                            "Ammarah",
                                                            "Danika",
                                                            "Ashwin",
                                                            "Hayleigh",
                                                            "Hadiqa",
                                                            "Romany",
                                                            "Kourtney",
                                                            "Sian",
                                                            "Rudy",
                                                            "May",
                                                            "Sadie",
                                                            "Zishan",
                                                            "Emyr",
                                                            "Alivia",
                                                            "Eliana",
                                                            "Jaylan",
                                                            "Reo",
                                                            "Luc",
                                                            "Yosef",
                                                            "Chantel",
                                                            "Pia",
                                                            "Om",
                                                            "Jo",
                                                            "Melinda",
                                                            "Misha",
                                                            "Madison",
                                                            "Borys"));
         
         assertEquals(Arrays.asList("Borys", "Hakim", "Misha", "Sadie", "Yosef"), Logic.metode_2(noms));
    }
}
