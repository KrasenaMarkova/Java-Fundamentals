package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "(\\!)(?<command>[A-Z][a-z]{2,})\\1(:)(\\[)(?<translation>[A-Za-z]{8,})(\\])";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String command = matcher.group("command");
                String translation = matcher.group("translation");

                System.out.printf("%s: ", command);
                for (int index = 0; index <= translation.length() - 1; index++) {
                    char character = translation.charAt(index);
                    int ascii = (int) character;
                    System.out.print(ascii + " ");
                }
                System.out.println();
            } else {
                System.out.println("The message is invalid");
            }
        }

    }
}
