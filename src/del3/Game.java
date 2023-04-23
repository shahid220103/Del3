package Del3;

import java.util.ArrayList;

public abstract class Game {
    protected String name;
    protected int currentPlayerIndex;
    protected ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
    }
    
    public Game(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
        this.currentPlayerIndex = 0;
    }

    public abstract void play();

    protected void switchToNextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
