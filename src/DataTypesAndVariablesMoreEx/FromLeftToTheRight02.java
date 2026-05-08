package DataTypesAndVariablesMoreEx;

import java.util.Arrays;
import java.util.Scanner;
//You will receive a number representing how many lines we will get as input.
// On the next N lines, you will receive a string with 2 numbers separated by a single space.
// You need to compare them. If the left number is greater than the right number, you need to print the sum
// of all digits in the left number, otherwise, print the sum of all digits in the right number.

public class FromLeftToTheRight02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberRows = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberRows ; i++) {
            //всяко въведено число го запазваме в отделна променлива
            long numberLeft = Long.parseLong(scanner.next());
            long numberRight = Long.parseLong(scanner.next());
            long sum = 0;

            if (numberLeft > numberRight) {
                long leftNum = numberLeft;
                while (leftNum != 0){
                    sum += Math.abs(leftNum % 10);
                    leftNum = Math.abs(leftNum / 10);
                }
                System.out.println(Math.abs(sum));
            } else {
                long rightNum = numberRight;
                while (rightNum != 0){
                    sum += Math.abs(rightNum % 10);
                    rightNum = Math.abs(rightNum / 10);
                }
                System.out.println(Math.abs(sum));
            }
        }
    }
}
