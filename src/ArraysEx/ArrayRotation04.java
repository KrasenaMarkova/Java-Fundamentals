package ArraysEx;

import java.util.Scanner;
//Write a program that receives an array and the number of rotations you have to perform
// (the first element goes at the end). Print the resulting array.

public class ArrayRotation04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= numberOfRotations; rotation++) {
            //Вземаме първият елемент от масива
            String firstElement = array [0];

           // Обхождаме масива и преместваме елементите наляво
            for (int position = 0; position <array.length - 1 ; position++) {
                array [position] = array [position +1];
            }
            //Поставяме първият елемент на последна позиция
            array [array.length - 1] = firstElement;
        }
        for (String elementArray : array) {
            System.out.print(elementArray + " ");

        }
    }
}
