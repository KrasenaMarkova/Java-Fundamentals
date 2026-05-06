package DataTypesAndVariablesEx;

import java.util.Scanner;
//You have a water tank with a capacity of 255 liters.
//On the next n lines, you will receive liters of water, which you must pour into your tank.
//If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line.
// On the last line, print the liters in the tank.

public class WaterOverflow07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int countOfLiters = 0;

        for (int i = 1; i <= numberOfLines ; i++) {
            int quantitiesOfWater = Integer.parseInt(scanner.nextLine());
            countOfLiters += quantitiesOfWater;

            if (countOfLiters > 255) {
                System.out.println("Insufficient capacity!");
                countOfLiters-= quantitiesOfWater;
            }
        }
        System.out.println(countOfLiters);
    }
}
