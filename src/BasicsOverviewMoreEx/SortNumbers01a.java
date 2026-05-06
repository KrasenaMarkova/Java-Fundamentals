package BasicsOverviewMoreEx;

import java.util.Scanner;

public class SortNumbers01a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 & num1 > num3) {
            System.out.println(num1);
            int max = Math.max(num2, num3);
            int min = Math.min(num2, num3);
            System.out.println(max);
            System.out.println(min);
        } else if (num2 > num1 & num2 > num3) {
            System.out.println(num2);
            int max = Math.max(num3, num1);
            int min = Math.min(num1, num3);
            System.out.println(max);
            System.out.println(min);
        } else {
            System.out.println(num3);
            int max = Math.max(num2, num1);
            int min = Math.min(num2, num1);
            System.out.println(max);
            System.out.println(min);
        }
    }
}
