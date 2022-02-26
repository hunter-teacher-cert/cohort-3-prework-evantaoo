import java.io.*;
import java.util.*;
import java.lang.*;

public class Guess {

    public static void main(String[] args){
      int guess, actual; 
      Scanner in = new Scanner(System.in);

      // generate random value from 1 to 100
      Random random = new Random();
      actual = random.nextInt(100) + 1;

      // prompt the user and get the value
      System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
      System.out.print("Type a number: ");
      guess = in.nextInt();

      // reveal actual value
      System.out.println("Your guess is: " + guess);
      System.out.println("The number I was thinking of is: " + actual);
      System.out.println("You were off by: " + Math.abs(guess - actual));
    }
}