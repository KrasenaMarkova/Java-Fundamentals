package ArraysEx;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//Write a program to find all the top integers in an array. A top integer is an integer
// that isbigger than all the elements to its right.

public class TopIntegers05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt).toArray();

        for (int position = 0; position < numbers.length - 1 ; position++) {
            int currentNumber = numbers [position];
            boolean isTop = true;

            for (int nextposition = position + 1; nextposition < numbers.length ; nextposition++) {
                int nextNumber = numbers[nextposition];

                if (nextNumber >= currentNumber) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }
        System.out.println(numbers[numbers.length - 1]);
    }
}
