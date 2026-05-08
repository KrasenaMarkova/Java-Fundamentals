package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Write a program that reads a list of integers from the console and receives commands which manipulate the list.
// Your program may receive the following commands:
//•	Delete {element} - delete all elements in the array which are equal to the given element
//•	Insert {element} {position} - insert element at the given position
//You should stop the program when you receive the command "end". Print all numbers in the array,
// separated with a single whitespace.

public class ChangeList02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                // 1. "Delete {element}".split(" ") -> ["Delete", "45"]
                int numberToDelete = Integer.parseInt(command.split(" ")[1]);
                // с метода List of преобразуваме numberToDelete в колекция и с removeALL премахваме всички
                // стойности зададени в променливата numberToDelete
            // numbers.removeAll(List.of(numberToDelete));

               for (int position = 0; position <= numbers.size()-1; position++) {
                    int currentNum = numbers.get(position);
                    if (currentNum == numberToDelete) {
                        numbers.remove(position);
                    }
                }
            } else {
                // 2. "Insert {element} {position}".split(" ") -> ["Insert", "29", "2"]
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }

            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
