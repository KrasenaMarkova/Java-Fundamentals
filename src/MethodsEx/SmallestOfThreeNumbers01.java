package MethodsEx;

import java.util.Scanner;
//Write a method to print the smallest of three integer numbers. Use an appropriate name for the method.

public class SmallestOfThreeNumbers01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNUmber( firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallestNUmber(int firstNumber, int secondNumber, int thirdNumber) {

        System.out.println(Math.min(Math.min(firstNumber, secondNumber), thirdNumber));

    }
}
