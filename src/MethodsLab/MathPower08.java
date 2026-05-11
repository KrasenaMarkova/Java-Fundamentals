package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;
//Create a method that calculates and returns the value of a number raised to a given power.

public class MathPower08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.00f", calculatePower(number, power));

    }
    public static double calculatePower(double number, int power) {
        return Math.pow(number,power);
    }
}
