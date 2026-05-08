package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;
//Write a program to enter n numbers and calculate and print their exact sum (without rounding).

public class ExactSumOfRealNumbers03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        BigDecimal sumOfNumber = new BigDecimal("0");

        for (int i = 1; i <= count ; i++) { //всички числа от първото до последното
            ////стойността на въведеното число
            BigDecimal value = new BigDecimal(scanner.nextLine());

            sumOfNumber = sumOfNumber.add(value);

        }
        System.out.println(sumOfNumber);
    }
}
