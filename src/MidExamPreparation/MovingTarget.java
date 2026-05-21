package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//You are at the shooting gallery again, and you need a program that helps you keep track of moving targets.
// On the first line, you will receive a sequence of targets with their integer values, split by a single space.
// Then, you will start receiving commands for manipulating the targets until the "End" command.
// The commands are the following:
//•	"Shoot {index} {power}"
//o	Shoot the target at the index if it exists by reducing its value by the given power (integer value).
//o	Remove the target if it is shot. A target is considered shot when its value reaches 0.
//•	"Add {index} {value}"
//o	Insert a target with the received value at the received index if it exists.
//o	If not, print: "Invalid placement!"
//•	"Strike {index} {radius}"
//o	Remove the target at the given index and the ones before and after it depending on the radius.
//o	If any of the indices in the range is invalid, print: "Strike missed!" and skip this command.

public class MovingTarget {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceOfTargets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String currentCommand = scanner.nextLine();
        while (!currentCommand.equals("End")) {

            String [] commandsParts = currentCommand.split(" ");
            String commandName = commandsParts[0];
            int index = Integer.parseInt(commandsParts[1]);
            int power = Integer.parseInt(commandsParts[2]);

            if (index >= 0 && index <= sequenceOfTargets.size() - 1) {
                int valueOfCurrentIndex = sequenceOfTargets.get(index);

                switch (commandName) {
                    case "Shoot":
                        if(valueOfCurrentIndex >= power) {
                            sequenceOfTargets.set(index, valueOfCurrentIndex - power);
                            if (sequenceOfTargets.get(index) <= 0) {
                                sequenceOfTargets.remove(index);
                            }
                        } else {
                            sequenceOfTargets.remove(index);
                        }
                        break;
                    case "Add":
                        sequenceOfTargets.add(index, power);
                        break;
                    case "Strike":
                        int startIndex = index - power;
                        int endIndex = index + power;
                        if (startIndex < 0 || endIndex > sequenceOfTargets.size() - 1){
                            System.out.println("Strike missed!");
                        } else {
                            for (int currentIndex = endIndex; currentIndex >= startIndex; currentIndex--) {
                                sequenceOfTargets.remove(currentIndex);
                            }
                        }
                        break;
                }
            } else {
                if (commandName.equals("Add")) {
                    System.out.println("Invalid placement!");
                }
            }
            currentCommand = scanner.nextLine();
        }
        System.out.println(sequenceOfTargets.stream()
                .map(String :: valueOf)
                .collect(Collectors.joining("|")));
    }
}
