package DataTypesAndVariablesEx;

import java.util.Scanner;
//A Poke Mon is a special type of pokemon which likes to Poke others. But at the end of the day,
// the Poke Mon wants to keep statistics about how many pokes it has managed to make.
//The Poke Mon pokes his target and then proceeds to poke another target.
// The distance between his targets reduces his poke power.

public class PokeMon10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startPowerPoke = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int powerPoke = startPowerPoke;
        int countPoket = 0;

        while (distance <= powerPoke) {

            // 1. Отива до целта (power -= distance)
            powerPoke -= distance;

            // 2. Отброяваме успешно намушкване
            countPoket++;

            // 3. Проверяваме дали сме стигнали фактор на умора
            if (powerPoke == startPowerPoke / 2) {
                if (factor != 0) {
                    powerPoke /= factor;
                }
            }
        }
        System.out.println(powerPoke);
        System.out.println(countPoket);
    }
}
