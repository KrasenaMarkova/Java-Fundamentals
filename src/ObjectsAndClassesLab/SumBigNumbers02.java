package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;
//You will receive two numbers (0 to 1050), and print their sum.

public class SumBigNumbers02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());

        System.out.println(firstNum.add(secondNum));
    }
}
