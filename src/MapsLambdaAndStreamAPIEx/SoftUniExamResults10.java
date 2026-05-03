package MapsLambdaAndStreamAPIEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//Judge statistics on the last Programming Fundamentals exam were not working correctly, so you have the task
// to take all the submissions and analyze them properly. You should collect all the submissions and print the
// final results and statistics about each language in which the participants submitted their solutions.
//You will be receiving lines in the following format: "{username}-{language}-{points}" until you receive "exam
// finished". You should store each username and their submissions and points.
//You can receive a command to ban a user for cheating in the following format: "{username}-banned".
// In that case, you should remove the user from the contest but preserve his submissions in the total count
// of submissions for each language.
//After receiving "exam finished", print each of the participants in the following format:
//"Results:
//{username} | {points}
//{username2} | {points}
//{usernameN} | {points}"
//After that, print each language used in the exam in the following format:
//"Submissions:
//{language1} - {submissions_count}
//{language2} - {submissions_count}
//{language3} - {submissions_count}"
//Input / Constraints
//Until you receive "exam finished", you will be receiving participant submissions in the following format:
// "{username}-{language}-{points}"
//You can receive a ban command -> "{username}-banned".
//The participant's points will always be a valid integer in the range [0-100].
//Output
//•	Print the exam results for each participant.
//•	After that, print each language in the format shown above.
//•	Allowed working time / memory: 100ms / 16MB.

public class SoftUniExamResults10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> userAndPoints = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {

            if (input.contains("banned")) {
                //Katy-banned
                String userName = input.split("-")[0];
                userAndPoints.remove(userName);
            } else {
                //Peter-Java-84
                String userName = input.split("-")[0];
                String languages = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);

                if (!userAndPoints.containsKey(userName)) {
                    userAndPoints.put(userName, points);
                } else {
                    int existingPoints = userAndPoints.get(userName);
                    if (points > existingPoints) {
                        userAndPoints.put(userName, points);
                    }
                }

                if (!languageCount.containsKey(languages)) {
                    languageCount.put(languages, 1);
                } else {
                    int existingCount = languageCount.get(languages);
                    languageCount.put(languages, existingCount + 1);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userAndPoints.entrySet().forEach(entry-> System.out.printf("%s | %d\n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");
        languageCount.entrySet().forEach(entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue()));
    }
}
