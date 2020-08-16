/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warfinal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JEEL
 */
public class TestRemainingCards {
    
    public TestRemainingCards() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
   }


    /**
     * Test of emainingCards method, of class Deck.
     */
    @Test
    public void testEmainingCardsGood() {
        System.out.println("RemainingCards");
        Deck instance = new Deck();
        int expResult = 52;
        int result = instance.emainingCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    public void testEmainingCardsBad() {
        System.out.println("RemainingCards");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.emainingCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    public void testEmainingCardsBoundary() {
        System.out.println("RemainingCards");
        Deck instance = new Deck();
        int expResult = 26;
        int result = instance.emainingCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  
