package RegularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Your first task is to determine if the given sequence of characters is a valid online banking password.
//Each line must not contain anything else but a valid password. A password is valid when:
//•	It is surrounded by a "_" followed by one or more "."
//•	It is at least 6 characters long (without the surrounding "_" or ".")
//•	It starts with a capital letter
//•	It contains only letters (lower and upper case) and digits
//•	It ends with a capital letter
//Examples of valid passwords: _...ChelseA_., _..Online1BankinG_., _.Valid1PasS_., _.A123f23A_.
//Examples of invalid passwords: __InvalidPass.., _Invalid_, _.Invalid.IteM_., _.pass1InvaliD_.
//Next, you have to determine which group the password is from. The group is obtained by concatenating
// all the digits found in the password, if any. If there are no digits present in the password, the default group is "default".
//Examples:
//_...ChelseA_. -> group: default
//_..Online1BankinG_. -> group: 1
//_.A123f23A_.-> group: 12323
//Input
//On the first line, you will be given an integer n – the count of passwords that you will be receiving next.
//On the following n lines, you will receive different strings.
//Output
//For each password that you process, you need to print a message.
//If the password is invalid:
//•	"Invalid pass!"
//If the password is valid:
//•	"Group: {group}"

public class ValidatePassword06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String regex = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) {
            String password = scanner.nextLine();
            //1. проверка дали е валидна паролата

            Matcher matcher = pattern.matcher(password);
            //1. matcher = [] -> невалидна парола
            //2. matcher = ["_.A123f23A_."] -> валидна парола


            if (matcher.find()) {
                //matcher.find() -> "_.A123f23A_."
                //имаме валидна парола -> категоризирам
                String validPassword = matcher.group("passwordText");
                //2. категоризация
                StringBuilder sbDigits = new StringBuilder(); //долепям намерените цифри в паролата
                for (char symbol : validPassword.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sbDigits.append(symbol);
                    }
                }
                //sbDigits -> долепени всички цифри в паролата
                //1. нямаме цифри в паролата -> група default
                if (sbDigits.length() == 0) {
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + sbDigits);
                }
            } else {
                //matcher = [] -> невалидна парола
                System.out.println("Invalid pass!");
            }
        }
    }
}
