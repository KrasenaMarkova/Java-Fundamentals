package DataTypesAndVariablesLab;

import java.util.Scanner;
//Write a program that prints whether a given character is upper-case or lower-case.

public class LowerOrUpper08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //на 0 позиция стои първата буква
        char symbol = scanner.nextLine().charAt(0);

        // проверка дали символа е главна буква
        if (Character.isUpperCase(symbol)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
        // начин 2
        // int code = (int) symbol; //аски код на въведения символ
        //        if (code >= 97 && code <= 122) {
        //            //малка буква - код: [97; 122]
        //            System.out.println("lower-case");
        //        } else if (code >= 65 && code <= 90) {
        //            //голяма буква - код: [65; 90]
        //            System.out.println("upper-case");
        //        }
    }
}
