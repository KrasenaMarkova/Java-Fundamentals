package BasicsOverviewEx;

import java.util.Scanner;
//Write a program to display numbers from given start to given end and their sum.
// All the numbers will be integers. On the first line, you will receive the start number,
// on the second the end number.

public class PrintAndSum04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int countNumber = 0;

        for (int i = startNumber; i <=endNumber ; i++) {
            System.out.print(i + " ");
            countNumber += i;
        }
        System.out.printf("\nSum: %d", countNumber);
    }
}
