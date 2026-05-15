package RegularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // да намерим валидните мейли

        String regexUser = "[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+";
        String regexHost = "[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]+)+";
        String regexEmail = regexUser + "@" + regexHost; //текст на шаблона
        Pattern pattern = Pattern.compile(regexEmail);

        Matcher matcher = pattern.matcher(input);
        //text = "Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information."
        //matcher -> съвкупност от всички текстове, които ми отговарят на шаблона -> всички валидни имейли
        //matcher -> ["s.miller@mit.edu", "j.hopking@york.ac.uk"]

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
