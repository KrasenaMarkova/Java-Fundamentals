package DataTypesAndVariablesEx;

import java.util.Scanner;
//Write a program that sums the ASCII codes of n characters. Print the sum on the console.
//Input
//•	On the first line, you will receive n – the number of lines that follow.
//•	On the next n lines – you will receive letters from the Latin alphabet.

public class Sum0fChars04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int num = 1; num <= numberOfLines ; num++) {
           char symbol = scanner.nextLine().charAt(0);
           // (int) symbol да получим числовата стойност на съответния символ (ASCII codes)
           sum += (int) symbol;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
