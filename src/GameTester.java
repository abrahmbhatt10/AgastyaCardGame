public class GameTester {
    public static void main(String[] args) {
        Player mFirst = new Player("User");
        Player mSecond = new Player("Dealer");
        Game mygame = new Game(mFirst, mSecond);
        mygame.playGame();
    }
}


