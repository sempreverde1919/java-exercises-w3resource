// Exercise 11.
// Write a Java program to print the area and perimeter of a circle.
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586 

import java.util.Scanner;

public class Exercise11 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius of circle: ");
    double radius = scanner.nextDouble();
    scanner.close();

    double pi = 3.14;
    System.out.println("Perimeter is = " + 2*radius*pi);
    System.out.println("Area is = " + radius*radius*pi);
   } 
}
