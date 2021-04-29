package Day4;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 5 == 0){
            System.out.println("number is a multiple of a 5");
        } else {
            System.out.println("number is not multiple of a 5");
        }
    }
}
