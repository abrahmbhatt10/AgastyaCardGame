public class Card {
    private String rank;
    private String suit;
    private int point;

    public Card(String rank, String suit, int point)
    {
        this.rank = rank;
        this.suit = suit;
        this.point = point;
    }

    public String getRank()
    {
        return this.rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public String getSuit()
    {
        return this.suit;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    public int getPoint()
    {
        return this.point;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public String toString()
    {
        return rank + " of " + suit;
    }




}
