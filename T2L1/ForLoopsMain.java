public class ForLoopsMain {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i=0; i<10; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println("");

        for (int i=15; i>0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i=15; i>=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i=1; i<=20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        for (int i=2; i<=20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
