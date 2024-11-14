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
    /* COPY/PASTE YOUR SOLUTION TO PART A HERE */
    }
    
    
    /** Plays a simulated game between two players, as described in part
      * (b).
      */
    public void playGame() {
    /* COPY/PASTE YOUR SOLUTION TO PART B HERE */
    }
    }
    
