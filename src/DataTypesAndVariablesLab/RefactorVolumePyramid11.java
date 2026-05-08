package DataTypesAndVariablesLab;

import java.util.Scanner;
//You are given a working code that finds the volume of a pyramid.
// However, you should consider that the variables exceed their optimum span and have
// improper naming. Also, search for variables that have multiple purposes.

public class RefactorVolumePyramid11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //double dul, sh, V = 0;
        //System.out.print("Length: ");
        //dul = Double.parseDouble(scanner.nextLine());
        //System.out.print("Width: ");
        //sh = Double.parseDouble(scanner.nextLine());
        //System.out.print("Height: ");
        //V = Double.parseDouble(scanner.nextLine());
        //V = (dul * sh * V) / 3;
        //System.out.printf("Pyramid Volume: %.2f", V);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double volumeOfPyramid = (length * width * height) / 3;
        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f", volumeOfPyramid);

    }
}
