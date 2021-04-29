package Day4;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 != 0 && x2 != 0 && y1 != 0 && y2 != 0) {
            if (x1 > 0 && x2 > 0) {
                if (y1 > 0 && y2 > 0) {
                    System.out.println("In the same quarter");
                } else if (y1 < 0 && y2 < 0) {
                    System.out.println("In the same quarter");
                } else {
                    System.out.println("Not in the same quarter");
                }
            } else if (x1 < 0 && x2 < 0) {
                if (y1 > 0 && y2 > 0) {
                    System.out.println("In the same quarter");
                } else if (y1 < 0 && y2 < 0) {
                    System.out.println("In the same quarter");
                } else {
                    System.out.println("Not in the same quarter");
                }
            } else {
                System.out.println("Not in the same quarter");
            }
        } else {
            System.out.println("input not zero cordinates");
        }
    }
}
