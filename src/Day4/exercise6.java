package Day4;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        if (num == 0) {
            System.out.println("The number is 0");
        } else if (num < 0) {
            System.out.println("The number is negative");
            if (Math.abs(num) < 1) {
                System.out.println("The number is small");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("The number is large");
            }
        } else {
            System.out.println("The number is positive");
            if (num < 1) {
                System.out.println("The number is small");
            } else if (num > 1000000) {
                System.out.println("The number is large");
            }
        }
    }
}
