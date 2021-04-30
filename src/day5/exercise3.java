package day5;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String text = num > 0 ? "positive" : "negative";
        System.out.println(text);
    }
}
