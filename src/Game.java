import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    private Player a;
    private Player b;
    private Deck d;

    public Game(Player a, Player b)
    {
        this.a = new Player(a.getName(), a.getHand());
        this.b = new Player(b.getName(), b.getHand());
    }

    public void printInstructions()
    {
        System.out.println("Game Instructions: Draw a card while the dealer draws cards. Try to draw as close to 21 as possible. If one of you exceeds 21 points, the game will end and whoever is closest to 21 will end.");
    }

    public void playGame()
    {
        printInstructions();
        Player dealer = new Player("Dealer");
        Player user = new Player("User");
        ArrayList<String> ranks = new ArrayList<String>();
        ranks.add("ace");
        ranks.add("king");
        ranks.add("queen");
        ranks.add("jack");
        ranks.add("10");
        ranks.add("9");
        ranks.add("8");
        ranks.add("7");
        ranks.add("6");
        ranks.add("5");
        ranks.add("4");
        ranks.add("3");
        ranks.add("2");
        ArrayList<String> suits = new ArrayList<String> ();
        suits.add("Spades");
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Clubs");
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(13);
        values.add(12);
        values.add(11);
        Deck d = new Deck(ranks, suits, values);
        d.shuffle();
        dealer.addCard(d.deal());
        dealer.addCard(d.deal());
        user.addCard(d.deal());
        user.addCard(d.deal());
        while(dealer.getPoints() <= 21 || user.getPoints() <= 21)
        {
            System.out.println(dealer.getPoints());
            Scanner sInput = new Scanner(System.in);
            System.out.println("Would you like to gain a card or hold? type a for gain or b for hold");
            String nextMove = sInput.nextLine();
            if(nextMove.equals("a"))
            {
                user.addCard(d.deal());
            }
            if(Math.abs(user.getPoints() - 21) < Math.abs(dealer.getPoints() - 21))
            {
                dealer.addCard(d.deal());
            }
        }
        if(Math.abs(user.getPoints() - 21) > Math.abs(dealer.getPoints() - 21))
        {
            System.out.println("Dealer has won");
        }
        if(Math.abs(user.getPoints() - 21) == Math.abs(dealer.getPoints() - 21))
        {
            System.out.println("It's a Tie");
        }
        System.out.println("User has won");
    }







}
