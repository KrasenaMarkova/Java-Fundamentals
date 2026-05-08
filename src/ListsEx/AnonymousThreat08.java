package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // split("\\s+")) = сплитваме всички празни места, 1 или повече ако са между отделните индекси
        List<String> texts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();
        

        while (!command.equals("3:1")) {

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > texts.size() - 1){
                    endIndex = texts.size() - 1;
                }
                if (startIndex >= 0 && startIndex <= texts.size() - 1 && endIndex >= 0 && endIndex <= texts.size() - 1) {
                    String result = "";
                    for (int index = startIndex; index <= endIndex ; index++) {
                        String current = texts.get(index);
                        result += current;
                    }
                    for (int index = startIndex; index <= endIndex ; index++) {
                        texts.remove(startIndex);
                    }
                    texts.add(startIndex,result);
                }

            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= texts.size() - 1) {

                    String textToDivide = texts.get(index);
                    texts.remove(index);

                    int symbolsCount = textToDivide.length() / parts;
                    int startIndex = 0;

                    for (int part = 1; part < parts; part++) {
                        String textPerPart = textToDivide.substring(startIndex, startIndex + symbolsCount);
                        texts.add(index, textPerPart);
                        index++;
                        startIndex += symbolsCount;
                    }
                    String textLastParts = textToDivide.substring(startIndex, textToDivide.length());
                    texts.add(index, textLastParts);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", texts));
    }
}
