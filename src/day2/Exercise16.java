package day2;

import java.util.Scanner;
// Given an integer 3-digit number,
// determine and print the second digit. Input number from console.
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int secondDigit = (number / 10) % 10;
        System.out.println(secondDigit);

    }
}
