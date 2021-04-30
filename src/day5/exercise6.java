package day5;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        int num = st == null ? -1 : (st == "" ? 0 : 1);
        System.out.println(num);
    }
}
