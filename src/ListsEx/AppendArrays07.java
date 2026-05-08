package ListsEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Write a program to append several arrays of numbers.
//	Arrays are separated by "|".
//	Values are separated by spaces (" ", one or several).
//	Order the arrays from the last to the first and their values from left to right.

public class AppendArrays07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        // нареждаме елементите в обратен ред
        Collections.reverse(elements);

        // обръщаме листа в String и премахваме всички излишни знаци и интервали
        String output = elements.toString().replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replaceAll("\\s+", " ")
                .trim();;
                // replaceAll \\s+ - премахваме един или повече интервали
                // trim - премахва всички подещи и изходящи празни места

        System.out.println(output);
    }
}
