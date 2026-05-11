package MethodsLab;

import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        executeOperation(operation, firstNumber,secondNumber);

    }
    public static void executeOperation (String operation, int firstNumber, int secondNumber) {
        switch (operation) {
            case "add":
                //събиране на firstNumber и secondNumber -> отпечатвам сумата
                sumAndPrint (firstNumber,secondNumber);
                break;
            case "multiply":
                //умножние на firstNumber и secondNumber -> отпечатвам произведението
                myltiplyAndPrint (firstNumber, secondNumber);
                break;
            case "subtract":
                //изваждане на firstNumber и secondNumber -> отпечатвам разлика
                subtractAndPrint (firstNumber, secondNumber);
                break;
            case "divide":
                //деление на firstNumber и secondNumber -> отпечатвам частно
                divideAndPrint (firstNumber, secondNumber);
                break;
        }
    }

    //метод, който дели две цели числа и отпечатва частно
    private static void divideAndPrint(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    //метод, който изважда две цели числа и отпечатва разлика
    private static void subtractAndPrint(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    //метод, който умножава две цели числа и отпечатва произведението
    private static void myltiplyAndPrint(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    //метод, който събира две цели числа и отпечтва сумата
    private static void sumAndPrint(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
