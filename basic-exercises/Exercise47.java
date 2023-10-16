// Exercise 47.
// Write a Java program to display the current date and time in a specific format.
// Sample Output:
//
// Now: 2017/06/16 08:52:03.066 

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise47 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss.SSS");
        System.out.println("Now: " + formatter.format(now));
    }
}
