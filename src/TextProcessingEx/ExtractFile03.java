package TextProcessingEx;

import java.util.Scanner;
//Write a program that reads the path to a file and subtracts the file name and its extension.

public class ExtractFile03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] text = input.split("\\\\");

        String fileName = text[text.length - 1].split("\\.")[0];
        String fileExtension = text[text.length - 1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}
