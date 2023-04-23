package Del3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        // Set up any required resources or configurations for all tests in the class
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Release any resources or configurations used by all tests in the class
    }
    
    @BeforeEach
    public void setUp() {
        // Set up any required resources or configurations for each test
    }
    
    @AfterEach
    public void tearDown() {
        // Release any resources or configurations used by each test
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        // Arrange
        Card instance = new Card(5, "Hearts");
        int expResult = 5;

        // Act
        int result = instance.getRank();

        // Assert
        assertEquals(expResult, result);
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        // Arrange
        Card instance = new Card(5, "Hearts");
        String expResult = "Hearts";

        // Act
        String result = instance.getSuit();

        // Assert
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        // Arrange
        Card instance = new Card(5, "Hearts");
        String expResult = "5 of Hearts";

        // Act
        String result = instance.toString();

        // Assert
        assertEquals(expResult, result);
    }
}