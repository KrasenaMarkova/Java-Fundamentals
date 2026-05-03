package BasicsOverviewLab;

import java.util.Scanner;
//Take as an input an even number and print its absolute value with a message:
// "The number is: {absoluteValue}". If the number is odd, print "Please write an even number."
// and continue reading numbers.

public class EvenNumber11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 != 0) {
            System.out.println("Please write an even number.");

            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d\n", Math.abs(number));
    }
}
