package MethodsEx;

import java.util.Scanner;
//Write a method that receives a single integer n and prints an nxn matrix with that number.

public class NxNMatrix07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());
        
        printTable(number);
    }

    public static void printTable(int number) {
        for (int row = 1; row <= number ; row++) {
            for (int column = 1; column <= number ; column++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
