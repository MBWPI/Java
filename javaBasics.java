class Main {
  public static void main(String[] args) throws InterruptedException {
    // add "throws InterruptedException" above to make Sleep work

    // 1.
    // The basic first print command
    System.out.println("\nHello world!\n");

    // Clearing the console notification then 5 second sleep
    System.out.println("Clearing the console in 5 seconds...");
    Thread.sleep(5000);

    
    // 2.
    // Clearing the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    
    // 3.
    // Printing, blank lines, and next lines
    System.out.print("System.out.print prints text");

    // \n in text to skip lines
    System.out.print("\n\nAdd backslash and letter n within the quotation marks to go to the next line\n");

    // Blank line after a print
    System.out.println();
    System.out.println("System.out.println prints a blank line after the print");
    // System.out.print() does not work/error occurs


    // 4.
    // Notifying user of a sleep
    System.out.println("\n\nSleeping for 5 seconds...");

    // Sleep command.  By the thousandths
    Thread.sleep(5000);

    // Notifying user that sleep is over
    System.out.println("\nSlept for 5 seconds.");


    
    // Summary
    // 1. Prints Hello World
    // 2. Clear console
    // 3. Printing, blank lines, and next lines
    // 4. Sleep
  }
}
