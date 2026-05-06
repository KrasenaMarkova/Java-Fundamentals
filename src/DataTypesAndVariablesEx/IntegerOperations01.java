package DataTypesAndVariablesEx;

import java.util.Scanner;
//Read four integer numbers. Add the first to the second, divide (integer) the sum by the third number,
// and multiply the result by the fourth number. Print the result.

public class IntegerOperations01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        // Формула: ((n1 + n2) / n3) * n4
        System.out.println(((number1 + number2) / number3) * number4);
    }
}
