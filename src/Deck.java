import java.util.*;
import java.lang.Math;
public class Deck {
    private ArrayList<Card> deckCards;
    private ArrayList<String> deckRanks;
    private ArrayList<String> deckSuits;
    private ArrayList<Integer> deckValues;
    private int cardsLeft;


    public Deck()
    {
        deckCards = new ArrayList<Card>();
        deckRanks = new ArrayList<String>();
        deckRanks.add("ace");
        deckRanks.add("2");
        deckRanks.add("3");
        deckRanks.add("4");
        deckRanks.add("5");
        deckRanks.add("6");
        deckRanks.add("7");
        deckRanks.add("8");
        deckRanks.add("9");
        deckRanks.add("10");
        deckRanks.add("jack");
        deckRanks.add("queen");
        deckRanks.add("king");

        deckSuits = new ArrayList<String> ();
        deckSuits.add("Spades");
        deckSuits.add("Hearts");
        deckSuits.add("Diamonds");
        deckSuits.add("Clubs");

        deckValues = new ArrayList<Integer>();
        for(int i = 0; i < deckRanks.size(); i++){
            deckValues.add((i+1));
        }

        for(int i = 0; i < deckSuits.size(); i++) {
            for(int j = 0; j < deckRanks.size(); j++)
            {
                deckCards.add(new Card(deckRanks.get(j), deckSuits.get(i), deckValues.get(j)));
            }
        }
        cardsLeft = deckCards.size();
    }

    public boolean isEmpty()
    {
        if(cardsLeft == 0)
        {
            return true;
        }
        return false;
    }

    public int getCardsLeft()
    {
        return cardsLeft;
    }

    public Card deal()
    {
        if(deckCards.size() == 0)
        {
            return null;
        }
        cardsLeft--;
        return deckCards.remove(cardsLeft);
    }

    public void shuffle()
    {
        cardsLeft = deckCards.size();
        int r;
        for(int i = deckCards.size() - 1; i >= 0; i--)
        {
            r = (int)(Math.random() * (i + 1);
            Card temp = new Card(deckCards.get(i).getRank(), deckCards.get(i).getSuit(), deckCards.get(i).getPoint());
            deckCards.set(i,deckCards.get(r));
            deckCards.set(r,temp);
        }
    }
}
