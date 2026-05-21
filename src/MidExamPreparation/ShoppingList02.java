package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//It’s the end of the week and it is time for you to go shopping, so you need to create a shopping list first.
//Input
//You will receive an initial list with groceries separated by "!".
//After that you will be receiving 4 types of commands, until you receive "Go Shopping!"
//•	Urgent {item} - add the item at the start of the list.  If the item already exists, skip this command.
//•	Unnecessary {item} - remove the item with the given name, only if it exists in the list.
// Otherwise skip this command.
//•	Correct {oldItem} {newItem} – if the item with the given old name exists, change its name with the new one.
// If it doesn't exist, skip this command.
//•	Rearrange {item} - if the grocery exists in the list, remove it from its current position and
// add it at the end of the list.
//Constraints
//•	There won`t be any duplicate items in the initial list

public class ShoppingList02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {

            String command = input.split(" ")[0];
            String item = input.split(" ")[1];

            switch (command) {
                case "Urgent":
                    if (!items.contains(item)) {
                        items.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    items.remove(item);
                    break;
                case "Correct":
                    if (items.contains(item)) {
                        String newName = input.split(" ")[2];
                        int itemIndex = items.indexOf(item);
                        items.set(itemIndex, newName);
                    }
                    break;
                case "Rearrange":
                    if (items.contains(item)) {
                      items.remove(item);
                      items.add(item);
                    }
                        break;
            }
            input = scanner.nextLine();
        }
        // System.out.println(items.toString().replace("[", "").replace("]", ""));

        // САМО ЗА List<String>
        System.out.println(String.join(", ", items));
    }
}
