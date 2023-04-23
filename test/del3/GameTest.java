package Del3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GameTest {

    public GameTest() {
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
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = new GameImpl();
        instance.play();
        // TODO add assertions to check that the game state has changed
    }

    /**
     * Test of switchToNextPlayer method, of class Game.
     */
    @Test
    public void testSwitchToNextPlayer() {
        System.out.println("switchToNextPlayer");
        Game instance = new GameImpl();
        instance.switchToNextPlayer();
        // TODO add assertions to check that the active player has changed
    }

    public class GameImpl extends Game {

        public GameImpl() {
            super("");
        }
        
        @Override
        public void play() {
            // TODO implement this method
        }
    }

}
