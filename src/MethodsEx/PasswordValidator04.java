package MethodsEx;

import java.util.Scanner;
//Write a program that checks if a given password is valid. Password rules are:
//•	6 – 10 characters (inclusive);
//•	Consists only of letters and digits;
//•	Have at least 2 digits.
//If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule, print a message:
//•	"Password must be between 6 and 10 characters"
//•	"Password must consist only of letters and digits"
//•	"Password must have at least 2 digits"

public class PasswordValidator04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        //1. Проверяваме дали дължината на паролата е между 6 и 10 символа
        boolean isLengthValid = isLengthValid(password);
        if (!isLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. Проверяваме дали съдържа само цифри и букви
        boolean isContendValid = isContendValid(password);
        if (!isContendValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        //3. Проверяваме дали има поне 2 цифри
        boolean isAtLeastTwoDigits = isAtLeastTwoDigits(password);
        if (!isAtLeastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        // Ако и трите условия са спазени ще кажем, че паролата е валидна:
        if (isLengthValid && isContendValid && isAtLeastTwoDigits) {
            System.out.println("Password is valid");
        }

    }

    public static boolean isAtLeastTwoDigits(String password) {
        int countDigit = 0;
        for ( char symbol : password.toCharArray()) {
           if (Character.isDigit(symbol)){
               countDigit++;
           }
        }
        return countDigit >= 2;
    }

    public static boolean isContendValid(String password) {
        for (char symbol : password.toCharArray()) {
           if (!Character.isLetterOrDigit(symbol)) {
               return false;
           }
        }
        return true;
    }

    public static boolean isLengthValid(String password) {
    return password.length() >= 6 && password.length() <= 10;
    }
}
