package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//On the first line, you will be given a list of wagons (integers).
// Each integer represents the number of passengers that are currently in each wagon. On the next line,
// you will get the max capacity of each wagon (single integer). Until you receive "end"
// you will be given two types of input:
//•	Add {passengers} - add a wagon to the end with the given number of passengers
//•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
//In the end, print the final state of the train (all the wagons separated by a space)

public class Train01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("Add")) {
                // 1. "Add 40".split(" ") -> ["Add", "40"]
                int count = Integer.parseInt(command.split(" ")[1]);
                // добавяме определен елемент на последна позиция
                wagons.add(count);
            } else {
                // 2. "40"
                int passengerToBeAdded = Integer.parseInt(command);
                for (int position = 0; position <= wagons.size()-1 ; position++) {
                    int wagon = wagons.get(position);
                    if (wagon + passengerToBeAdded <= maxCapacityOfEachWagon) {
                        //добавяме определен елемент на определена от нас позиция
                        wagons.set(position, wagon + passengerToBeAdded);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
            }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
