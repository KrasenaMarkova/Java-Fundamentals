package MidExamPreparation;

import java.util.Scanner;
//Create a program that checks if target plunder is reached. First, you will receive how many days the pirating lasts. Then you will receive how much the pirates plunder for a day. Last you will receive the expected plunder at the end.
//Calculate how much plunder the pirates manage to gather. Each day they gather the plunder.
// Keep in mind that they attack more ships every third day and add additional plunder to their total gain,
// which is 50% of the daily plunder. Every fifth day the pirates encounter a warship, and after the battle,
// they lose 30% of their total plunder.
//If the gained plunder is more or equal to the target, print the following:
//"Ahoy! {totalPlunder} plunder gained."
//If the gained plunder is less than the target. Calculate the percentage left and print the following:
//"Collected only {percentage}% of the plunder."
//Both numbers should be formatted to the 2nd decimal place.

public class BlackFlag04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOfPirating = Integer.parseInt(scanner.nextLine());
        int plunderForADay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double countOfPlunder = 0.0;

            for (int days = 1; days <= dayOfPirating ; days++) {

                countOfPlunder+= plunderForADay;
                if (days % 3 == 0) {
                    countOfPlunder += (plunderForADay / 2.0);
                }
                if (days % 5 == 0) {
                    countOfPlunder -= (countOfPlunder * 0.30);
                }
            }

        if (countOfPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.\n",countOfPlunder);
        } else {
            double percent = (countOfPlunder / expectedPlunder) * 100;
           System.out.printf("Collected only %.2f%% of the plunder.\n",percent);
        }
    }
}
