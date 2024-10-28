import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What number do you want to count up to? ");
    int countTo = scanner.nextInt();
    
    int counter = 1;
    while (counter <= countTo) {
        System.out.println(counter);
        counter++;
    }
    scanner.close();
    }
}