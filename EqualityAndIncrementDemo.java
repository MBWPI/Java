class EqualityAndIncrementDemo {
  public static void main(String[] args) {
    
    int j = 5; // Initialize j to 5
    int k = 6; // Initialize k to 6

    // Compare j and k using the equality operator (==)
    System.out.println("\nj == k is...");
    System.out.println(j == k); // Prints false because j (5) is not equal to k (6)
    System.out.println("j is " + j + "\n" + "k is " + k); // Displays the values of j and k

    // Use post-increment on j and compare j++ with k
    System.out.println("\nj++ == k is...");
    System.out.println(j++ == k); // Evaluates to false because j (5) is compared to k (6) before incrementing j
    System.out.println("j is " + j + "\n" + "k is " + k); // j is now incremented to 6, k remains 6

    // Compare j and k again after incrementing j
    System.out.println("\nj == k is...");
    System.out.println(j == k); // Prints true because j (6) is now equal to k (6)
    System.out.println("j is " + j + "\n" + "k is " + k + "\n"); // Displays the updated values of j and k
  }
}
