import java.io.*;
import java.util.*;

public class Time {

    public static void main(String[] args){
      int hour = 9;
      int minute = 04;
      int second = 30;
      int seconds_midnight = (hour * 3600) + (minute * 60) + second;
      int seconds_remaining = ((24 - hour) * 3600)+ ((60 - minute) * 60) + (60 - second);
      float day_remaining = (float)seconds_remaining / (float)(seconds_midnight + seconds_remaining);

      int curr_hour = 9;
      int curr_minute = 19;
      int curr_second = 25;

      int curr_seconds_midnight = (curr_hour * 3600) + (curr_minute * 60) + curr_second;
      int elapsed_time = curr_seconds_midnight - seconds_midnight;
        
      System.out.println("Number of seconds since midnight:");
      System.out.println(seconds_midnight);
      System.out.println(seconds_remaining);
      System.out.println(day_remaining * 100 + "%");
      System.out.println(elapsed_time);
    }
}