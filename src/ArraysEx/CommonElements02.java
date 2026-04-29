package ArraysEx;

import java.util.Scanner;
//Write a program that prints common elements in two arrays.
// You have to compare the elements of the second array to the elements of the first.

public class CommonElements02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // четем от конзолата 2 цикъла
        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        // обхождаме елементите на двата цикъла и ги сравняваме
        for (String el2 : secondArray) {
            for (String el1 : firstArray) {
                if (el1.equals(el2)) {
                    System.out.print(el1 + " ");
                }
            }
        }
    }
}
