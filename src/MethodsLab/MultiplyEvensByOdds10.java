package MethodsLab;

import java.util.Scanner;
//Create a program that reads an integer number and multiplies the sum of all
// its even digits by the sum of all its odd digits:

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //създаваме масив, който чрез метода returnSumOfEvenAndOdd  и Math.abs връща положителни стойности
        int sum [] = returnSumOfEvenAndOdd(Math.abs(number));

        // отпечатваме умножената сума на всички четни и нечетни числа
        System.out.println(sum [0] * sum [1]);
    }

    // създаваме метод, който намира сумите на всички четни нечетни числа
    public static int [] returnSumOfEvenAndOdd (int number) {
        int sumOdd = 0;
        int sumEven = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumEven += lastDigit;
            } else {
                sumOdd += lastDigit;
            }
            number /= 10;
        }
        // като резултат от метода връщаме масив с 2 стойности на сумите на четните и нечетните числа
        return new int[] {sumEven, sumOdd};
    }
}
