package ArraysLab;

import java.util.Scanner;
//Enter a day number and print the day name (in English) or "Invalid day!". Use an array of strings.

public class DayOfWeek01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfDay = Integer.parseInt(scanner.nextLine());

        String [] dayOfWeeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (numberOfDay > 0 && numberOfDay < 8) {
            //отпечатваме деня на текущия номер
            System.out.println(dayOfWeeks[numberOfDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
