package BasicsOverviewEx;

import java.util.Scanner;
//We are placing N orders at a time. You need to calculate the price on the following formula:
//((daysInMonth * capsulesCount) * pricePerCapsule)
//Input / Constraints
//•	On the first line, you will receive integer N – the count of orders the shop will receive.
//•	For each order, you will receive the following information:
//o	Price per capsule - floating-point number in the range [0.00…5000.00].
//o	Days – integer in the range [1…31].
//o	Capsules count - integer in the range [0…7000000].
//The input will be in the described format, there is no need to check it explicitly.

public class Orders09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;
        double finalTotalPrice = 0.0;

        for (int i = 1; i <= countOfOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int day = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            totalPrice = ((day * capsulesCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f\n", totalPrice);

            finalTotalPrice += totalPrice;
        }
        System.out.printf("Total: $%.2f", finalTotalPrice);
    }
}
