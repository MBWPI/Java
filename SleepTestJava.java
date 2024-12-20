import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    // Creates a reader instance which takes
    // input from standard input - keyboard
    Scanner reader = new Scanner(System.in);
    System.out.println("\nHow many seconds would you like to wait?");

    // nextInt() reads the next integer from the keyboard
    int number = reader.nextInt();

    // println() prints the following line to the output screen
    System.out.println("\nWaiting for " + number + " seconds...\n");

    // Sleep command but halved
    Thread.sleep((number * 1000) / 2);
    System.out.println("Halfway there...\n");
    Thread.sleep((number * 1000) / 2);

    // Prints how long it has waited/sleeped
    System.out.println("Waited for " + number + " seconds.");
    
  }
}
