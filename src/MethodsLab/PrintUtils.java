package MethodsLab;

public class PrintUtils {

    public static void printPrice(String product, int quality) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", quality * 1.50);
                break;
            case "water":
                System.out.printf("%.2f", quality * 1.00);
                break;
            case "coke":
                System.out.printf("%.2f", quality * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f", quality * 2.00);
                break;
        }
    }
}
