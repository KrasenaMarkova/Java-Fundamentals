package BasicsOverviewLab;

import java.util.Scanner;
//A theatre is having a ticket sale, but they need a program to calculate the price of a single ticket.
// If the given age does not fit one of the categories, you should print "Error!".
// You can see the prices in the table below:
// Input
//The input comes in two lines. On the first line, you will receive the type of day.
// On the second – is the age of the person.
//Output
//Print the ticket price according to the table, or "Error!" if the age is not in the table.

public class TheatrePromotion07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int priceForTicket = 0;

        if (age >= 0 && age <= 18) {
            switch (typeOfDay) {
                case "Weekday":
                    priceForTicket = 12;
                    break;
                case "Weekend":
                    priceForTicket = 15;
                    break;
                case "Holiday":
                    priceForTicket = 5;
                    break;
            }
        } else if (age > 18 && age <= 64) {
            switch (typeOfDay) {
                case "Weekday":
                    priceForTicket = 18;
                    break;
                case "Weekend":
                    priceForTicket = 20;
                    break;
                case "Holiday":
                    priceForTicket = 12;
                    break;
            }
        } else if (age > 64 && age <= 122) {
            switch (typeOfDay) {
                case "Weekday":
                    priceForTicket = 12;
                    break;
                case "Weekend":
                    priceForTicket = 15;
                    break;
                case "Holiday":
                    priceForTicket = 10;
                    break;
            }
        } else {
            System.out.println("Error!");
        }
        if (age >= 0 && age <= 122) {
            System.out.printf("%d$", priceForTicket);
        }
    }
}
