package ListsLab;

import java.util.*;
import java.util.stream.Collectors;
//Read a list of integers, remove all negative numbers from it and print the remaining
//elements in reversed order. In case of no elements left in the list, print "empty".

public class RemoveNegativesAndReverse06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> positiveNumber = new ArrayList<>();

        for (int number : numbers) {
            if (number > 0) {
                positiveNumber.add(number);
            }
        }
        // в обратен ред на числата
        Collections.reverse(positiveNumber);

        if (positiveNumber.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i : positiveNumber) {
                System.out.print(i + " ");
            }
        }
    }
}

