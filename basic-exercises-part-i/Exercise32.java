// Exercise 32.
// Write a Java program to compare two numbers.
// Input Data:
// Input first integer: 25
// Input second integer: 39
// Expected Output
// 
// 25 != 39                                                                          
// 25 < 39                                                                           
// 25 <= 39

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int first = scanner.nextInt();
        System.out.print("Input second integer: ");
        int second = scanner.nextInt();
        scanner.close();

        if(first==second){
            System.out.println("\n" + first + " = " + second);
            System.out.println(first + " >= " + second);
            System.out.println(first + " <= " + second);
        }else if(first>second){
            System.out.println("\n" + first + " != " + second);
            System.out.println(first + " > " + second);
            System.out.println(first + " >= " + second);
        }else{
            System.out.println("\n" + first + " != " + second);
            System.out.println(first + " < " + second);
            System.out.println(first + " <= " + second);
        }

    }
}
