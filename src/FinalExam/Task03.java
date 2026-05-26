package FinalExam;

import java.util.*;

import static java.util.Objects.nonNull;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> guestAndMeal = new LinkedHashMap<>();

        int countOfUnlikeMeal = 0;

        while (!command.equals("Stop")) {
            String[] partOfCommand = command.split("-");
            String currentcommand = partOfCommand[0];
            String guest = partOfCommand[1];
            String meal = partOfCommand[2];

            switch (currentcommand) {
                case "Like":
                    if (guestAndMeal.containsKey(guest)) {
                        if (!guestAndMeal.get(guest).contains(meal)) {
                            guestAndMeal.get(guest).add(meal);
                        }
                        /*if (!guestAndMeal.containsValue(meal)) {
                            guestAndMeal.get(guest).add(meal);
                        }*/
                    } else {
                        guestAndMeal.put(guest, new ArrayList<>());
                        guestAndMeal.get(guest).add(meal);
                    }
                    break;
                case "Dislike":
                    if (guestAndMeal.containsKey(guest)) {
                           /* if (guestAndMeal.containsValue(meal)) {
                                guestAndMeal.put(guest, new ArrayList<>());
                                guestAndMeal.get(guest).add(meal);
                            } else {
                                System.out.printf("%s doesn't have the %s in his/her collection.\n", guest, meal);
                            }*/
                        if (guestAndMeal.get(guest).contains(meal)) {
                            countOfUnlikeMeal++;
                            guestAndMeal.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.\n", guest, meal);
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.\n", guest, meal);
                        }
                        /*if (!guestAndMeal.containsValue(meal)) {
                            System.out.printf("%s doesn't have the %s in his/her collection.\n", guest, meal);
                        } else {
                            countOfUnlikeMeal++;
                            guestAndMeal.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.\n", guest, meal);
                        }*/
                    } else {
                        System.out.printf("%s is not at the party.\n", guest);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : guestAndMeal.entrySet()) {
            String guestName = entry.getKey();
            List<String> meals = entry.getValue();

            System.out.printf("%s: ", guestName);

            if (nonNull(meals) && meals.size() > 0) {
                for (int i = 0; i < meals.size(); i++) {
                    String meal = meals.get(i);
                    if (i == meals.size() - 1) {
                        System.out.print(meal);
                    } else {
                        System.out.print(meal + ", ");
                    }
                }

               /* for (String meal : meals) {
                    System.out.print(meal + ", ");
                }*/


            }
            System.out.println();

        }
        System.out.printf("Unliked meals: %d\n", countOfUnlikeMeal);
    }
}
