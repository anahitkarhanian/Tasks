package day5;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quiz score:");
        int quiz = scanner.nextInt();
        System.out.print("Mid-term:");
        int midTerm = scanner.nextInt();
        System.out.print("Final score:");
        int finalScore = scanner.nextInt();
        double average = (quiz + midTerm + finalScore) / 3;
        switch ((int) (average + 20) / 20){
            case 5:
            case 6: {
                System.out.println("your grade is A");
                break;
            }
            case 4: {
                System.out.println("your grade is B");
                break;
            }
            case 3: {
                System.out.println("your grade is C");
                break;
            }
            case 2:
            case 1: {
                System.out.println("your grade is F");
                break;
            }
            default: {
                System.out.println("enter positive numbers");
                break;
            }
        }

    }
}
