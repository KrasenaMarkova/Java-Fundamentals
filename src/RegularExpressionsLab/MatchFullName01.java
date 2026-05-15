package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Write a Java Program to match full names from a list of names and print them on the console.
//Writing the Regular Expression
//First, write a regular expression to match a valid full name, according to these conditions:
//•	A valid full name has the following characteristics:
//o	It consists of two words.
//o	Each word starts with a capital letter.
//o	After the first letter, it only contains lowercase letters afterward.
//o	Each of the two words should be at least two letters long.
//o	The two words are separated by a single space.

public class MatchFullName01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)";
        //Pattern -> шаблон
        Pattern pattern = Pattern.compile(regex);
        // Matcher -> ще открие всички съвпадения в text по regex шаблона
        Matcher matcher = pattern.matcher(text);

        //matcher.find() -> true/false Ако намери следващо съвпадение
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
