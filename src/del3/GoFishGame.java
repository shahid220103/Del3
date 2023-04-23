package Del3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoFishGame extends Game {
    private static GoFishGame instance;
    private List<GoFishPlayer> players;
    private GroupOfCards stock;

    public GoFishGame(String name) {
        super(name);
        players = new ArrayList<>();
    }

    public static GoFishGame getInstance() {
        if (instance == null) {
            instance = new GoFishGame("Go Fish");
        }
        return instance;
    }

    public GroupOfCards getStock() {
        return stock;
    }

    public void addPlayer(GoFishPlayer player) {
        players.add(player);
    }

    public List<GoFishPlayer> getPlayers() {
        return players;
    }

    public void initializeStock() {
        // Create a new GroupOfCards object with 52 cards
        stock = new GroupOfCards(52);

        // Define the suits of the cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Create a GoFishCard for each rank and suit combination and add it to the stock
        for (String suit : suits) {
            for (int rank = 1; rank <= 13; rank++) {
                stock.getCards().add(new GoFishCard(rank, suit));
            }
        }

        // Shuffle the stock
        Collections.shuffle(stock.getCards());
    }

    public void dealCards() {
        // Determine the number of cards to deal based on the number of players
        int numberOfCardsToDeal = (players.size() >= 4) ? 5 : 7;

        // Deal the cards to each player
        for (int i = 0; i < numberOfCardsToDeal; i++) {
            for (GoFishPlayer player : players) {
                GoFishCard dealtCard = (GoFishCard) stock.getCards().remove(0);
                player.getHand().addCard(dealtCard);
            }
        }
    }

    public void takeTurns() {
        // Each player takes their turn
        for (GoFishPlayer player : players) {
            player.play();
        }
    }

    public void determineWinner() {
        // Initialize variables to keep track of the highest number of books and the winning player(s)
        int maxBooks = 0;
        List<GoFishPlayer> winners = new ArrayList<>();

        // Determine the number of books each player has and find the highest number
        for (GoFishPlayer player : players) {
            int numBooks = player.getHand().getNumBooks();
            if (numBooks > maxBooks) {
                maxBooks = numBooks;
                // If a player has more books than the previous max, they become the new winner(s)
                winners.clear();
                winners.add(player);
            } else if (numBooks == maxBooks) {
                // If a player has the same number of books as the current max, they are also a winner
                winners.add(player);
            }
        }

        // Print out the winner(s) of the game
        if (winners.size() == 1) {
            System.out.println(winners.get(0).getName() + " wins with " + maxBooks + " books!");
        } else {
            System.out.print("It's a tie between ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.print(winners.get(i).getName());

                if (i < winners.size() - 1) {
                    System.out.print(" and ");
                }
            }
            System.out.println(" with " + maxBooks + " books each!");
        }
    }

    @Override
    public void play() {
        initializeStock();
        dealCards();
        takeTurns();
        determineWinner();
    }
}
