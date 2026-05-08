package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();

        if (firstList.size() < secondList.size()) {
            int firstListPosition = 0;
            int secondListPosition = 1;
            for (int currentPosition = 0; currentPosition < firstList.size(); currentPosition++) {
                newList.add(firstListPosition, firstList.get(currentPosition));
                newList.add(secondListPosition, secondList.get(currentPosition));

                firstListPosition += 2;
                secondListPosition += 2;
            }
            int remainingPositions = firstList.size();
            for (int position = remainingPositions; position < secondList.size() ; position++) {
                newList.add(firstListPosition, secondList.get(position));
                firstListPosition++;
            }
        } else {
            int firstListPosition = 0;
            int secondListPosition = 1;
            for (int currentPosition = 0; currentPosition < secondList.size(); currentPosition++) {
                newList.add(firstListPosition, firstList.get(currentPosition));
                newList.add(secondListPosition, secondList.get(currentPosition));

                firstListPosition += 2;
                secondListPosition += 2;
            }
            int remainingPositions = secondList.size();
            for (int position = remainingPositions; position < firstList.size() ; position++) {
                newList.add(firstListPosition, firstList.get(position));
                firstListPosition++;
            }
        }
        for (int num : newList) {
            System.out.print(num + " ");
        }
    }
}
