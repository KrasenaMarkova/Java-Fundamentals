package MapsLambdaAndStreamAPIEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//Until you receive the "stop" command, you will be given a sequence of strings, each on a new line.
// Every odd line on the console represents a resource (e.g., Gold, Silver, Copper, etc.) and every even - quantity.
// Your task is to collect the resources and print them on a new line.
//Print the resources and their quantities in the format: "{resource} –> {quantity}".
//The quantities inputs will be in the range [1 … 2 000 000 000].

public class AMinerTask02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resource = new LinkedHashMap<>();

        while (!input.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

            if (resource.containsKey(input)) {
                int existingQuantity = resource.get(input);
                resource.put(input, existingQuantity + quantity);
            } else {
                resource.put(input, quantity);
            }

            input = scanner.nextLine();
        }
        resource.entrySet().forEach(entry -> System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue()));

    }
}
