package Exam18022024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            String message1 = input.split(" ")[1];

            switch (command) {
                case "Chat":
                    elements.add(message1);
                    break;
                case "Delete":
                  elements.remove(message1);
                    break;
                case "Edit":
                    String message2 = input.split(" ")[2];
                    if (elements.contains(message1)) {
                        int message1Index = elements.indexOf(message1);
                        elements.set(message1Index,message2);
                    }
                    break;
                case "Pin":
                    if (elements.contains(message1)) {
                     elements.remove(message1);
                     elements.add(message1);
                    }
                    break;
                case "Spam":
                    List<String> newListAdd = List.of(input.split(" "));
                    for (int i = 1; i <= newListAdd.size() - 1; i++) {
                        String currentMessegesToAdd = newListAdd.get(i);
                        elements.add(currentMessegesToAdd);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
