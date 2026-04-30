package ArraysLab;

import java.util.Scanner;
//Print Numbers in Reverse Order

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1. съхраняваме числата в масив
        //брой на числата, с които ще работим
        int count = Integer.parseInt(scanner.nextLine());

        int [] numbers = new int[count];

        for (int position = 0; position <= numbers.length -1 ; position++) {
            numbers[position] = Integer.parseInt(scanner.nextLine());
        }
        //2. отпечтваме в обратен ред
        //обратен ред: последната позиция към първата
        for (int position = numbers.length - 1; position >= 0 ; position--) {
            System.out.print(numbers[position] + " ");
        }
    }
}
