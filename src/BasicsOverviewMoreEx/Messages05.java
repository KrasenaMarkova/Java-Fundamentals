package BasicsOverviewMoreEx;

import java.util.Scanner;
//Write a program that emulates typing an SMS, following this guide:

public class Messages05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countLetters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countLetters ; i++) {
            int inputNumbers = Integer.parseInt(scanner.nextLine());
            String numbersOfText = Integer.toString(inputNumbers);

            //Find the number of digits the number has "e.g. 222 -> 3 digits"
            int digits = numbersOfText.length();

            // Find the main digit of the number "e.g.  222 -> 2"
            int mainDigit = inputNumbers % 10;

            //Find the offset of the number. To do that, you can use the formula: (main digit - 2) * 3
            int offset = (mainDigit - 2) * 3;

            //If the main digit is 8 or 9, we need to add 1 to the offset since the digits 7 and 9 have 4 letters each
            if (mainDigit == 8 || mainDigit == 9) {
                digits++;
            }
            //Finally, find the letter index (a -> 0, c -> 2, etc.). To do that, we can use the following formula:
            // (offset + digit length - 1).
            int letterIndex = (offset + digits - 1);

            //After we've found the letter index, we can just add that to the ASCII code of the lowercase letter "a" (97)
            if (inputNumbers == 0 ){
                System.out.print(" ");
            } else {
                System.out.print((char)(letterIndex + 97));
            }
        }
    }
}
