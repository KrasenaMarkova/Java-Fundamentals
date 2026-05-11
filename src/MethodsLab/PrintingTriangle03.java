package MethodsLab;

import java.util.Scanner;
//Create a method for printing triangles as shown below:

public class PrintingTriangle03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        printingTriangles (input);


    }
    public static void printingTriangles (int number) {
        for (int i = 1; i <= number ; i++) {
            printLine(1, i);
        }
        for (int i = number - 1; i >= 1 ; i--) {
            printLine(1, i);
        }
    }

    private static void printLine(int start, int end) {
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
