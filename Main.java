import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Read the the input by using a Scanner.
    Scanner scanner = new Scanner(System.in);

    // Display in the console a line to write in
    System.out.println("Write message here: ");

    // String the message by using a String
    String message = scanner.nextLine();

    // Print out the message that someone wrote.
    System.out.println("You entered:");
    System.out.println(message);
    
  }
}