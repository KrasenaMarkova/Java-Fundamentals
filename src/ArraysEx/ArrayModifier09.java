package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;
//You are given an array with integers. Write a program to modify the elements after receiving the
// following commands:
//•	"swap {index1} {index2}" takes two elements and swap their places.
//•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at
// 2nd index. Save the product at the 1st index.
//•	"decrease" decreases all elements in the array with 1.

public class ArrayModifier09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
               int firstIndex = Integer.parseInt(command.split(" ")[1]);
               int secondIndex = Integer.parseInt(command.split(" ")[2]);

               int firstIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

               numbers[firstIndex] = secondIndexNumber;
               numbers[secondIndex] = firstIndexNumber;

            } else if (command.contains("multiply")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers [firstIndex];
                int secondIndexNumber = numbers [secondIndex];

                int product = firstIndexNumber * secondIndexNumber;
                numbers [firstIndex] = product;
                
            } else{
                for (int position = 0; position < numbers.length; position++) {
                    numbers [position]--;
                }

            }
            command = scanner.nextLine();
        }
        //  Начин 1:
      // for (int position = 0; position < numbers.length; position++) {

          // if (position == numbers.length - 1) {
            //   System.out.print(numbers[position]);
          //  } else {
            //   System.out.print(numbers[position] + ", ");
         //  }
      // }

        System.out.println(
                Arrays.toString(numbers)
                        //да заменим отворената скоба с празен String
                        .replace("[", "")
                        .replace("]", "")
        );
    }
}
