package BasicsOverviewMoreEx;

import java.util.Scanner;
//Read three real numbers and sort them in descending order. Print each number on a new line.

public class SortNumbers01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
            if (num2 > num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if (num1 < num2 && num2 > num3) {
            System.out.println(num2);
            if (num1 > num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
        } else {
            System.out.println(num3);
            if (num2 > num1) {
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }
    }
}
