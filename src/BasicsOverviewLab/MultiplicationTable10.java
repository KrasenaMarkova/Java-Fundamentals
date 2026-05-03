package BasicsOverviewLab;

import java.util.Scanner;
//You will receive an integer as input from the console. Print the 10 times table for this integer.
// See the examples below for more information.
//Output
//Print every row of the table in the following format:
//{theInteger} X {times} = {product}
//Constraints
//•	The integer will be in the interval [1…100]

public class MultiplicationTable10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }
    }
}
