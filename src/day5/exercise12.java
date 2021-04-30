package day5;

import java.io.IOException;
import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = scanner.nextInt();
        System.out.print("Enter secon number:");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+,-,*,/):");
        char operator = (char) System.in.read();
        switch (operator){
            case '+' : {
                double add = num1 + num2;
                System.out.println(num1 + "+" + num2 + ":" + add);
                break;
            }
            case '-' : {
                double sub = num1 - num2;
                System.out.println(num1 + "-" + num2 + ":" + sub);
                break;
            }
            case '*' : {
                double mult = num1 * num2;
                System.out.println(num1 + "*" + num2 + ":" + mult);
                break;
            }
            case '/' : {
                double div = num1 / num2;
                System.out.println(num1 + "/" + num2 + ":" + div);
                break;
            }
            default: {
                System.out.println("please enter +,-,* or /");
                break;
            }
        }


    }
}
