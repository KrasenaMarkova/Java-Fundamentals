package TextProcessingLab;

import java.util.Scanner;
//You will be given a series of strings until you receive an "end" command.
//Write a program that reverses strings and prints each pair on a separate
//line in the format "{word} = {reversed word}".

public class ReverseStrings01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String reversedWord = ""; //обърнатата дума

            // правим стримбилдър и добаваме думата
            //StringBuilder sb = new StringBuilder(input);
            //обръщаме стриймбилдъра на обратно
            //sb.reverse();

            for (int position = input.length() - 1; position >= 0 ; position--) {

                char currentSymbol = input.charAt(position);
                reversedWord = reversedWord + currentSymbol;
                //reverseWord += currentSymbol;
            }
            //входяща дума -> input
            //обърната дума -> reverseWord
            System.out.printf("%s = %s\n", input, reversedWord);

            input = scanner.nextLine();
        }
    }
}
