package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;
//Write a program to read a sequence of integers and find and print the top 5 numbers greater than
// the average value in the sequence, sorted in descending order.
//Input
//•	Read from the console a single line holding space-separated integers.
//Output
//•	Print the above-described numbers on a single line, space-separated.
//•	If less than 5 numbers hold the property mentioned above, print less than 5 numbers.
//•	Print "No" if no numbers hold the above property.

public class Numbers05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")) .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumOfNumbers = 0;
        int countOfNumbers = numbers.size();

        for (Integer number : numbers) {
            sumOfNumbers += number;
        }

        double average = (sumOfNumbers * 1.0) / countOfNumbers;
        Collections.sort(numbers);
        Collections.reverse(numbers);

        List<String> newLIst = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > average) {
                newLIst.add(String.valueOf(number));
            }
        }
        if (newLIst.isEmpty()) {
            System.out.println("No");
        } else if (newLIst.size() <= 5){
            for (int i = 0; i < newLIst.size(); i++) {
                int currentNum = Integer.parseInt(newLIst.get(i));
                System.out.print(currentNum + " ");
            }
        } else {
            for (int i = 0; i < 5; i++) {
                int currentNum = Integer.parseInt(newLIst.get(i));
                System.out.print(currentNum + " ");
            }
        }
    }
}
