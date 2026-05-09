package MethodsEx;

import java.util.Scanner;
//A palindrome is a number that reads the same backward as forward, such as 323 or 1001.
// Write a program that reads a positive integer number until you receive "END".
// For each numbered print, whether the number is palindrome or not.

public class PalindromeIntegers09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(isInputPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isInputPalindrome(String input) {
        String receiveString = "";
        //обхождаме отзад напред input и записваме стойностите в receiveString
        for (int index = input.length() - 1; index >= 0; index--) {
            receiveString += input.charAt(index);
        }
        return input.equals(receiveString);
    }
}