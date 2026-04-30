package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;
//Read two arrays and print on the console whether they are identical or not. Arrays are identical
// if their elements are equal. If the arrays are identical, find the sum of the first one and print on
// the console the following message: "Arrays are identical. Sum: {sum}", otherwise find the first index where
// the arrays differ and print on the console following message: "Arrays are not identical. Found difference at {index} index."

public class EqualArrays06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int [] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean identical = true;
         int sumOfTheFirstArray = 0;
         int foundPosition = 0;

        for (int position = 0; position <= firstArray.length - 1; position++) {
            int firstNum = firstArray[position];
            int secondNum = secondArray[position];

            if (firstNum == secondNum){
                sumOfTheFirstArray += firstNum;
            } else {
                foundPosition = position;
                identical = false;
                break;
            }
        }
        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d\n", sumOfTheFirstArray);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.\n", foundPosition);
        }
    }
}
