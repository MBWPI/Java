import java.util.Random;

class Main {
  public static void main(String[] args) {
    // Random number between 1 - 50
    
    Random rand = new Random();

    // Obtain a number between [0 - 49]
    int n = rand.nextInt(50);

    // Add 1 to the result to get a number from the required range
    // (i.e., [1 - 50]
    n += 1;

    System.out.println("\nFirst method:");
    System.out.println(n);


    
    // Second method
    double random = Math.random() * 49 + 1;
    System.out.println("\nSecond method:");
    System.out.println(random);
    

    
    // Third method
    int random2 = (int)(Math.random() * 50 + 1);
    System.out.println("\nThird method:");
    System.out.println(random2);


    
    // Fourth method
    // rand.nextInt((max - min) + 1) + min;
    int n2 = rand.nextInt((50 - 1) + 1) + 1;
    System.out.println("\nFourth method:");
    System.out.println(n2);
    
    System.out.println();
    
  }
}
