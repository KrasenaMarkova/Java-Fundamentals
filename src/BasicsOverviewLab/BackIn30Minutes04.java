package BasicsOverviewLab;

import java.util.Scanner;
//Every time John tries to pay his bills, he sees on the cash desk the sign:
// "I will be back in 30 minutes". One day John was sick of waiting and decided
// he needed a program that prints the time after 30 minutes.
// That way he won't have to wait at the desk and come at the appropriate time.
// He gave the assignment to you, so you have to do it.
//Input
//The input will be on two lines. On the first line, you will receive the hours,
// and on the second, you will receive the minutes.
//Output
//Print on the console the time after 30 minutes.
// The result should be in the format "hh:mm". The hours have one or two numbers,
// and the minutes always have two numbers (with leading zero).

public class BackIn30Minutes04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesToBack = minutes + 30;

        if (minutesToBack >= 60) {
            hours++;
            minutesToBack = minutesToBack - 60;
        }
        if (hours > 23) {
            hours= 0;
        }
        System.out.printf("%d:%02d", hours, minutesToBack);
    }
}
