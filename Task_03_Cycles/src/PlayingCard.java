public class PlayingCard {
    public static String playingCard52()
    {
        String card;
        String[] cardValue =  {"3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] cardLear = {"Hearts","Spades","Clubs","Diamonds"};

        int randValue = (int) (Math.floor(Math.random() * cardValue.length) + 0);
        //System.out.print(cardValue[randValue] + " ");

        int randLear = (int) (Math.floor(Math.random() * cardLear.length) + 0);
        //System.out.println(cardLear[randLear]);

        card = cardValue[randValue] +" "+ cardLear[randLear];
        //System.out.println(card);
        return card;
    }
}
