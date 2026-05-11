package MethodsLab;

import java.util.Scanner;
//Create a method that prints the sign of an integer number.

public class SignOfIntegerNumbers01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printTypeOfInteger(Integer.parseInt(scanner.nextLine()));
    }

    public static void printTypeOfInteger (int input) {
        if (input > 0) {
            System.out.printf("The number %d is positive.", input);
        } else if (input == 0) {
            System.out.println("The number 0 is zero.");
        } else {
            System.out.printf("The number %d is negative.", input);
        }
    }
}
