package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Write a program that sum all numbers in a list in the following order:
//first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.

public class GaussTrick02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list =  Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());
        // създаваме си нов лист, в който ще запазваме новите стойности
        List<Integer> newList = new ArrayList<>();

       int i = 0;

       while (i < list.size() / 2) {
           int sum = list.get(i) + list.get(list.size() - 1 - i);
           newList.add(sum);
           i++;
        }
        if (list.size() % 2 != 0) {
            newList.add(list.get(list.size() / 2));
        }

        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }
    }
}
