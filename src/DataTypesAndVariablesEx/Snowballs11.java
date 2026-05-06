package DataTypesAndVariablesEx;

import java.util.Scanner;
//write a program that calculates snowball data and outputs the best snowball value.
//You will receive N – an integer, the number of snowballs being made by Tony and Andi.
//For each snowball, you will receive 3 input lines:
//•	On the first line, you will get the snowballSnow – an integer.
//•	On the second line, you will get the snowballTime – an integer.
//•	On the third line, you will get the snowballQuality – an integer.
//For each snowball, you must calculate its snowballValue by the following formula:
//(snowballSnow / snowballTime) ^ snowballQuality
//In the end, you must print the highest calculated snowballValue.

public class Snowballs11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSnowball = Integer.parseInt(scanner.nextLine());

        double maxValue = 0.0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 1; i <= numberOfSnowball ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d) ", maxSnowballSnow, maxSnowballTime, maxValue, maxSnowballQuality);
    }
}
