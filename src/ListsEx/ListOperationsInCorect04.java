package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperationsInCorect04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(number);
            } else if (command.contains("Insert")) {

                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                if (number >= 0 && number <= numbers.size() - 1) {
                    numbers.remove(number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int shiftLeftCount = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < shiftLeftCount; i++) {
                    int firstElement = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstElement);
                }

            } else {
                int shiftRightCount = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < shiftRightCount; i++) {
                    int lastElement = numbers.getLast();
                    numbers.remove(numbers.getLast());
                    numbers.add(0, lastElement);
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
