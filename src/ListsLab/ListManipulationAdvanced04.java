package ListsLab;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Now we will implement more complicated list commands. Again, read a list,
// and until you receive "end" read commands:
//•	Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise,
// print "No such number"
//•	Print even – print all the numbers that are even separated by a space
//•	Print odd – print all the numbers that are oddly separated by a space
//•	Get sum – print the sum of all the numbers
//•	Filter {condition} {number} – print all the numbers that fulfill that condition.
// The condition will be either '<', '>', ">=", "<="

public class ListManipulationAdvanced04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String [] commandsToArray = command.split(" ");
            String commandName = commandsToArray[0];

            switch (commandName) {
                case "Contains":
                    int number = Integer.parseInt(commandsToArray[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandsToArray[1].equals("even")) {
                        for (Integer num : numbers) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }
                    }else {
                        for (Integer num : numbers) {
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sumOfAllNumbers = 0;
                    for (int num : numbers) {
                        sumOfAllNumbers += num;
                    }
                    System.out.println(sumOfAllNumbers);
                    break;
                case "Filter":
                    int numberToFilter = Integer.parseInt(commandsToArray[2]);
                    switch (commandsToArray[1]) {
                        case ">":
                            for (int currentNumber : numbers) {
                                if (currentNumber > numberToFilter) {
                                    System.out.print(currentNumber + " ");
                                }
                        }
                            break;
                        case "<":
                            for (int currentNumber : numbers) {
                                if (currentNumber < numberToFilter) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            break;
                        case ">=":
                            for (int currentNumber : numbers) {
                                if (currentNumber >= numberToFilter) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            break;
                        case "<=":
                            for (int currentNumber : numbers) {
                                if (currentNumber <= numberToFilter) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            break;
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
