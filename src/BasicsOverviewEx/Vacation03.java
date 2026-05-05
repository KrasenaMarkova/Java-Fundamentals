package BasicsOverviewEx;

import java.util.Scanner;
//You are given a group of people, type of the group, on which day of the week they will stay.
// Based on that information, calculate how much they must pay and print that price on the console.
// Use the table below. In each cell is the price for a single person. The output should look like that:
// "Total price: {price}". The price should be formatted to the second decimal point.
//There are also discounts based on some conditions:
//•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
//•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
//•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%
//You should reduce the prices in that EXACT order.
public class Vacation03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeopleInAGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double priceOfOneTicket = 0.0;


        if (typeOfGroup.equals("Students")) {
            switch (dayOfWeek) {
                case "Friday":
                    priceOfOneTicket= 8.45;
                    break;
                case "Saturday":
                    priceOfOneTicket = 9.80;
                    break;
                case "Sunday":
                    priceOfOneTicket= 10.46;
                    break;
            }
        } else if (typeOfGroup.equals("Business")) {
            switch (dayOfWeek) {
                case "Friday":
                    priceOfOneTicket = 10.90;
                    break;
                case "Saturday":
                    priceOfOneTicket = 15.60;
                    break;
                case "Sunday":
                    priceOfOneTicket = 16.0;
                    break;
            }
        } else {
            switch (dayOfWeek) {
                case "Friday":
                    priceOfOneTicket = 15.0;
                    break;
                case "Saturday":
                    priceOfOneTicket = 20.0;
                    break;
                case "Sunday":
                    priceOfOneTicket = 22.50;
                    break;
            }
        }
        double countOfPriceOfTicket = priceOfOneTicket * numberOfPeopleInAGroup;

        if (numberOfPeopleInAGroup >= 30 && typeOfGroup.equals("Students")) {
            countOfPriceOfTicket = countOfPriceOfTicket - (countOfPriceOfTicket * 0.15);
        } else if (numberOfPeopleInAGroup >= 100 && typeOfGroup.equals("Business")) {
            countOfPriceOfTicket = priceOfOneTicket * (numberOfPeopleInAGroup - 10);
        } else if (numberOfPeopleInAGroup >= 10 && numberOfPeopleInAGroup <= 20 &&typeOfGroup.equals("Regular")) {
            countOfPriceOfTicket = countOfPriceOfTicket - (countOfPriceOfTicket * 0.05);
        }

        System.out.printf("Total price: %.2f", countOfPriceOfTicket);

    }
}
