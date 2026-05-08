package DataTypesAndVariablesLab;

import java.util.Scanner;
//You will be given an integer that will be a distance in meters.
// Write a program that converts meters to kilometers formatted to the second decimal point.

public class ConvertMetersToKilometers01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());

        double metersToKilometeres = meters / 1000;

        System.out.printf("%.2f", metersToKilometeres);

    }
}
