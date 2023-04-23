    package Del3;

    import java.util.ArrayList;

    public class GoFishPlayer extends Player {
        private final GoFishHand hand;

        public GoFishPlayer(String name) {
            super(name);
            hand = new GoFishHand();
        }
        
        public GoFishPlayer(String name, GoFishHand hand) {
            super(name);
            this.hand = hand;
        }

        public GoFishHand getHand() {
            return hand;
        }

        public void requestCard(GoFishPlayer targetPlayer, int rank) {
            ArrayList<GoFishCard> targetCards = targetPlayer.getHand().getCardsByRank(rank);

            if (!targetCards.isEmpty()) {
                for (GoFishCard card : targetCards) {
                    hand.addCard(card);
                    targetPlayer.getHand().removeCard(card);
                }
            } else {
                System.out.println("Go Fish!");
                GoFishCard drawnCard = (GoFishCard) GoFishGame.getInstance().getStock().getCards().remove(0);
                hand.addCard(drawnCard);
                System.out.println(getName() + " drew a " + drawnCard);
            }
        }

        public int selectRank() {
            // TODO: Implement method to select a rank to request from another player
            return 0;
        }

        @Override
        public void play() {
            ArrayList<GoFishPlayer> otherPlayers = new ArrayList<>(GoFishGame.getInstance().getPlayers());
            otherPlayers.remove(this);

            int selectedRank = selectRank();

            if (selectedRank == 0) {
                // Player chooses to draw a card
                System.out.println(getName() + " chooses to draw a card.");
                GoFishCard drawnCard = (GoFishCard) GoFishGame.getInstance().getStock().getCards().remove(0);
                hand.addCard(drawnCard);
                System.out.println(getName() + " drew a " + drawnCard);
            } else {
                // Player chooses to request a card from another player
                int playerIndex = (int) (Math.random() * otherPlayers.size());
                GoFishPlayer targetPlayer = otherPlayers.get(playerIndex);
                System.out.println(getName() + " requests a " + selectedRank + " from " + targetPlayer.getName() + ".");
                requestCard(targetPlayer, selectedRank);
            }
        }
    }
