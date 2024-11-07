public class T2L1Test {
    public static void main(String[] args) {
        StringLoops loops = new StringLoops();
        System.out.println("--- testing countCharacters ---");
        System.out.println(loops.countCharacters("a", "Apple and banana"));
        System.out.println(loops.countCharacters("A", "Apple and banana"));
        System.out.println(loops.countCharacters("!", "Hello! Nice day!"));
        System.out.println(loops.countCharacters("g", "Hello! Nice day!"));
        System.out.println("\n--- testing reverseString ---");
        System.out.println(loops.reverseString("hello!"));
        System.out.println(loops.reverseString("Apples and bananas"));
        System.out.println(loops.reverseString("C"));
    }
}
