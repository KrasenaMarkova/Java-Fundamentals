package BasicsOverviewMoreEx;

import java.util.Scanner;
//Write a program that helps you buy the games.
// The valid games are the following games in this table:
//On the first line, you will receive your current balance –a floating-point number in the range[0.00…5000.00].
//Until you receive the command "Game Time", you have to keep buying games. When a game is bought,
// the user's balance decreases by the price of the game.
//Additionally, the program should obey the following conditions:
//•	If a game the user is trying to buy is not present in the table above, print "Not Found"
// and read the next line.
//•	If at any point, the user has $0 left, print "Out of money!" and end the program.
//•	Alternatively, if the user is trying to buy a game that they can't afford, print "Too Expensive"
// and read the next line.
//When you receive "Game Time", print the user's remaining money and total spent on games,
// rounded to the 2nd decimal place.

public class GamingStore03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String nameOfGame = scanner.nextLine();
        double sprendMoney = 0.0;

        while (!nameOfGame.equals("Game Time")) {
            switch (nameOfGame) {
                case "OutFall 4":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    }else {
                        System.out.println("Bought OutFall 4");
                        balance-= 39.99;
                        sprendMoney += 39.99;
                    }
                    break;
                case "CS: OG":
                    if (balance < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 15.99;
                        sprendMoney += 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance-= 19.99;
                        sprendMoney += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (balance < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance-= 59.99;
                        sprendMoney += 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (balance < 29.99) {
                        System.out.println("Too Expensive");
                    }else {
                        balance-= 29.99;
                        sprendMoney += 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance-= 39.99;
                        sprendMoney += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (balance == 0) {
                System.out.println("Out of money!");
                return;
            }

            nameOfGame = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sprendMoney, balance);
    }
}
