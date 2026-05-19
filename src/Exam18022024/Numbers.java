package Exam18022024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         List<Integer> elements = Arrays.stream(scanner.nextLine().split(" "))
                 .map(Integer::parseInt)
                 .collect(Collectors.toList());

        String input = scanner.nextLine();
        List<Integer> newList = new ArrayList<>();

        while (!input.contains("Finish")) {
            String command = input.split(" ")[0];
            int value = Integer.parseInt(input.split(" ")[1]);

            switch (command) {
                case "Add":
                    elements.add(value);
                    break;
                case "Remove":
                    elements.remove(Integer.valueOf(value));
                    break;
                case "Replace":
                        int replacement = Integer.parseInt(input.split(" ")[2]);
                        int currentIndex = elements.indexOf(value);
                        elements.set(currentIndex,replacement);
                    break;
                case "Collapse":
                    for (int i = elements.size() - 1; i >= 0 ; i--) {
                        int currentElement = elements.get(i);
                        int currentIndex1 = elements.indexOf(currentElement);
                        if (currentElement < value) {
                            elements.remove(currentIndex1);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer i : elements) {
            System.out.print(i + " ");
        }
    }
}
