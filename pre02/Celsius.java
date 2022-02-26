import java.io.*;
import java.util.*;

public class Celsius {

    public static void main(String[] args){
      double deg_c, deg_f;
      Scanner in = new Scanner(System.in);

      // prompt the user and get the value
      System.out.print("How many degrees in Celsius? ");
      deg_c = in.nextDouble();

      // convert and output the result
      deg_f = (deg_c * (9f / 5f) + 32);
      System.out.printf("%.1f C = %.1f F\n",
                        deg_c, deg_f);
    }
}