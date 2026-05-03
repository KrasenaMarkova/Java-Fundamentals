package BasicsOverviewLab;

import java.util.Scanner;

public class SumOfOddNumbers09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfOddNum = Integer.parseInt(scanner.nextLine());
        int countOfnums = 0;
        int numbers = 1;

        for (int i = 1; i <= numberOfOddNum ; i++) {
            System.out.println(numbers);
            countOfnums += numbers;
            numbers += 2;
        }
        System.out.printf("Sum: %d", countOfnums);
    }
}
