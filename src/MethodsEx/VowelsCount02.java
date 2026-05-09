package MethodsEx;

import java.util.Locale;
import java.util.Scanner;
//Write a method that receives a single string and prints the count of the vowels.
// Use an appropriate name for the method.

public class VowelsCount02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Методът toLowerCase()преобразува низ в малки букви.
        String input = scanner.nextLine().toLowerCase();

        printCountOfTheVowels(input);
    }

    public static void printCountOfTheVowels(String input) {
        int countOfVowels = 0;

        // преобразуваме текста в масив от символи и обхождаме всеки един елемент от масива
        for (char letter : input.toCharArray()) {

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                countOfVowels++;
            }
        }
        System.out.println(countOfVowels);
    }
}
