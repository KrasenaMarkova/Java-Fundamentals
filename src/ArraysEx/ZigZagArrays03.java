package ArraysEx;

import java.util.Scanner;
//Write a program that creates 2 arrays. You will be given an integer n. On the next n lines,
// you get 2 integers. Form 2 arrays as shown below.

public class ZigZagArrays03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String [] firstArray = new String[n];
        String [] secondArray = new String[n];

        int position = 0;

        for (int row = 1; row <= n ; row++) {
            //прочитаме от конзолата чрез стрингов цикъл
            String [] textRow = scanner.nextLine().split(" ");

            // създаваме 2 стринга, които ще ни пазят всеки 1 елемент от всеки ред
            String firstElement = textRow [0];
            String secondElement = textRow [1];


            if (row % 2 == 0) {
                firstArray [position] = secondElement;
                secondArray [position] = firstElement;
            } else {
                firstArray [position] = firstElement;
                secondArray [position] = secondElement;
            }
            // променяме при всяко завъртане на цикъла позицията в масива
            position++;
        }
        // обхождаме всеки елемент от цикъла и го отпечатваме
        for (String arrayNum : firstArray) {
            System.out.print(arrayNum + " ");
        }
        System.out.println();
        for (String arrayNumber : secondArray) {
            System.out.print(arrayNumber + " ");
        }
    }
}
