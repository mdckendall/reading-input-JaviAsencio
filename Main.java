import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    
// Ask the user to input a word.
System.out.println("Enter a word:");
    
    // Read the input by using a Scanner.
    Scanner word = new Scanner(System.in);
    
    // String the message by using a String
    String someString = word.nextLine();

    // Print out the message that someone wrote while mentioning the length of the string.
    System.out.println(someString.length());
  }
}
