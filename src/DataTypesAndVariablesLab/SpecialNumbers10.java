package DataTypesAndVariablesLab;

import java.util.Scanner;
//A number is special when its sum of digits is 5, 7, or 11.
//Write a program to read an integer n and for all numbers in the range 1…n
// to print the number and if it is special or not (True / False).

public class SpecialNumbers10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n ; number++) {
            // променлива sum за да може тя да се нулира за всяко отделно число
            int sum = 0;
            int currentNumber = number;

            while (currentNumber != 0) {
                int lastDigit = currentNumber % 10;
                sum += lastDigit;
                currentNumber /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True\n", number);
            } else {
                System.out.printf("%d -> False\n", number);
            }
        }
    }
}
