package Day3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = fahrenheit / 33.8;
        System.out.println(celsius);

        float celsiusFloat = (float) celsius;
        System.out.println(celsiusFloat);

        int celsiusInt = (int) celsiusFloat;
        System.out.println(celsiusInt);
    }
}
