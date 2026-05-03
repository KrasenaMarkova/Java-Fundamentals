package BasicsOverviewLab;

import java.util.Scanner;
//Rewrite your program so it can receive the multiplier from the console.
// Print the table from the given multiplier to 10. If the given multiplier is more than 10 -
//print only one row with the integer, the given multiplier, and the product.
// See the examples below for more information.
//Output
//Print every row of the table in the following format:
//{theInteger} X {times} = {product}
//Constraints
//•	The integer will be in the interval [1…100]

public class MultiplicationTable10a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int multiplier = Integer.parseInt(scanner.nextLine());
        int integer = Integer.parseInt(scanner.nextLine());

        if (integer > 10) {
            System.out.printf("%d X %d = %d\n", multiplier, integer, multiplier * integer);
        } else {
            for (int i = integer; i <= 10 ; i++) {
                System.out.printf("%d X %d = %d\n", multiplier, i, multiplier * i);
            }
        }
    }
}
