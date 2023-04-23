package Del3;

import java.util.ArrayList;

public class GoFishHand extends GroupOfCards {
    public GoFishHand() {
        super(0);
    }

    public void addCard(GoFishCard card) {
        cards.add(card);
    }

    public void removeCard(GoFishCard card) {
        cards.remove(card);
    }

    public int countRank(int rank) {
        int count = 0;
        for (Card card : cards) {
            GoFishCard goFishCard = (GoFishCard) card;
            if (goFishCard.getRank() == rank) {
                count++;
            }
        }
        return count;
    }

    public int getNumBooks() {
        int numBooks = 0;
        for (int rank = 1; rank <= 13; rank++) {
            if (countRank(rank) == 4) {
                numBooks++;
            }
        }
        return numBooks;
    }
    
    public int getCardCount() {
        return cards.size();
    }


    public ArrayList<GoFishCard> getCardsByRank(int rank) {
        ArrayList<GoFishCard> matchedCards = new ArrayList<>();

        for (Card card : cards) {
            GoFishCard goFishCard = (GoFishCard) card;
            if (goFishCard.getRank() == rank) {
                matchedCards.add(goFishCard);
            }
        }

        return matchedCards;
    }
}
