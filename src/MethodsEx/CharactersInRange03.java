package MethodsEx;

import java.util.Scanner;
//Write a method that receives two characters and prints all the characters in between
// them on a single line according to ASCII.

public class CharactersInRange03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printSymbolsInRange(firstChar, secondChar);
    }

    public static void printSymbolsInRange(char firstChar, char secondChar) {
        // по-малкият до по-големият
        if (firstChar < secondChar) {
            for (int asciValue = firstChar + 1; asciValue < secondChar; asciValue++) {
                System.out.print((char) asciValue + " ");
            }
        } else {
            for (int asciValue = secondChar + 1; asciValue < firstChar; asciValue++) {
                System.out.print((char) asciValue + " ");
            }
        }
    }
}
