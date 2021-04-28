package day2;

import java.util.Scanner;
// Write a java program
// which has input number from console, and print the remainder.(use modulo operator)
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int remainder = input1 % input2;
        System.out.println(remainder);
    }
}
