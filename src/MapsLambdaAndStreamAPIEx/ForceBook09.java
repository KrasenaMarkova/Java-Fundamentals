package MapsLambdaAndStreamAPIEx;

import java.util.*;
//The force users are struggling to remember which side is the different forceUsers from because they
// switch them too often. So you are tasked to create a web application to manage their profiles.
//You will receive several input lines in one of the following formats:
//"{force_side} | {force_user}"
//"{force_user} -> {force_side}"
//The "force_user" and "force_side" are strings containing any character.
//If you receive "force_side | force_user":
//•	If there is no such force user and no such force side -> create a new force side and add the force user
// to the corresponding side.
//•	Only if there is no such force user on any force side -> add the force user to the corresponding side.
//•	If there is such force user already -> skip the command and continue to the next operation.
//If you receive a "force_user -> force_side":
//•	If there is such force user already -> change their side.
//•	If there is no such force user on any force side -> add the force user to the corresponding force side.
//•	If there is no such force user and no such force side -> create a new force side and add the force user
// to the corresponding side.
//•	Then you should print on the console: "{force_user} joins the {force_side} side!".
//You should end your program when you receive the command "Lumpawaroo". At that point, you should print each
// force side. For each side, print the force users.
//In case there are no force users on a side, you shouldn't print the side information.
//Input / Constraints
//•	The input comes in the form of commands in one of the formats specified above.
//•	The input ends when you receive the command "Lumpawaroo".

public class ForceBook09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

                String teamName = input.split(" \\| ")[0];
                String playerName = input.split(" \\| ")[1];

                // 1. Ако няма такъв отбор, създаваме нов с празен списък с играчи.
                if (!teams.containsKey(teamName)) {
                    teams.put(teamName, new ArrayList<>());
                }

                // 2. Проверяваме този играч дали фигурира в друг отбор.
                boolean isThisPlayerPartOfAnotherTeam = false;
                for (List<String> team : teams.values()) {
                    if (team.contains(playerName)) {
                        isThisPlayerPartOfAnotherTeam = true;
                        break;
                    }
                }

                // 3. Ако този играч не фигурира в друг отбор го прибавяме към този отбор.
                if (!isThisPlayerPartOfAnotherTeam) {
                    teams.get(teamName).add(playerName);
                }
            } else if (input.contains("->")) {

                String playerName = input.split(" -> ")[0];
                String teamName = input.split(" -> ")[1];

                //1. Премахваме играча от текущия отбор.
                for (List<String> team : teams.values()) {
                    team.remove(playerName);
                }

                //2. Проверяваме дали отбора, в който трябва да отиде играча съществува.
                if (teams.containsKey(teamName)) {
                    teams.get(teamName).add(playerName);
                } else {
                    teams.put(teamName, new ArrayList<>());
                    teams.get(teamName).add(playerName);
                }
                System.out.printf("%s joins the %s side!%n", playerName, teamName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : teams.entrySet()) {
            String teamName = entry.getKey();
            List<String> players = entry.getValue();

            if (players.size() > 0) {
                System.out.printf("%s: ", teamName);
                System.out.println("Side: " + teamName + ", Members: " + players.size());
                players.forEach(player -> System.out.println("! " + player));
            }
        }
    }
}
