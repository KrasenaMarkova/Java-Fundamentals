package Exam18022024;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> shelfWithBooks  = Arrays.stream(scanner.nextLine()
                        .split("&"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.contains("Done")) {
            //String command = Arrays.toString((input.split("\\|")));

            String output = input.toString()
                    .replace("|", "")
                    .replaceAll("\\s+", " ")
                    .trim();
            String command = output.split(" ")[0];
            String bookName = output.split(" ")[2];

            if (command.contains("Add")) {
                if (!shelfWithBooks.contains(bookName)) {
                    shelfWithBooks.add(0, bookName);
                }
            } else if (command.contains("Take")) {
                if (shelfWithBooks.contains(bookName)) {
                    int indexForTake = shelfWithBooks.indexOf(bookName);
                    shelfWithBooks.remove(indexForTake);
                }
            } else if (command.contains("Swap")) {
                String bookName2 = input.split(" ")[3];
                if (shelfWithBooks.contains(bookName) && shelfWithBooks.contains(bookName2)) {
                    int firstBookIndex = shelfWithBooks.indexOf(bookName);
                    int secondBookIndex = shelfWithBooks.indexOf(bookName2);
                    shelfWithBooks.set(firstBookIndex,bookName2);
                    shelfWithBooks.set(secondBookIndex, bookName);
                }
            } else if (command.contains("Insert")) {
                if (!shelfWithBooks.contains(bookName)) {
                    shelfWithBooks.add(shelfWithBooks.size() - 1, bookName);
                }
            } else if (command.contains("Check")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                if (index >= 0 && index <= shelfWithBooks.size() - 1) {
                    String currentBookOfIndex = shelfWithBooks.get(index);
                    System.out.println(currentBookOfIndex);
                }
            }
            input = scanner.nextLine();
        }
        for (String shelfWithBook : shelfWithBooks) {
            System.out.print(shelfWithBook + ", ");
        }
    }
}
