import java.io.*;
import java.util.*;

public class Date {

    public static void main(String[] args){
      String day = "Saturday";
      int date = 26;
      String month = "February";
      int year = 2022;
      System.out.println("American format: ");
      System.out.println(day + ", " + month + " " + date + ", " + year);
      System.out.println("European format: ");
      System.out.println(day + " " + date + " " + month + " " + year);
    }
}