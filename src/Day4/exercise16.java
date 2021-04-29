package Day4;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0){
            double x1 = (-b + Math.sqrt(discriminant))/ 2 * a;
            double x2 = (-b - Math.sqrt(discriminant))/ 2 * a;
            System.out.println(x1 + " " + x2);
        } else {
            System.out.println("There is not a real decisions");
        }

    }
}
