public class FRQAnswers {
    public FRQAnswers() {}

    public String longestStreak(String str) {
        String charLongest = str.substring(0, 1);
        String charCurrent = charLongest;
        int streak = 1;
        int longest = 1;
        for (int i = 1; i < str.length(); i++) {
          if (str.substring(i, i+1).equals(charCurrent)) {
            streak++;
            if (streak > longest) {
              longest = streak;
              charLongest = charCurrent;
            }
          } else {
            streak = 1;
            charCurrent = str.substring(i, i+1);
          }
        }
        return (charLongest + " " + longest);
      }
           
         
      
}
