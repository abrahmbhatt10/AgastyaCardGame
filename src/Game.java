import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    private Player gameUser;
    private Player gameDealer;
    private Deck gameDeck;

    public Game(Player a, Player b)
    {
        this.gameUser = new Player(a.getName(), a.getHand());
        this.gameDealer = new Player(b.getName(), b.getHand());
        this.gameDeck = new Deck();
    }

    public void printInstructions()
    {
        System.out.println("Game Instructions: Draw a card while the dealer draws cards. Try to draw as close to 21 as possible. If one of you exceeds 21 points, the game will end and whoever is closest to 21 will end.");
    }

    public void playGame()
    {
        printInstructions();
        gameDeck.shuffle();
        gameDealer.addCard(gameDeck.deal());
        gameDealer.addCard(gameDeck.deal());
        System.out.println("Dealer cards");
        System.out.println(gameDealer.toString());
        gameUser.addCard(gameDeck.deal());
        gameUser.addCard(gameDeck.deal());
        System.out.println("User cards");
        System.out.println(gameUser.toString());

        while(gameDealer.getPoints() <= 21 || gameUser.getPoints() <= 21)
        {
            System.out.print("Dealer points ");
            System.out.println(gameDealer.getPoints());

            System.out.print("User points ");
            System.out.println(gameUser.getPoints());

            Scanner sInput = new Scanner(System.in);
            System.out.println("Would you like to gain a card or hold? type a for gain or b for hold");
            String nextMove = sInput.nextLine();
            if(nextMove.equals("a"))
            {
                gameUser.addCard(gameDeck.deal());
            }
            if(Math.abs(gameUser.getPoints() - 21) < Math.abs(gameDealer.getPoints() - 21))
            {
                gameDealer.addCard(gameDeck.deal());
            }
        }
        if(Math.abs(gameUser.getPoints() - 21) > Math.abs(gameDealer.getPoints() - 21))
        {
            System.out.println("Dealer has won");
        }
        if(Math.abs(gameUser.getPoints() - 21) == Math.abs(gameDealer.getPoints() - 21))
        {
            System.out.println("It's a Tie");
        }
        System.out.println("User has won");
    }







}
