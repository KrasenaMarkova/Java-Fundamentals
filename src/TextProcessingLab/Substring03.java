package TextProcessingLab;

import java.util.Scanner;
//On the first line, you will receive a string. On the second line, you will receive a second string.
// Write a program that removes all of the occurrences of the first String in the second until there
// is no match. At the end, print the remaining String.

public class Substring03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        int index = secondText.indexOf(firstText);
        //firstText = "ice"
        //secondText = "kgb"
        //ако firstText се съдържа в secondText -> на коя позиция се намира
        //ако firstText НЕ СЕ СЪДЪРЖА в secondText -> -1

        while (index != -1) {
            //firstText го има secondText
            secondText = secondText.replace(firstText, "");

            //след премахването -> търсим дали имаме тази дума
            index = secondText.indexOf(firstText);;
        }
        System.out.println(secondText);
    }
}
