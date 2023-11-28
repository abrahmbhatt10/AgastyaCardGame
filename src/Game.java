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
        System.out.println("Game Instructions: ");
    }

    public void playGame()
    {
        printInstructions();
    }







}
