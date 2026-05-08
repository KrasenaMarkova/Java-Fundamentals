package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombIncorrect05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

       // String [] data = scanner.nextLine().split(" ");
        //String bombNumber = data[0];
        List<Integer> data = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int bombNumber = data.get(0);
        int power = data.get(1);

        for (int position = 0; position <= elements.size() - 1 ; position++) {
            int currentIndex = elements.get(position);
            if (currentIndex == bombNumber) {
                int elementIndex = elements.indexOf(bombNumber);
                int start = elementIndex - power;
                int end = elementIndex + power;

                if (start < 0) {
                    start = 0;
                }
                if (end > elements.size() - 1) {
                    end = elements.size() - 1;
                }

                for (int index = end; index >= start ; index--) {
                    elements.remove(index);
                }
            }

        }
        int sumOfElements = 0;
        for (Integer element : elements) {
            sumOfElements += element;
        }
        System.out.println(sumOfElements);

    }
}
