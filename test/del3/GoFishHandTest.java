/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package del3;

import Del3.GoFishCard;
import Del3.GoFishHand;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class GoFishHandTest {
    
    public GoFishHandTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addCard method, of class GoFishHand.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        GoFishCard card = null;
        GoFishHand instance = new GoFishHand();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class GoFishHand.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        GoFishCard card = null;
        GoFishHand instance = new GoFishHand();
        instance.removeCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countRank method, of class GoFishHand.
     */
    @Test
    public void testCountRank() {
        System.out.println("countRank");
        int rank = 0;
        GoFishHand instance = new GoFishHand();
        int expResult = 0;
        int result = instance.countRank(rank);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumBooks method, of class GoFishHand.
     */
    @Test
    public void testGetNumBooks() {
        System.out.println("getNumBooks");
        GoFishHand instance = new GoFishHand();
        int expResult = 0;
        int result = instance.getNumBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardsByRank method, of class GoFishHand.
     */
    @Test
    public void testGetCardsByRank() {
        System.out.println("getCardsByRank");
        int rank = 0;
        GoFishHand instance = new GoFishHand();
        ArrayList<GoFishCard> expResult = null;
        ArrayList<GoFishCard> result = instance.getCardsByRank(rank);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
