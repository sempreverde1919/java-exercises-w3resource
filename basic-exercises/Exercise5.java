// Exercise 5.
// Write a Java program that takes two numbers as input and displays the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        int first = scanner.nextInt();
        System.out.println("Input the second number:");
        int second = scanner.nextInt();
        System.out.println(first + " x " + second + " = " + first*second);
    }
}
