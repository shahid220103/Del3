package Del3;

public class GoFishCard extends Card {
    public GoFishCard(int rank, String suit) {
        super(rank, suit);
    }

    @Override
    public String toString() {
        String[] rankNames = {"", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Override the toString() method to return the rank name and suit of the card
        return rankNames[getRank()] + " of " + getSuit();
    }
}
