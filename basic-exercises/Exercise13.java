// Exercise 13.
// Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.5 Height = 8.5

// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20 

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of rectangle: ");
        double height = scanner.nextDouble();
        scanner.close();

        System.out.println("Area is " + width + " * " + height + " = " + (width*height));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + (2*(width+height)));
    }
}
