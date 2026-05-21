package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Your first task is to determine if the given sequence of characters is a valid barcode or not.
//Each line must not contain anything else but a valid barcode. A barcode is valid when:
//•	It is surrounded by a "@" followed by one or more "#"
//•	It is at least 6 characters long (without the surrounding "@" or "#")
//•	It starts with a capital letter
//•	It contains only letters (lower and upper case) and digits
//•	It ends with a capital letter
//Examples of valid barcodes: @###Che46sE@##, @#FreshFisH@#, @###Brea0D@###, @##Che46sE@##
//Examples of invalid barcodes: ##InvaliDiteM##, @InvalidIteM@, @#Invalid_IteM@#
//Next, you have to determine the product group of the item from the barcode. The product group is obtained by concatenating all the digits found in the barcode. If there are no digits present in the barcode, the default product group is "00".
//Examples:
//@#FreshFisH@# -> product group: 00
//@###Brea0D@### -> product group: 0
//@##Che4s6E@## -> product group: 46
//Input
//On the first line, you will be given an integer n – the count of barcodes that you will be receiving next.
//On the following n lines, you will receive different strings.
//Output
//For each barcode that you process, you need to print a message.
//If the barcode is invalid:
//•	"Invalid barcode"
//If the barcode is valid:
//•	"Product group: {product group}"

public class FancyBarcodes02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfBarcodes = Integer.parseInt(scanner.nextLine());
        //regex, който определя, кой ще ни е валидният баркод
        String regex = "@#+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        //създаваме шаблон от regex
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= countOfBarcodes ; i++) {
            //@#FreshFisH@#
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            //проверяваме дали един текст отговаря на шаблона с Matcher
            if (matcher.find()) {
                StringBuilder productGroup = new StringBuilder();
                //обхождаме всички символи в баркода
                for (char symbol : barcode.toCharArray()) {
                    //ако символа е число
                    if (Character.isDigit(symbol)) {
                        // долепяме всяко едно число в баркода
                        productGroup.append(symbol);
                    }
                }
                //проверяваме дали продуктовата линия няма числа
                //if (productGroup.isEmpty()) judge работи с по-стара версия на InteliJe
                if ((productGroup.length() == 0)) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + productGroup);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
