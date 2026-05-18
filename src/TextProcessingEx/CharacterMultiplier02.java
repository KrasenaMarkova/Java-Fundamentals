package TextProcessingEx;

import java.util.Scanner;
//Create a method that takes two strings as arguments and returns the sum of their character
// codes multiplied (multiply str1[0] with str2[0] and add to the total sum).
// Then continue with the next two characters. If one of the strings is longer than the other,
// add the remaining character codes to the total sum without multiplication.

public class CharacterMultiplier02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String firstText = input.split("\\s+")[0];
        String secondText = input.split("\\s+")[1];

        //намираме мин и макс дължина на двата текста за да може в последствие да ги сравним
        int minLength = Math.min(firstText.length(), secondText.length());
        int maxLength = Math.max(firstText.length(), secondText.length());
        int sum = 0;

        //обхождаме всеки един индекс от двата текса за да сумираме тяхните числови стойности
        for (int index = 0; index < minLength; index++) {
            sum += (firstText.charAt(index) * secondText.charAt(index));
        }

        // ако двата текста са с еднаква дължина разпечатваме тяхната сума
        if (minLength == maxLength) {
            System.out.println(sum);
            return;
        } else {
            //създаваме метод, който да пресмята общата сума ако дължината на двата текста е различна
            sum += getRemainingSymbolSum(firstText, secondText, minLength, maxLength);
        }
        System.out.println(sum);
    }

    private static int getRemainingSymbolSum(String firstText, String secondText, int minLength, int maxLength) {
        int remainingSum = 0;

        if (maxLength == firstText.length()) {
            for (int index = minLength; index < maxLength; index++) {
                remainingSum += firstText.charAt(index);
            }
        } else {
            for (int index = minLength; index < maxLength; index++) {
                remainingSum += secondText.charAt(index);
            }
        }
        return remainingSum;
    }
}
