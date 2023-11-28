import java.util.ArrayList;
public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int points;

    public Player(String name)
    {
        this.name = name;
        points = 0;
    }

    public Player(String name, ArrayList<Card> hand)
    {
        this.name = name;
        this.hand = hand;
        this.points = 0;
    }

    public String getName()
    {
        return this.name;
    }

    public ArrayList<Card> getHand()
    {
        return this.hand;
    }

    public int getPoints()
    {
        return this.points;
    }

    public void addPoints(int numPoints)
    {
        this.points += numPoints;
    }

    public void addCard(Card c)
    {
        hand.add(c);
    }
    public String toString()
    {
        return name + " has " + points + " points " + "\n" + name + "'s cards: " + hand;
    }






}


