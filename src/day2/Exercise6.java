package day2;

import java.util.Scanner;
//Input from console 3 arguments and then prints the sum, the difference, the average;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int sum, difference;
        double average;
        sum = input1 + input2 + input3;
        difference = input1 - input2 - input3;
        average = (input1 + input2 + input3)/3;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(average);
    }
}
