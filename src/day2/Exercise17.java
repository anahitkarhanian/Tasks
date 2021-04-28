package day2;

import java.util.Scanner;
//Given an integer  3-digit number,
//determine and print the first digit. Input number from console.
public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int secondDigit = number / 100;
        System.out.println(secondDigit);
    }
}
