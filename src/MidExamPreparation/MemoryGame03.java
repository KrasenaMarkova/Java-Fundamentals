package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Write a program that recreates the Memory game.
//On the first line, you will receive a sequence of elements. Each element in the sequence will have a twin.
// Until the player receives "end" from the console, you will receive strings with two integers separated by a space,
// representing the indexes of elements in the sequence.
//If the player tries to cheat and enters two equal indexes or indexes which are out of bounds of the sequence,
// you should add two matching elements at the middle of the sequence in the following format:
//"-{number of moves until now}a"
//Then print this message on the console:
//"Invalid input! Adding additional elements to the board"

public class MemoryGame03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int moves = 0;

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);
            moves++;

            boolean isValid = isValid (firstIndex, secondIndex, elements.size() - 1);

            if (!isValid) {
                //String newElement = String.format("-%da", moves);
                String newElement = String.format("-" + moves + "a");

                elements.add(elements.size() / 2, newElement);
                elements.add(elements.size() / 2, newElement);

                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);

                if (firstElement.equals(secondElement)) {
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                    System.out.printf("Congrats! You have found matching elements - %s!\n", firstElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!\n", moves);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", elements));

    }

    public static boolean isValid(int firstIndex, int secondIndex, int lastIndex) {
        boolean areNotTheSameIndex = firstIndex != secondIndex;
        boolean firstIndexIsValid = firstIndex >= 0 && firstIndex <= lastIndex;
        boolean secondIndexIsValid = secondIndex >= 0 && secondIndex <= lastIndex;

        return areNotTheSameIndex && firstIndexIsValid && secondIndexIsValid;
    }
}
