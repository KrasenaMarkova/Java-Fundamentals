package BasicsOverviewEx;

import java.util.Scanner;
//As a MOBA challenger player, Peter has the bad habit of trashing his PC when he loses a game
// and rage quits. His gaming setup consists of a headset, mouse, keyboard, and display.
// You will receive Peter's lost games count.
//Every second lost game, Peter trashes his headset.
//Every third lost game, Peter trashes his mouse.
//When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
//Every second time when he trashes his keyboard, he also trashes his display.
//You will receive the price of each item in his gaming setup. Calculate his rage expenses for
// renewing his gaming equipment.
//Input / Constraints
//•	On the first input line - lost games count – integer in the range [0, 1000].
//•	On the second line – headset price - the floating-point number in the range [0, 1000].
//•	On the third line – mouse price - the floating-point number in the range [0, 1000].
//•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
//•	On the fifth line – display price - the floating-point number in the range [0, 1000].

public class RageExpenses11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headSetCount = 0;
        int mouseCount = 0;
        int keyCount = 0;
        int displayCount = 0;

        for (int game = 1; game <= lostGamesCount ; game++) {
            if (game % 2 == 0) {
                headSetCount++;
            }
            if (game % 3 == 0) {
                mouseCount++;
            }
            if (game % 6 == 0) {
                keyCount++;
            }
            if (game % 12 == 0) {
                displayCount++;
            }
        }
        double totalPrice = (headsetPrice * headSetCount) + (mousePrice * mouseCount) +
        (keyboardPrice * keyCount) + (displayPrice * displayCount);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
