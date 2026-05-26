package FinalExam;

import java.util.Scanner;
//77/100

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Abracadabra")) {
            String[] commandPart = command.split(" ");
            String currentCommand = commandPart[0];

            switch (currentCommand) {
                case "Abjuration":
                    spell = spell.toUpperCase();
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = spell.toLowerCase();
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(commandPart[1]);
                    String letter = commandPart[2];
                    if (index >= 0 && index <= spell.length() - 1) {
                        spell = spell.substring(0, index) + letter + spell.substring(index + 1);
                        //String currentLetter = String.valueOf(spell.charAt(index));
                        //spell = spell.replace(currentLetter, letter);

                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = commandPart[1];
                    String secondSubstring = commandPart[2];

                    if (spell.contains(firstSubstring)) {
                        spell = spell.replaceAll(firstSubstring, secondSubstring);
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    String substring = commandPart[1];
                    spell = spell.replace(substring, "");
                    System.out.println(spell);
                    break;
                default:
                    System.out.println("The spell did not work!");

            }
            command = scanner.nextLine();
        }
    }
}
