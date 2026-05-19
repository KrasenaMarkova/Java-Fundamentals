package Exam18022024;

import java.util.Scanner;

public class TheBiscuitFactory01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int competingFactoryProducesFor30Days = Integer.parseInt(scanner.nextLine());

        int finalCountOfBiscuits = 0;
        int countOfProducesPerDay = biscuitsPerDayPerWorker * countOfWorkers;
        int thirdDayProduces = (int) Math.floor(countOfProducesPerDay * 0.75);

        for (int day = 1; day <= 30 ; day++) {

            if (day % 3 == 0) {
                finalCountOfBiscuits += thirdDayProduces;
            } else {
                finalCountOfBiscuits += countOfProducesPerDay;
            }
        }
        System.out.printf("You have produced %d biscuits for the past month.\n", finalCountOfBiscuits);

        if (competingFactoryProducesFor30Days >= finalCountOfBiscuits) {
            double difference = competingFactoryProducesFor30Days - finalCountOfBiscuits;
            double differencePercent = (difference / competingFactoryProducesFor30Days) * 100;
            System.out.printf("You produce %.2f percent less biscuits.\n", differencePercent);
        } else {
            double myDifference = finalCountOfBiscuits - competingFactoryProducesFor30Days;
            double finalDifferencePercent = (myDifference / competingFactoryProducesFor30Days) * 100;
            System.out.printf("You produce %.2f percent more biscuits.\n", finalDifferencePercent);
        }
    }
}
