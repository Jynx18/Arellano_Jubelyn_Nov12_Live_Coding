package com.mycompany.arellano_problem1;

import java.util.Scanner;

public class Arellano_Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input integer
        int number = input.nextInt();
        int result = sumOfDigits(number);

        // Validate input and display the sum of its digit
        if (number < 0) {
            System.out.println("Invalid Input.");
        } else {
            System.out.println(result);
        }
        input.close();
    }

    // Recursively calculates the sum of all digits in a non-negative integer
    public static int sumOfDigits(int number) {

        // Base case: stop when no digits remain
        if (number == 0) {
            return 0;
        }
        // Add the last digit (number % 10) to the sum of the remaining digits
        return (number % 10) + sumOfDigits(number / 10);
    }
}
