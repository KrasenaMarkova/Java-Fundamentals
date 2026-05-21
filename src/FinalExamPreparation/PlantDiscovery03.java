package FinalExamPreparation;

import java.util.*;
//On the first line, you will receive a number n. On the next n lines, you will be given some information about the plants that you have discovered in the format: "{plant}<->{rarity}". Store that information because you will need it later. If you receive a plant more than once, update its rarity.
//After that, until you receive the command "Exhibition", you will be given some of these commands:
//•	"Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
//•	"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
//•	"Reset: {plant}" – remove all the ratings of the given plant
//Note: If any given plant name is invalid, print "error"
//After the command "Exhibition", print the information that you have about the plants in the following format:
//"Plants for the exhibition:
//- {plant_name1}; Rarity: {rarity}; Rating: {average_rating}
//- {plant_name2}; Rarity: {rarity}; Rating: {average_rating}
//…
//- {plant_nameN}; Rarity: {rarity}; Rating: {average_rating}"
//The average rating should be formatted to the second decimal place.
//Input / Constraints
//•	You will receive the input as described above.
//•	JavaScript: you will receive a list of strings.
//Output
//•	Print the information about all plants as described above.

public class PlantDiscovery03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRatings = new LinkedHashMap<>();

        // откриваме нови растения
        for (int plant = 1; plant <= n; plant++) {
            String[] plantInformation = scanner.nextLine().split("<->");
            String name = plantInformation[0];
            int rarity = Integer.parseInt(plantInformation[1]);
            plantRarity.put(name, rarity);
            plantRatings.put(name, new ArrayList<>());
        }
        //оценяваме откритите растения
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandParts = command.split("[: -]+");
            String commandName = commandParts[0];
            String plantName = commandParts[1];

            if (plantRatings.containsKey(plantName)) {
                switch (commandName) {
                    case "Rate":
                        double rating = Double.parseDouble(commandParts[2]);
                        plantRatings.get(plantName).add(rating);
                        break;
                    case "Update":
                       int newRarity = Integer.parseInt(commandParts[2]);
                        plantRarity.put(plantName, newRarity);
                        break;
                    case "Reset":
                        plantRatings.get(plantName).clear();
                        break;
                }
            } else {
                System.out.println("error");
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> plantRarityInformation : plantRarity.entrySet()) {
            String plantName = plantRarityInformation.getKey();
            int rarity = plantRarityInformation.getValue();
            List<Double> ratings = plantRatings.get(plantName);

            //mapToDouble(Double::doubleValue).sum(); - преобразува Double към double
            double averageRating;
            if (ratings.isEmpty()) {
                averageRating = 0.00;
            } else {
                averageRating = ratings.stream().mapToDouble(Double::doubleValue).sum() / ratings.size();
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",plantName, rarity, averageRating );
        }
    }
}
