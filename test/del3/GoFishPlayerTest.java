/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package del3;

import Del3.GoFishHand;
import Del3.GoFishPlayer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class GoFishPlayerTest {
    
    public GoFishPlayerTest() {
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
     * Test of getHand method, of class GoFishPlayer.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        GoFishHand expectedHand = new GoFishHand();
        GoFishPlayer instance = new GoFishPlayer("Player1", expectedHand);
        GoFishHand result = instance.getHand();
        assertEquals(expectedHand, result);
    }


    /**
     * Test of requestCard method, of class GoFishPlayer.
     */
    @Test
    public void testRequestCard() {
        System.out.println("requestCard");
        GoFishPlayer targetPlayer = new GoFishPlayer("TargetPlayer", new GoFishHand());
        GoFishPlayer instance = new GoFishPlayer("Player1", new GoFishHand());
        instance.requestCard(targetPlayer, 5);
        assertEquals(1, instance.getHand().getCardCount(), "Card count should be 1");
    }


    /**
     * Test of selectRank method, of class GoFishPlayer.
     */
    @Test
    public void testSelectRank() {
        System.out.println("selectRank");
        GoFishPlayer instance = new GoFishPlayer("Player1", new GoFishHand());
        int result = instance.selectRank();
        assertTrue(result >= 1 && result <= 13, "Rank should be between 1 and 13.");
    }

    /**
     * Test of play method, of class GoFishPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        GoFishPlayer instance = new GoFishPlayer("Player1", new GoFishHand());
        instance.play();
        // No assertion since the method doesn't return anything
    }
    
}
