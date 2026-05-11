package MethodsLab;

import java.util.Scanner;
//Write a method that receives a string and a repeat count n (integer).
// The method should return a new string (the old one repeated n times).

public class RepeatString07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String textToRepeat = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());

        String finalText = buildText (textToRepeat, countRepeat);

        System.out.println(finalText);
    }

    //метод, който образува текста и го връща
    public static String buildText(String textToRepeat, int countRepeat) {
        String builtText = "";
        for (int count = 1; count <= countRepeat ; count++) {
            builtText += textToRepeat;
        }
        //готовия текст с повторенията
        return builtText;
    }
}
