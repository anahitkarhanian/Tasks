package Day4;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 10){
            if (b != 10){
                System.out.println("Both a and b legal");
            } else {
                System.out.println("a is legal b is illegal");
            }
        } else {
            if (b != 10){
                System.out.println("a is illegal and b is legal");
            } else {
                System.out.println("a is illegal b is illegal");
            }
        }
        if (a > 0){
            if (b >0) {
                System.out.println("Both a and b legal");
            } else {
                System.out.println("a is legal b is illegal");
            }
        } else {
            if (b > 0){
                System.out.println("a is illegal and b is legal");
            } else {
                System.out.println("a is illegal b is illegal");
            }
        }
        if (a < 0){
            if (b < 0){
                System.out.println("Both a and b legal");
            } else {
                System.out.println("a is legal b is illegal");
            }
        } else {
            if (b < 0){
                System.out.println("a is illegal and b is legal");
            } else {
                System.out.println("a is illegal b is illegal");
            }
        }

    }
}
