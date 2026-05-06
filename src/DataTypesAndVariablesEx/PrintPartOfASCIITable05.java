package DataTypesAndVariablesEx;

import java.util.Scanner;
//Write a program that prints part of the ASCII table of characters at the console.
// On the first line of input, you will receive the char index you should start with,
// and on the second line - the index of the last character you should print.


public class PrintPartOfASCIITable05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstIndex = Integer.parseInt(scanner.nextLine());
        int lastIndex = Integer.parseInt(scanner.nextLine());

        for (int i = firstIndex; i <= lastIndex ; i++) {
            // в charIndex запазваме символа, който отговаря на числената стойност от променливата i
            char charIndex = (char) i;
            System.out.print(charIndex + " ");
        }
    }
}
