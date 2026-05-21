package FinalExamPreparation;

import java.util.Scanner;
//On the first line of the input, you will receive the encrypted message. After that,
// until the "Decode" command is given, you will be receiving strings with instructions for different
// operations that need to be performed upon the concealed message to interpret it and reveal its true content. There are several types of instructions, split by '|'
//•	"Move {number of letters}":
//o	Moves the first n letters to the back of the string
//•	"Insert {index} {value}":
//o	Inserts the given value before the given index in the string
//•	"ChangeAll {substring} {replacement}":
//o	Changes all occurrences of the given substring with the replacement text
//Input / Constraints
//•	On the first line, you will receive a string with a message.
//•	On the following lines, you will be receiving commands, split by '|' .
//Output
//•	After the "Decode" command is received, print this message:
//"The decrypted message is: {message}"

public class TheImitationGame01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // създаваме StringBuilder за по- лесна маниполация на encrypted message
        StringBuilder message = new StringBuilder(input);
        String commands = scanner.nextLine();

        while (!commands.equals("Decode")) {
            String[] instructions = commands.split("\\|");
            String currentCommand = instructions[0];

            switch (currentCommand) {
                case "Move":
                    int numberOfLettersToMove = Integer.parseInt(instructions[1]);
                    //вземаме и запазваме в String substring броя на буквите, които трябва да премахнем
                    String substring = message.substring(0, numberOfLettersToMove);
                    //изтриваме буквите, които трябва да преместим на последните индекси
                    message.delete(0, numberOfLettersToMove);
                    // поставяме ги на последните индекси
                    message.append(substring);
                    break;
                case "Insert":
                    int index = Integer.parseInt(instructions[1]);
                    String value = instructions[2];
                    //Вмъкваме дадената стойност преди дадения индекс в низа
                    message.insert(index,value);
                    break;
                case "ChangeAll":
                    String textToReplace = instructions[1];
                    String replacement = instructions[2];
                    //ако искаме да заменим един String с друг с метода replace става само със String
                    String currentMessage = message.toString();
                    String newMessage = currentMessage.replace(textToReplace, replacement);
                    // прехвърляме промянава в нашият начален StringBuilder
                    message = new StringBuilder(newMessage);
                    break;
                //case "Delete":
                // int numberOfLettersToDelete = Integer.parseInt(instructions[1]);
                // message.delete(0, numberOfLetters);
                // break;
            }
            commands = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}
