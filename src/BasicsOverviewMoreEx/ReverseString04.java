package BasicsOverviewMoreEx;

import java.util.Scanner;
//Write a program that reverses a string and prints it on the console.

public class ReverseString04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverses = "";

        //С for цикъл обхождаме всяка посиция от входните данни

        for (int position = input.length() -1 ; position >= 0 ; position--) {
            // всеки символ, който отговаря на текущата позиция се добавя към променлива reverses и
            // след всяко разпечатване зануляваме информацията в променливата.
            reverses += input.charAt(position);

            System.out.print(reverses);
            reverses = "";

        }
    }
}
