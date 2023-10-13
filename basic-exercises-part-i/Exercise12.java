// Exercise 12. 
// Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input third number: ");
        int third = scanner.nextInt();
        scanner.close();

        System.out.println("Average of numbers is: " + (first+second+third)/3);

    }
}
