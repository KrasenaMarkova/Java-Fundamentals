package DataTypesAndVariablesEx;

import java.util.Scanner;
//Write a program that calculates the volume of n beer kegs.
//You will receive in total 3 * n lines. Every three lines will hold information for a single keg.
//First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
//Calculate the volume using the following formula: π * r^2 * h.
//In the end, print the model of the biggest keg.

public class BeerKegs08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kegsCount = Integer.parseInt(scanner.nextLine());
        //  - Обходим всички кегове
        //  - Изчисляваме обема на кега
        //  - Проверяваме дали сме намерили по-голям кег от досегашният най-голям

        String kegType = "";
        double maxVolume = 0.0;

        for (int i = 1; i <= kegsCount ; i++) {
            // Информация за текущият кег:
            String modelOfKeg = scanner.nextLine();
            double radiusOfKeg = Double.parseDouble(scanner.nextLine());
            int heightOfKeg = Integer.parseInt(scanner.nextLine());

            //Формула: π * r^2 * h
            double volumeOfKed = Math.PI * (radiusOfKeg * radiusOfKeg) * heightOfKeg;
            // Проверяваме дали сме намерили по-голям кег
            if (volumeOfKed > maxVolume) {
                maxVolume = volumeOfKed;
                kegType = modelOfKeg;
            }
        }
        System.out.println(kegType);
    }
}
