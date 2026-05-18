package TextProcessingLab;

import java.util.Scanner;
//Write a program that receives a single string and on the first line prints all the digits,
// on the second – all the letters, and on the third – all the other characters.
// There will always be at least one digit, one letter, and another character.

public class DigitsLettersAndOther05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        //цифри
        StringBuilder digits = new StringBuilder();
        //букви
        StringBuilder letters = new StringBuilder();
        //други символи
        StringBuilder characters = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                //символът ми е цифра
                digits.append(symbol);
            } else if (Character.isLetter(symbol)) {
                // символът ми е буква
                letters.append(symbol);
            }else {
                // символът ми е друг (различен от буква или цифра)
                characters.append(symbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(characters.toString());
    }
}
