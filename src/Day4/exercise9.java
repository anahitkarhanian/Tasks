package Day4;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year < 0){
            System.out.println("The year is not correct");
        } else if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    System.out.println("The year is not leap");
                } else {
                System.out.println("The year is not leap");
                }
        } else {
            System.out.println("The year is not leap");
            }
    }
}
