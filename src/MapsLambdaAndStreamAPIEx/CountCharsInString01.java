package MapsLambdaAndStreamAPIEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//Write a program that counts all characters in a string except space (' ').
//Print all occurrences in the following format:
//"{char} -> {occurrences}"

public class CountCharsInString01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> characterCount = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }

            if (characterCount.containsKey(symbol)) {
                int count = characterCount.get(symbol);
                characterCount.put(symbol, count + 1);
            } else {
                characterCount.put(symbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
