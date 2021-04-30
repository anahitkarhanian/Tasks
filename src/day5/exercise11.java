package day5;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = num % 2;
        switch (num){
            case 0: {
                System.out.println("The number is even");
                break;
            }
            default: {
                System.out.println("The number is odd");
                break;
            }
        }
    }
}
