package FinalExamPreparation;

import java.util.Scanner;
//The first line of the input will be your raw activation key. It will consist of letters and numbers only.
//After that, until the "Generate" command is given, you will be receiving strings with instructions for different operations that need to be performed upon the raw activation key.
//There are several types of instructions, split by ">>>":
//•	"Contains>>>{substring}":
//o	If the raw activation key contains the given substring, prints: "{raw activation key} contains {substring}".
//o	Otherwise, prints: "Substring not found!"
//•	"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
//o	Changes the substring between the given indices (the end index is exclusive) to upper or lower case and then prints the activation key.
//o	All given indexes will be valid.
//•	"Slice>>>{startIndex}>>>{endIndex}":
//o	Deletes the characters between the start and end indices (the end index is exclusive) and prints the activation key.
//o	Both indices will be valid.
//Input
//•	The first line of the input will be a string consisting of letters and numbers only.
//•	After the first line, until the "Generate" command is given, you will be receiving strings.
//Output
//•	After the "Generate" command is received, print:
//o	"Your activation key is: {activation key}"

public class ActivationKeys01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();//ключ за активация
        String command = scanner.nextLine();//команди, които трябва да изпълня върху activationKey

        while (!command.equals("Generate")) {
            String[] commandPart = command.split(">>>");
            String commandName = commandPart[0];//"Contains", "Flip", "Slice"

            switch (commandName) {
                case "Contains":
                    //command = "Contains>>>def".split(">>>")-> ["Contains", "def"]
                    String substring = commandPart[1];
                    if (activationKey.contains(substring)) {
                        //subString се съдържа в activationKey
                        System.out.printf("%s contains %s\n", activationKey, substring);
                    } else {
                        //subString НЕ се съдържа в activationKey
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    //command = "Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}".split(">>>") -> ["Flip", "Upper/Lower", "{startIndex}", "{endIndex}"]
                    String type = commandPart[1];
                    int startIndex = Integer.parseInt(commandPart[2]);
                    int endIndex = Integer.parseInt(commandPart[3]);

                    //1. взимаме текста между [startIndex, endIndex)
                    String textForReplace = activationKey.substring(startIndex, endIndex);
                    String newText = "";
                    //2. променяме го спрямо type
                    if (type.equals("Upper")) {
                        newText = textForReplace.toUpperCase();
                    } else if (type.equals("Lower")) {
                        newText = textForReplace.toLowerCase();
                    }
                    //3. вмъкваме го на мястото на предишния
                    activationKey = activationKey.replace(textForReplace, newText);
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    //command = "Slice>>>2>>>5".split(">>>")-> ["Slice","2", "5"]
                    int startIndex1 = Integer.parseInt(commandPart[1]);
                    int endIndex1 = Integer.parseInt(commandPart[2]);
                    //изтривам всички символи от startIndex до endIndex (не е вкл.) на activationKey

                    //начин 1
                    /*StringBuilder sb = new StringBuilder(activationKey);
                    sb.delete(startIndex, endIndex);
                    activationKey = sb.toString();*/

                    //начин 2
                    /*String firstPart = activationKey.substring(0, startIndex);
                    String secondPart = activationKey.substring(endIndex);
                    activationKey = firstPart + secondPart;*/

                    //начин 3
                    String textForRemove = activationKey.substring(startIndex1, endIndex1);
                    activationKey = activationKey.replace(textForRemove, "");

                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}
