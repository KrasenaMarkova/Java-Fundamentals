package DataTypesAndVariablesMoreEx;

import java.util.Scanner;
//You will receive input until you receive "END". Find what data type is the input. Possible data types are:
//•	Integer
//•	Floating point
//•	Characters
//•	Boolean
//•	Strings
//Print the result in the following format: "{input} is {data type} type".

public class DataTypeFinder01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String type = "";
            //проверка за типовете

            // equalsIgnoreCase - сравнява двата кейса без значение дали са с главни или малки букви
            if (input .equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";
            }
            else if (input.length() == 1){
                char symbol = input.charAt(0);
                // ASCI таблицата
                if (symbol < 47 || symbol > 58){
                    type = "character";
                    // символ
                } else {
                    type = "integer";
                    // едноцифрено цяло число
                }
            } else {
                boolean isString = false;
                boolean isFloat = false;

                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);
                    // проверка дали е символ

                    if (currentSymbol < 45 || currentSymbol > 57) {
                        isString = true;
                    }
                    if (currentSymbol == 46) {
                        isFloat = true;
                    }
                }
                if (isString) {
                    type = "string";
                } else {
                    if (isFloat) {
                        type = "floating point";
                    } else {
                        type = "integer";
                    }
                }
            }
            System.out.printf("%s is %s type\n", input, type);
            input = scanner.nextLine();
        }
    }
}
