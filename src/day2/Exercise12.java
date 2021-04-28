package day2;

import java.util.Random;
//Generate and print random integer number;
public class Exercise12 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
    }
}
