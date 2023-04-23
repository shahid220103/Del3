/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package del3;

import Del3.Card;
import Del3.GroupOfCards;
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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    private GroupOfCards instance;
    private ArrayList<Card> expResult;

    @BeforeEach
    public void setUp() {
        instance = new GroupOfCards(10);
        expResult = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            expResult.add(new Card(i, "Hearts"));
        }
        for (Card c : expResult) {
            instance.addCard(c);
        }
    }
    
    @AfterEach
    public void tearDown() {
        instance = null;
        expResult = null;
    }

    /**
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        ArrayList<Card> result = instance.getCards();
        assertEquals(expResult, result);
    }

    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card(5, "Suit");
        instance.addCard(card);
        int expectedSize = 11;
        assertEquals(expectedSize, instance.getSize());
        assertTrue(instance.getCards().contains(card));
    }

    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Card card = new Card(5, "Suit");
        instance.removeCard(card);
        int expectedSize = 9;
        assertEquals(expectedSize, instance.getSize());
        assertFalse(instance.getCards().contains(card));
    }


    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        int expectedSize = 10;
        int result = instance.getSize();
        assertEquals(expectedSize, result);
    }

    /**
     * Test of clear method, of class GroupOfCards.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        instance.clear();
        int expectedSize = 0;
        assertEquals(expectedSize, instance.getSize());
        assertTrue(instance.getCards().isEmpty());
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        instance.shuffle();
        ArrayList<Card> shuffledCards = instance.getCards();
        assertNotEquals(expResult, shuffledCards);
    }   
}
    