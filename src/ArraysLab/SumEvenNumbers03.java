package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;
//Read an array from the console and sum only the even numbers.

public class SumEvenNumbers03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //scanner.nextLine() -> "1 2 3 4 5 6"
        //scanner.nextLine().split(" ") -> ["1", "2","3", "4", "5", "6"] - вземаме въведените елементи между интервалите и ги
        // преобразуваме в масив
        //Arrays.stream(scanner.nextLine().split(" ")) -> дава възможност да модифицирам лесно елементите на масив,
        // т.е. преобразувам в масив от текст
        //mapToInt(Integer::parseInt) -> извършва действието в скобите върху всички елементи (т.е. преобразува всеки един
        // от елементите в цели числа) ->  //[1, 2, 3, 4, 5, 6]

        int [] numbers = Arrays.stream(scanner.nextLine()
                         .split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        int sumEven = 0; //сума на четните елементи в масива

        //обхождаме с foreach
        for (int number:numbers) {
            //действие, което повтаряме за всеки елемент
            if (number % 2 == 0) {
                sumEven += number;
            }
        }
        System.out.println(sumEven);
    }
}
