package Day4;

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int count = 1;
        if (num1 == num2){
            count++;
            if (num1 == num3){
                count++;
            }
        } else if (num1 == num3){
            count++;
            if (num1 == num2){
                count++;
            }
        } else {
            if (num2 == num3){
                count++;
            }
        }
        System.out.println(count);
    }
}
