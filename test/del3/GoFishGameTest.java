package del3;

import Del3.GoFishGame;
import Del3.GoFishPlayer;
import Del3.GroupOfCards;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Author: DELL
 */
public class GoFishGameTest {
    
    public GoFishGameTest() {
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
     * Test of getInstance method, of class GoFishGame.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        GoFishGame expResult = GoFishGame.getInstance();
        GoFishGame result = GoFishGame.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStock method, of class GoFishGame.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        GoFishGame instance = GoFishGame.getInstance();
        GroupOfCards expResult = instance.getStock();
        assertNotNull(expResult);
    }


    /**
     * Test of addPlayer method, of class GoFishGame.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        GoFishPlayer player = new GoFishPlayer("Alice");
        GoFishGame instance = GoFishGame.getInstance();
        instance.addPlayer(player);
        assertTrue(instance.getPlayers().contains(player));
    }

    /**
     * Test of getPlayers method, of class GoFishGame.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        GoFishGame instance = GoFishGame.getInstance();
        List<GoFishPlayer> expResult = instance.getPlayers();
        assertNotNull(expResult);
    }

    /**
     * Test of initializeStock method, of class GoFishGame.
     */
    @Test
    public void testInitializeStock() {
        System.out.println("initializeStock");
        GoFishGame instance = GoFishGame.getInstance();
        instance.initializeStock();
        assertNotNull(instance.getStock());
    }

    /**
     * Test of dealCards method, of class GoFishGame.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        GoFishGame instance = GoFishGame.getInstance();
        instance.initializeStock();
        instance.addPlayer(new GoFishPlayer("Alice"));
        instance.dealCards();
        assertNotNull(instance.getPlayers().get(0).getHand());
    }

    /**
     * Test of takeTurns method, of class GoFishGame.
     */
    @Test
    public void testTakeTurns() {
        System.out.println("takeTurns");
        GoFishGame instance = GoFishGame.getInstance();
        instance.initializeStock();
        instance.addPlayer(new GoFishPlayer("Alice"));
        instance.dealCards();
        instance.takeTurns();
        assertNotNull(instance.getPlayers().get(0).getHand());
    }

    /**
     * Test of determineWinner method, of class GoFishGame.
     */
    @Test
    public void testDetermineWinner() {
        System.out.println("determineWinner");
        GoFishGame instance = GoFishGame.getInstance();
        instance.initializeStock();
        instance.addPlayer(new GoFishPlayer("Alice"));
        instance.dealCards();
        instance.takeTurns();
        instance.determineWinner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of play method, of class GoFishGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        GoFishGame instance = GoFishGame.getInstance();
        instance.initializeStock();
        instance.addPlayer(new GoFishPlayer("Alice"));
        instance.addPlayer(new GoFishPlayer("Bob"));
        instance.dealCards();
        instance.play();
        // TODO: add assertion to check game result
    }

    
}
