package DataTypesAndVariablesLab;

import java.util.Scanner;
//You are given a working code that is a solution to Problem 9. Special Numbers.
// However, the variables are improperly named, declared before they are needed,
// and some of them are used for multiple things. Without using your previous solution,
// modify the code so that it is easy to read and understand.

public class RefactorSpecialNumbers12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int kolkko = Integer.parseInt(scanner.nextLine());
        //int obshto = 0;
        //int takova = 0;
        //boolean toe = false;
        //for (int ch = 1; ch <= kolkko; ch++) {
        //    takova = ch;
        //    while (ch > 0) {
        //        obshto += ch % 10;
        //        ch = ch / 10;
        //    }
        //    toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
        //    System.out.printf("%d -> %b%n", takova, toe);
        //    obshto = 0;
        //    ch = takova;
        //}
        int count = Integer.parseInt(scanner.nextLine());

        boolean isSpecialNum = false;
        for (int  number = 1;  number <= count;  number++) {
            int sum = 0;
            int currentNumber = number;

            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber /= 10;
            }
            boolean isTrue = (sum == 5) || (sum == 7) || (sum == 11);
            if (isTrue) {
                System.out.printf("%d -> True%n", number);
            } else {
                System.out.printf("%d -> False%n", number);
            }

        }

    }
}
