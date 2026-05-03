package BasicsOverviewLab;

import java.util.Scanner;
//Write a program that prints the language that a given country speaks.
// You can receive only the following combinations: English is spoken in England and USA;
// Spanish is spoken in Spain, Argentina, and Mexico; for the others, we should print "unknown".
//Input
//You will receive a single country name on a single line.
//Output
//Print the language, which the country speaks, or if it is unknown for your program, print "unknown".

public class ForeignLanguages06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish ");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
