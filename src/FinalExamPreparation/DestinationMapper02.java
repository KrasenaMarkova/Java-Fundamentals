package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        List<String> validDestination = new ArrayList<>();


        while (matcher.find()) {
            validDestination.add(matcher.group("destination"));
        }
        //String.join - функционалност, която работи само с листове от пит String
        System.out.println("Destinations: " + String.join(", ", validDestination));

        int travelPoints = 0;
        for (String destination : validDestination) {
            travelPoints += destination.length();
        }
        System.out.println("Travel Points: " + travelPoints);
    }
}
