package MethodsLab;

import java.util.Scanner;
//You are given two values of the same type as input. The values can be of type int, char of String.
// Create a method getMax() that returns the greater of the two values:

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // "int", "char, "string"
        String type = scanner.nextLine();
        int biggerNumber = compareAndPrintInt(2, 6);
        executeComparisonByType(scanner, type);

    }

    public static void executeComparisonByType(Scanner scanner, String type) {
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                //сравнявам -> отпечатвам по-големия
                compareAndPrint(firstNumber, secondNumber);
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                //сравнявам -> отпечатвам по-големия
                compareAndPrint(firstSymbol, secondSymbol);
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                //сравнявам -> отпечатвам по-големия
                compareAndPrint(firstText, secondText);
                break;
        }
    }

    private static void compareAndPrint(String firstText, String secondText) {
        //equals -> сравнява дали два текста са еднакви
        //compareTo -> сравнява два текста
        //1 -> първия текст > втория текст
        //-1 -> първия текст < втория текст

        if (firstText.compareTo(secondText) > 0) {
            System.out.println(firstText);
        } else {
            System.out.println(secondText);
        }
    }

    public static void compareAndPrint(char firstSymbol, char secondSymbol) {
        // сравнявайки два символа, реално сравняваме цифровите им стойности в ASCI таблицата
        if (firstSymbol > secondSymbol) {
            System.out.println(firstSymbol);
        } else {
            System.out.println(secondSymbol);
        }
    }

    public static void compareAndPrint(int firstNumber, int secondNumber) {
        int max = Math.max(firstNumber, secondNumber);
        System.out.println(max);
    }

    public static int compareAndPrintInt(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
