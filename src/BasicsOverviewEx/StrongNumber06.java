package BasicsOverviewEx;

import java.util.Scanner;
//Write a program to check whether or not a given number is strong.
// A number is strong if the sum of the Factorial of each digit is equal to the number.
// For example 145 is a strong number, because 1! + 4! + 5! = 145.
// Print "yes" if the number is strong and "no" if the number is not strong.

public class StrongNumber06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int strongNumber = Integer.parseInt(scanner.nextLine());

        int number = strongNumber;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sumOfFactorials += factorial;
            number /= 10;
        }
        if (strongNumber == sumOfFactorials) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
