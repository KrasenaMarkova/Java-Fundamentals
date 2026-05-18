package TextProcessingLab;

import java.util.Scanner;
//Write a program that takes a text and a string of banned words. All words included in the ban list
// should be replaced with asterisks "*", equal to the word's length. The entries in the ban list will be
// separated by a comma and space ", ".
//The ban list should be entered on the first input line and the text on the second input line.

public class TextFilter04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] forbiddenWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            //"mask" -> "****"
            String replaceWord = "*".repeat(forbiddenWord.length());
            text = text.replace(forbiddenWord, replaceWord);
        }
        System.out.println(text);
    }
}
