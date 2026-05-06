package DataTypesAndVariablesEx;

import java.util.Scanner;
//Calculate how many courses will be needed to elevate n persons by using an elevator
// with a capacity of p persons.
//The input holds two lines: the number of people n and the capacity p of the elevator.

public class Elevator03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfTheElevator = Integer.parseInt(scanner.nextLine());

        // закръгляме нагоре, тъй като ако броя на хората, които ще ползват асансьора може да не е
        // достатъчен за запълване на капацитета на асансьора
        double courses = Math.ceil(numberOfPeople * 1.0 / capacityOfTheElevator);

        System.out.printf("%.0f", courses);

    }
}
