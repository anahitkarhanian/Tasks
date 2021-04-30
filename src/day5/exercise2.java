package day5;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = "barev";
        String st2 = new String("barev");
        boolean isEqual = st1 == st2;
        boolean equal = st1.equals(st2);
        System.out.println(isEqual);
        System.out.println(equal);

    }
}

