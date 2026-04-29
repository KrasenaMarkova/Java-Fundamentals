package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;
//Write a program that determines if an element exists in the array such that the sum of the elements
// on its left is equal to the sum of the elements on its right. If there are no elements to the
// left/right, their sum is considered to be 0. Print the index that satisfies the required condition
// or "no" if there is no such index.

public class EqualSums06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] elementOfArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer ::parseInt)
                .toArray();

        // Вземаме всяко едно число от масива
        for (int position = 0; position <= elementOfArray.length - 1 ; position++) {

            //проверяваме дали сумата на числата в ляво е равна на сумата на числата в дясно
            int leftSum = 0;
            int rightSum = 0;

            //Обхождам всички числа в ляво:
            for (int leftposition = 0; leftposition < position; leftposition++) {
                leftSum += elementOfArray [leftposition];
            }

            // Обхождам всички числа в дясно:
            for (int rightposition = position + 1; rightposition <= elementOfArray.length - 1 ; rightposition++) {
                rightSum += elementOfArray [rightposition];
            }
            if (leftSum == rightSum) {
                System.out.println(position);
                return;
            }
        }
        System.out.println("no");
    }
}
