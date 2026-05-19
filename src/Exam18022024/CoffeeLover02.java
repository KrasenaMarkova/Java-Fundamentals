package Exam18022024;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listOfTheCoffees  = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfCommands; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];

            if (name.contains("Include")) {
                String coffeeName = command.split(" ")[1];
                listOfTheCoffees.add(coffeeName);
            } else if (name.contains("Remove")) {
                String firstOrLast = command.split(" ")[1];
                int removeIndex = Integer.parseInt(command.split(" ")[2]);

                switch (firstOrLast) {
                    case "first":
                        if (removeIndex >= 0 && removeIndex <= listOfTheCoffees.size() - 1) {

                            for (int j = removeIndex - 1; j >= 0 ; j--) {
                                listOfTheCoffees.remove(j);
                            }
                        }
                        break;
                    case "last":
                        if (removeIndex >= 0 && removeIndex <= listOfTheCoffees.size() - 1) {

                            for (int j = removeIndex; j > 0; j--) {
                             listOfTheCoffees.remove(listOfTheCoffees.size() - 1);
                            }
                        }
                        break;
                }
            } else if (name.contains("Prefer")) {
                int firstCoffeeIndexPrefer = Integer.parseInt(command.split(" ")[1]);
                int secondCoffeeIndexPrefer = Integer.parseInt(command.split(" ")[2]);

                if (firstCoffeeIndexPrefer >= 0 && firstCoffeeIndexPrefer <= listOfTheCoffees.size() - 1
                && secondCoffeeIndexPrefer >= 0 && secondCoffeeIndexPrefer <= listOfTheCoffees.size() - 1) {
                    String firstCoffeePrefer = listOfTheCoffees.get(firstCoffeeIndexPrefer);
                    String secondCoffeePrefer = listOfTheCoffees.get(secondCoffeeIndexPrefer);
                    listOfTheCoffees.set(firstCoffeeIndexPrefer, secondCoffeePrefer);
                    listOfTheCoffees.set(secondCoffeeIndexPrefer,firstCoffeePrefer);
                }
            } else if (name.contains("Reverse")) {
                Collections.reverse(listOfTheCoffees);
            }
        }
        System.out.println("Coffees:");
        for (String listOfTheCoffee : listOfTheCoffees) {
            System.out.print(listOfTheCoffee + " ");
        }
    }
}
