package T3_LoopsString;

public class StringLoopRunner {
    public static void main(String[] args) {
        StringLoops loops = new StringLoops();
        System.out.println(loops.removeString("an", "canned beans and bananas"));
        System.out.println(loops.removeString(" ", "canned beans and bananas"));
        System.out.println(loops.removeString("tat", "Ratatattat"));
        System.out.println(loops.removeString("lower", "sunflower"));
        System.out.println(loops.removeString("haha", "hahahahaha"));
        System.out.println(loops.removeString("ha", "hahahahaha"));
        System.out.println(loops.removeString("hah", "hahahahaha"));
        System.out.println(loops.removeString("ah", "aaaaaahhhhhh!")); // careful!
        System.out.println(loops.removeString("rain", "it’s the brain drain pain train"));
        System.out.println(loops.removeString("lol", "lolololol"));
        System.out.println(loops.removeString("was", "I was about to call you"));
        System.out.println(loops.removeString("but", "I was about to call you"));
        System.out.println(loops.removeString("AB", "ABABABABABC"));
        System.out.println(loops.removeString("AB", "AAAAABBBBBC"));  // careful!
        System.out.println(loops.removeString("i", "iiiit's supercalifragilisticexpialidociousi"));        
    }
}
