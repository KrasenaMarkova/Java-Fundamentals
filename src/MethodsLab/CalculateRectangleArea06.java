package MethodsLab;

import java.util.Scanner;
//Create a method that calculates and returns the area of a rectangle by given width and length.

public class CalculateRectangleArea06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int lenght = Integer.parseInt(scanner.nextLine());
         int width = Integer.parseInt(scanner.nextLine());

         int area = calculateArea (lenght, width);
         System.out.print(area);
    }

    //метод, който изчислява и връща лицето на правоъгълник
    public static int calculateArea(int lenght, int width) {
        int area = lenght * width;
        return area;
    }
}
