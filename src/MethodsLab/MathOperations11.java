package MethodsLab;

import java.util.Scanner;
//Write a method that receives two numbers and an operator, calculates the result, and returns it.
// You will be given three lines of input. The first will be the first number,
// the second one will be the operator, and the last one will be the second number.
// The possible operators are: / * + -
//Print the result rounded up to the second decimal point.

public class MathOperations11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        calculation(firstNumber, operator, secondNumber);
    }
    public static double calculation(int firstNumber, String operator, int secondNumber) {
    double result = 0.0;

    switch (operator) {
        case "/":
            divide(firstNumber, secondNumber);
            break;
        case "*":
            multiplicat(firstNumber, secondNumber);
            break;
        case "+":
            add(firstNumber, secondNumber);
            break;
        case "-":
            subtraction(firstNumber, secondNumber);
            break;
    }

        return result;
    }

    private static void subtraction(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    public static void add (int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber);
    }
    private static void multiplicat(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    public static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }
}
