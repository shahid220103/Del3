package Del3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    
    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        Player instance = new ConcretePlayer("John");
        String expResult = "John";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlay() {
        ConcretePlayer instance = new ConcretePlayer("John");
        instance.play();
        assertTrue(instance.hasPlayed());
    }
    
    private class ConcretePlayer extends Player {
        private boolean played;
        
        public ConcretePlayer(String name) {
            super(name);
        }
        
        public void play() {
            // implementation of the play method
            played = true;
        }
        
        public boolean hasPlayed() {
            return played;
        }
    }
}
