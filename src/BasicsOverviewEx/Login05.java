package BasicsOverviewEx;

import java.util.Scanner;
//You will be given a string representing a username. The password will be that username reversed.
// Until you receive the correct password, print on the console "Incorrect password. Try again.".
// When you receive the correct password, print "User {username} logged in." However, on the fourth try,
// if the password is still not correct, print "User {username} blocked!" and end the program.

public class Login05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int position = username.length()-1; position >= 0 ; position--) {
            password += username.charAt(position);
        }
        int incorrectPassword = 0;
        String enterPassword = scanner.nextLine();
        while (!enterPassword.equals(password)) {
            incorrectPassword ++;

            if (incorrectPassword == 4) {
                System.out.printf("User %s blocked!\n", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enterPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.\n", username);
    }
}
