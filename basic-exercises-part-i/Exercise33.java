// Exercise 33.
//  Write a Java program and compute the sum of an integer's digits.
// Input Data:
// Input an integer: 25
// Expected Output
// 
// The sum of the digits is: 7

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int input = scanner.nextInt();
        scanner.close();
        System.out.println(sumDigit(input));
    }

    public static int sumDigit(int num){
        int result = 0;
        while(num != 0){
            result += num%10;
            num /= 10;
        }
        return result;
    }
}
