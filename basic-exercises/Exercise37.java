// Exercise 37.
// Write a Java program to reverse a string.
// Input Data:
// Input a string: The quick brown fox
// Expected Output
// 
// Reverse string: xof nworb kciuq ehT

import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.print("Input a string to reverse: ");
        String input = scannner.nextLine();
        scannner.close();

        String result = "";
        for(int i = input.length()-1; i>=0; i--){
            result += input.charAt(i);
        }
        System.out.println(result);
    }    
}
