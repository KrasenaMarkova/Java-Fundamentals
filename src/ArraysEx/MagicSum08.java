package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;
//Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.

public class MagicSum08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int position = 0; position < numbers.length - 1; position++) {
            int currentNumber = numbers[position];

            for (int nextPosition = position + 1; nextPosition <= numbers.length - 1; nextPosition++) {
                int nextNumber = numbers[nextPosition];

                if (currentNumber + nextNumber == magicNum) {
                    System.out.printf("%d %d\n", currentNumber, nextNumber);
            }
        }
        }
    }
}
