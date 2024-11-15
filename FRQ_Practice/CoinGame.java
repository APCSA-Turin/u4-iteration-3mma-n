public class CoinGame {


    private int startingCoins;  // starting number of coins
    private int maxRounds;      // maximum number of rounds played
    private int roundTracker = 1; // ADDED TO ENABLE TESTING
    
    
    public CoinGame(int s, int r) {
    startingCoins = s;
    maxRounds = r;
    }
     
    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
        THIS WAS AN "implementation not shown" METHOD IN THE ORIGINAL FRQ,
        BUT IS INCLUDED HERE TO ENABLE TESTING
      */
    public int getPlayer1Move() {
      int result;
      if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
        result = 2;
      } else if (roundTracker == 3) {
        result = 1;
      } else {
        result = 3;
      }
      roundTracker++;
      return result;
    }
     
    /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
      * as described in part (a).
      */
    public int getPlayer2Move(int round) {
      if (round % 3 == 0) {
        return 3;
      } else if (round % 2 == 0) {
        return 2;
      } else {
        return 1;
      }
    
    }
    
    
    /** Plays a simulated game between two players, as described in part
      * (b).
      */
    public void playGame() {
      int round = 1;
      int p1Coins = startingCoins;
      int p2Coins = startingCoins;
      while (round<=maxRounds && p1Coins>=3 && p2Coins>=3) {
        int p1Spend = getPlayer1Move();
        int p2Spend = getPlayer2Move(round);
        p1Coins -= p1Spend;
        p2Coins -= p2Spend;
        int diff = Math.abs(p1Spend - p2Spend);
        if (diff < 2) {
          p2Coins += 1;
        } else {
          p1Coins += 2;
        }
      round++;
      }
      if (p1Coins > p2Coins) {
        System.out.println("player 1 wins");
      } else if (p1Coins < p2Coins) {
        System.out.println("player 2 wins");
      } else {
        System.out.println("tie game");
      }
    
    }
}
    
