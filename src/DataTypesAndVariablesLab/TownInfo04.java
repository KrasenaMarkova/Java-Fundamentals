package DataTypesAndVariablesLab;

import java.util.Scanner;
//You will be given 3 lines of input. On the first line, you will be given the name of the town,
// on the second – the population, and on the third – the area. Use the correct data types and
// print the result in the following format:
//"Town {town name} has population of {population} and area {area} square km.".

public class TownInfo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfTown = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",
                nameOfTown, population, area);

    }
}
