package Exam18022024;

import java.util.Scanner;

public class BurgerBus87Ot100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double countOfFinalEarned = 0.0;

        for (int i = 1; i <= numberOfCities ; i++) {

            String nameOfTheCity = scanner.nextLine();
            double ownerEarned = Double.parseDouble(scanner.nextLine());
            double ownerExpenses= Double.parseDouble(scanner.nextLine());
            count ++;

            if (count > 1) {
                if (count % 3 == 0) {
                    ownerExpenses = ownerExpenses + (ownerExpenses * 0.50);
                }
                if (count % 5 == 0) {
                    ownerEarned -= (ownerEarned * 0.10);
                }
            }
            double countOfEarnedForEveryCity = ownerEarned - ownerExpenses;
            countOfFinalEarned +=countOfEarnedForEveryCity;

            System.out.printf("In %s Burger Bus earned %.2f leva.\n", nameOfTheCity, countOfEarnedForEveryCity);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", countOfFinalEarned);
    }
}
