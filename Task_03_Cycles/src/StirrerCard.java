public class StirrerCard {

    static int countCard = 6;
    static String[] cardMass = new String[countCard];

    public static void stirrerCard()
    {
        cardMass = cardGenerate();

        boolean duplicates=false;

        for (int j = 0; j <cardMass.length; j++) {
            for (int k = j + 1; k < cardMass.length; k++) {
                if (k != j && (cardMass[k] == cardMass[j]))
                {
                    duplicates = false;
                    break;
                }else {
                    duplicates = true;
                }
            }
        }
        if (!duplicates)
            stirrerCard();
        else {
            for (int i = 0; i<cardMass.length; i++)
            {
                System.out.println(cardMass[i]);
            }
        }
        System.out.println("");
    }
    public static String[] cardGenerate()
    {
        for (int i = 0; i < countCard; i++)
        {
            String card = PlayingCard.playingCard52();
            cardMass[i] = card;
        }
        return cardMass;
    }
}