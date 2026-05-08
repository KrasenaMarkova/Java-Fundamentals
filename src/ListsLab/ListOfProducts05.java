package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//Read a number n and n lines of products. Print a numbered list of all the products ordered by name.

public class ListOfProducts05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countProducts = Integer.parseInt(scanner.nextLine());

        List <String> products = new ArrayList<>();
        for (int count = 1; count <= countProducts ; count++) {
            String productName = scanner.nextLine();
            products.add(productName);
        }
        Collections.sort(products);

        int currentNumber = 1;
        for (String product : products) {
            System.out.println(currentNumber + "." + product);
            currentNumber++;
        }
    }
}
