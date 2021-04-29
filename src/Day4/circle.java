package Day4;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for perimeter\nPress 2 for area");
        int input = scanner.nextInt();
        int radius = 4;
        double pi = Math.PI;
        if (input == 1){
            double perimeter = 2 * pi * radius;
            System.out.println("perimeter = " + perimeter);
        } else if (input == 2){
            double area = pi * Math.pow(radius,2);
            System.out.println("perimeter = " + area);
        } else {
            System.out.println("Please input 1 or 2");
        }
    }
}
