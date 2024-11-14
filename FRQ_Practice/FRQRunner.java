public class FRQRunner {
    public static void main(String[] args) {
        FRQAnswers frq = new FRQAnswers();
        System.out.println(frq.longestStreak("CCAAAAATTT!"));
        System.out.println(frq.longestStreak("CCCCAAATTT!"));
        System.out.println(frq.longestStreak("CCCAATTT!"));
        System.out.println(frq.longestStreak("CCCCAATTTTTT!"));
        System.out.println(frq.longestStreak("cbbaaabbmgg"));
        System.out.println(frq.longestStreak("cbbaaabbggg"));
        System.out.println(frq.longestStreak("ABCDEFGHIJ"));
        System.out.println(frq.longestStreak("AAAAAAAAAA"));
    }
}