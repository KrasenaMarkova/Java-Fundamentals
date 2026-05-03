package MapsLambdaAndStreamAPILab;

import java.util.*;
//Write a program that keeps a map with synonyms. The key to the map will be the word.
// The value will be a list of all the synonyms of that word. You will be given a number n. On the next 2 * n lines,
// you will be given the word and a synonym each on a separate line like this:
//•	{word}
//•	{synonym}
//If you get the same word for the second time, just add the new synonym to the list.
//Print the words in the following format:
//{word} - {synonym1, synonym2… synonymN}

public class WordSynonyms02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wordsCount = Integer.parseInt(scanner.nextLine());
        Map <String, List<String>> wordSynonymMap = new LinkedHashMap<>();

        for (int count = 1; count <= wordsCount ; count++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            // не сме срещали думата до в момента
            wordSynonymMap.putIfAbsent(word, new ArrayList<>());
            // думата сме я срещали
            wordSynonymMap.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> pair : wordSynonymMap.entrySet()) {
            // всеки един запис се съхранява в pair
            String word = pair.getKey();
            List<String> synonums = pair.getValue();
            System.out.println(word + " - " + String.join(", ", synonums));
        }
    }
}
