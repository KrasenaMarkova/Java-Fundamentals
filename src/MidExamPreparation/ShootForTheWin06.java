package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays .stream(scanner.nextLine().split("\\s+")) .map(Integer::parseInt) .collect(Collectors.toList());

        String command = scanner.nextLine();
        int countShotTargets = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);

            if (index >= 0 && index <= numbers.size() - 1) {
                int currentValue = numbers.get(index);

                for (int position = 0; position <= numbers.size() - 1; position++) {
                    int valueShotTarget = numbers.get(position);

                    if (valueShotTarget != -1 && valueShotTarget != index) {

                        if (currentValue < valueShotTarget) {
                            valueShotTarget -= currentValue;
                        } else {
                            valueShotTarget += currentValue;
                        }
                        numbers.set(position, valueShotTarget);
                    }
                }
                numbers.set(index, -1);
                countShotTargets++;
            }
            command = scanner.nextLine();
        }
        System.out.print("Shot targets: " + countShotTargets + " -> ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
