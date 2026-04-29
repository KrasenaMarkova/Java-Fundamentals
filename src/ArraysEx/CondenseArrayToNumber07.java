package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;
//Write a program to read an array of integers and condense them by summing adjacent couples of
// elements until a single integer is obtained. For example, if we have 3 elements {2, 10, 3},
// we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
// then we sum again all adjacent elements and obtain {12+13} = {25}.

public class CondenseArrayToNumber07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

       if (numbers.length == 1) {
           System.out.print(numbers[0]);
           return;
       }
       while (numbers.length > 1) {
           int [] condense = new int[numbers.length -1];
           for (int i = 0; i < condense.length; i++) {
               condense [i] = numbers [i] + numbers [i + 1];
           }
           numbers = condense;
       }
        System.out.println(numbers[0]);
    }
}
