package Day4;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a % 7 == 0 || b % 7 == 0) && (a > 0 && b > 0) && a > b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
