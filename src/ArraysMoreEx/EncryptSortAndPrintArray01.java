package ArraysMoreEx;

import java.util.Arrays;
import java.util.Scanner;
//Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
//•	The code of each vowel multiplied by the string length.
//•	The code of each consonant is divided by the string length.
//Sort the number sequence in ascending order and print it on the console.
//On the first line, you will always receive the number of strings you must read.

public class EncryptSortAndPrintArray01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfRows = Integer.parseInt(scanner.nextLine());
        int [] arrayOfSum = new int[numberOfRows];

        for (int row = 0; row < numberOfRows ; row++) {

            String input = scanner.nextLine();
            int sum = 0;

            for (int j = 0; j < input.length(); j++) {

                char symbol = input.charAt(j);
                switch (symbol) {
                    case 'a':
                    case 'o':
                    case 'e':
                    case 'i':
                    case 'u':
                    case 'A':
                    case 'O':
                    case 'E':
                    case 'I':
                    case 'U':
                    sum += symbol * input.length();
                        break;
                    default:
                        sum += symbol / input.length();
                        break;
                }
                arrayOfSum[row] = sum;
            }
        }
        Arrays.sort(arrayOfSum);
        for (int sum : arrayOfSum) {
            System.out.println(sum);
        }
    }
}
