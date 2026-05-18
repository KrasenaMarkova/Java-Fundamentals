package TextProcessingLab;

import java.util.Scanner;
//Write a Program That Reads an Array of Strings. Each String is Repeated N Times,
// Where N is the length of the String. Print the Concatenated String.

public class RepeatStrings02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] texts = scanner.nextLine().split(" ");

        for (String text : texts) {
            int length = text.length();//дължина на текста = брой символи в текст
            /*for (int count = 1; count <= length; count++) {
                System.out.print(text);
            }*/
            System.out.print(text.repeat(length));
        }
    }
}
