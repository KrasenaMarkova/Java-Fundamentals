package ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] text = (scanner.nextLine().split(" "));
        //"a b c d e".split(" ") -> ["a", "b", "c", "d", "e"]

        for (int position = text.length -1; position >= 0 ; position--) {
            System.out.print(text[position] + " ");
        }
    }
}
