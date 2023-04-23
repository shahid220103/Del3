package Del3;

import java.util.ArrayList;

public class GroupOfCards {
    protected ArrayList<Card> cards;

    public GroupOfCards(int size) {
        cards = new ArrayList<>(size);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public int getSize() {
        return cards.size();
    }

    public void clear() {
        cards.clear();
    }

    public void shuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }
}
