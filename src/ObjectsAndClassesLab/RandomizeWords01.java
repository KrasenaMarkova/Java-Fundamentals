package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;
//You are given a list of words in one line. Randomize their order and print each word on a separate line.

public class RandomizeWords01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] wordsArr = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < wordsArr.length ; i++) {
            int rndIndexX = random.nextInt(wordsArr.length);
            int rndIndexY = random.nextInt(wordsArr.length);

            String oldWord = wordsArr[rndIndexX];
            wordsArr[rndIndexX] = wordsArr[rndIndexY];
            wordsArr[rndIndexY] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
