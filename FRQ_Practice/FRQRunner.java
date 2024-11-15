public class FRQRunner {
    public static void main(String[] args) {
        CoinGame game1 = new CoinGame(10, 5);
        game1.playGame();
        
        CoinGame game2 = new CoinGame(10, 4);
        game2.playGame();
        
        CoinGame game3 = new CoinGame(10, 3);
        game3.playGame();
        
        CoinGame game4 = new CoinGame(10, 2);
        game4.playGame();
        
        CoinGame game5 = new CoinGame(10, 6);
        game5.playGame();
        
        CoinGame game6 = new CoinGame(5, 4);
        game6.playGame();
        
        CoinGame game7 = new CoinGame(7, 4);
        game7.playGame();
        
    }
}