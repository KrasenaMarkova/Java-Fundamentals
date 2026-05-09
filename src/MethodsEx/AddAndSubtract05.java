package MethodsEx;

import java.util.Scanner;
//You will receive 3 integers. Write a method sum to get the sum of the first two integers and subtract
// the method that subtracts the third integer from the result from the sum method.

public class AddAndSubtract05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sumOfFirstTwoInteger = sumOfFirstTwoInteger(firstNumber, secondNumber);
        int result = subtractTwoNumbers (sumOfFirstTwoInteger, thirdNumber);

        System.out.println(result);
    }

    public static int subtractTwoNumbers(int sumOfFirstTwoInteger, int thirdNumber) {
        return sumOfFirstTwoInteger - thirdNumber;
    }

    public static int sumOfFirstTwoInteger(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
