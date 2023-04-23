/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package del3;

import Del3.GoFishCard;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoFishCardTest {

    public GoFishCardTest() {
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
     * Test of toString method, of class GoFishCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GoFishCard instance = new GoFishCard(2, "Hearts");
        String expResult = "2 of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO add more tests for different card values and suits
    }
    
}
