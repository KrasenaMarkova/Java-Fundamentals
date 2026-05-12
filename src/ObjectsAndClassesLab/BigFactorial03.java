package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;
//You will receive N - the number in the range [0 - 1000]. Calculate the Factorial of N and print the result.

public class BigFactorial03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= number ; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.print(factorial);
    }
}
