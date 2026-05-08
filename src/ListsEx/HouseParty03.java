package ListsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a program that keeps track of guests going to a house party.
//On the first input line, you are going to receive how many commands you are going to have.
// On the next lines you are going to receive some of the following inputs:
//•	"{name} is going!"
//•	"{name} is not going!"
//If you receive the first type of input, you have to add the person if he/she is not on the list.
// If he/she is in the list, print on the console: "{name} is already in the list!".
// If you receive the second type of input, you must remove the person if he/she is on the list.
// If not, print: "{name} is not in the list!". In the end, print all guests.

public class HouseParty03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> guest = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];

            if (command.contains("not")) {
                if (guest.contains(name)) {
                    guest.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            } else {
                if (guest.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    guest.add(name);
                }
            }
        }
        for (String names : guest) {
            System.out.println(names);
        }
    }
}
