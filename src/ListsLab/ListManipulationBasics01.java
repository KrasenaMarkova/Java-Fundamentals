package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Write a program that reads a list of integers. Then until you receive "end",
// you will be given different commands:
//•	Add {number} – add a number to the end of the list
//•	Remove {number} – remove a number from the list
//•	RemoveAt {index} – remove a number at a given index
//•	Insert {number} {index} – insert a number at a given index
//Note: All the indices will be valid!
//When you receive the "end" command, print the final state of the list (separated by spaces).

public class ListManipulationBasics01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            String [] commandsParts = command.split(" ");
            String commandName = commandsParts[0];
            int commandNumber= Integer.parseInt(commandsParts[1]);

            switch (commandName) {
                case "Add":
                    numbers.add(commandNumber);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(commandNumber));
                    break;
                case "RemoveAt":
                    numbers.remove(commandNumber);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandsParts[2]);
                    numbers.add(index, commandNumber);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
