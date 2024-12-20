import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws InterruptedException {

    int GameActive = 1;
    
    while (GameActive==1) {

      // Clears the console
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // Creates a reader instance which takes
      // input from standard input - keyboard
      Scanner reader = new Scanner(System.in);
    
      System.out.println("\nWelcome to Rock Paper Scissors!\n");
    
      System.out.println("\nChoose Rock Paper or Scissors:\n");

      // Random number between 1 - 50
      Random rand = new Random();
      
      // rand.nextInt((max - min) + 1) + min;
      int CompChoice = rand.nextInt((2 - 0) + 1) + 0;
      System.out.println();  // print CompChoice to test comp answer


      int UCActive = 1;
      int Result = 0;
      while (UCActive==1) {
        // nextChar() reads the next character from the keyboard
        String UserChoice = reader.nextLine();
        
        if (UserChoice.matches("rock")) {
          System.out.println("\nYou chose rock!\n\nYour opponent chose...\n\n");
          Thread.sleep(5000);
          if (CompChoice==0) {
            System.out.println("ROCK!\n");
            Result = 2;
          } else if (CompChoice==1) {
            System.out.println("PAPER!\n");
            Result = 0;
          } else {
            System.out.println("SCISSORS!\n");
            Result = 1;
          }
          UCActive = 0;
        } else if (UserChoice.matches("paper")) {
          System.out.println("\nYou chose paper!\n\nYour opponent chose...\n\n");
          Thread.sleep(5000);
          if (CompChoice==0) {
            System.out.println("ROCK!\n");
            Result = 1;
          } else if (CompChoice==1) {
            System.out.println("PAPER!\n");
            Result = 2;
          } else {
            System.out.println("SCISSORS!\n");
            Result = 0;
          }
          UCActive = 0;
        } else if (UserChoice.matches("scissors")) {
          System.out.println("\nYou chose scissors!\n\nYour opponent chose...\n\n");
          Thread.sleep(5000);
          if (CompChoice==0) {
            System.out.println("ROCK!\n");
            Result = 0;
          } else if (CompChoice==1) {
            System.out.println("PAPER!\n");
            Result = 1;
          } else {
            System.out.println("SCISSORS!\n");
            Result = 2;
          }
          UCActive = 0;
        } else {
          System.out.println("Please enter \"rock\" \"paper\" or \"scissors\"");
        }
      }

      if (Result==2) {
          System.out.println("YOU TIED!\n");
        } else if (Result==1) {
          System.out.println("YOU WIN!!!\n");
        } else {
          System.out.println("YOU LOST! :(\n");
        }

      System.out.println("Play again?\n\nType \"end\" to end the program");
  
      String UserAns = reader.nextLine();
      if (UserAns.matches("end")) {
        GameActive = 0;
      }
    }
  }
}
