package Day4;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0){
           num = Math.abs(num);
        }
        num = num % 7 + 1;
        if (num == 1){
            System.out.println("Today is Monday");
        } else if (num == 2) {
            System.out.println("Today is Tuesday");
        } else if (num == 3) {
            System.out.println("Today is Wednesday");
        } else if (num == 4){
            System.out.println("Today is Thursday");
        } else if (num == 5){
            System.out.println("Today is Friday");
        } else if (num == 6){
            System.out.println("Today is Saturday");
        } else {
            System.out.println("Today is Sunday");
        }


    }
}
