package DataTypesAndVariablesEx;

import java.util.Scanner;

//You will be given a single integer. Your task is to find the sum of its digits.
public class SumDigits02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int currentNumber = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;

        while (currentNumber != 0) {
            int lastDigit = currentNumber % 10;
            sumOfDigits += lastDigit;
            currentNumber /= 10;
        }
        System.out.println(sumOfDigits);
    }
}
