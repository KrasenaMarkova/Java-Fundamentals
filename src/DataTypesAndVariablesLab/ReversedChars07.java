package DataTypesAndVariablesLab;

import java.util.Scanner;
//Write a program that takes 3 lines of characters and prints them in reversed order
// with a space between them.

public class ReversedChars07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdSymbol, secondSymbol, firstSymbol);

    }
}
