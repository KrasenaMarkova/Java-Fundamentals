package ArraysEx;

import java.util.Scanner;
//You will be given a count of wagons in a train n. On the next n lines,
// you will receive how many people will get on that wagon. In the end, print the whole train and
// the sum of the people on the train.

public class Train01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());
        int [] wagons = new int[wagonCount];

        //
        for (int wagon = 0; wagon < wagonCount; wagon++) {
            int group = Integer.parseInt(scanner.nextLine());
            // за всяка една позиция на масива прочитаме стойност от конзилата
            wagons [wagon] = group;
        }
        int sum = 0;

        //обхождаме масива и разпечатваме всяка стойност с интервал след нея
        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.printf("\n%s",sum);
    }
}
