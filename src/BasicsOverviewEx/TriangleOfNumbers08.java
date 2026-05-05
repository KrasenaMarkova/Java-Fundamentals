package BasicsOverviewEx;

import java.util.Scanner;
//Write a program that receives a number – n and prints a triangle from 1 to n as in the examples.
//Constraints
//n will be in the interval [1...20].

public class TriangleOfNumbers08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n ; row++) {
            for (int number = 1; number <= row ; number++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
