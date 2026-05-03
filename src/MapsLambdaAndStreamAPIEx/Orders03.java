package MapsLambdaAndStreamAPIEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsQuality = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("buy")) {
            String product = command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);

            if (productsQuality.containsKey(product)) {
                int existingQuantity = productsQuality.get(product);
                productsQuality.put(product,quantity + existingQuantity);
            } else {
                productsQuality.put(product,quantity);
            }

            productPrice.put(product, price);

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : productsQuality.entrySet()) {
            String productName = entry.getKey();
            int productQuality = entry.getValue();
            double totalPrice = productPrice.get(productName);
            System.out.printf("%s -> %.2f\n", productName, productQuality * totalPrice);
        }
    }
}
