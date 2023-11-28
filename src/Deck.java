import java.util.*;
import java.lang.Math;
public class Deck() {
    private ArrayList<Card> cards;
    private int cardsLeft;


    public Deck(ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values)
    {
        cards = new ArrayList<Card>();
        for(int i = 0; i < ranks.size(); i++)
        {
            cards.add(new Card(ranks.get(i), suits.get(i), values.get(i)));
        }
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
        if(cards.size() == 0)
        {
            return null;
        }
        cardsLeft--;
        return cards.get(cardsLeft);
    }

    public void shuffle()
    {
        cardsLeft = cards.size();

        int r = 0;
        for(int i = cards.size() - 1; i >= 0; i--)
        {
            r = (int)Math.random() * i;
            Card temp = new Card(cards.get(i).getRank(), cards.get(i).getSuit(), cards.get(i).getPoint());
            cards.set(i,cards.get(r));
            cards.set(r,temp);
        }
    }










}
