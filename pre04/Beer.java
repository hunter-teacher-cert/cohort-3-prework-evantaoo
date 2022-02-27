import java.io.*;
import java.util.*;

public class Beer {

    static void Sing (int n){
      if (n < 1)
        System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
      else
      {
        System.out.printf("%d bottles of beer on the wall, %d bottles of beer, ya’ take one down, ya’ pass it around, %d bottles of beer on the wall.\n\n", n, n, n - 1);
        Sing(n - 1);
      }
    }
  
    public static void main(String[] args){
      Sing(99);
    }
}