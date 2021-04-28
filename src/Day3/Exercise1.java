package Day3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte var1 = scanner.nextByte();
        short var2 = var1;
        System.out.println(var1 + " " + var2);

        int var3 = var2;
        System.out.println(var2 + " " + var3);

        long var4 = var3;
        System.out.println(var3 + " " + var4);

        float var5 = var4;
        System.out.println(var4 + " " + var5);

        double var6 = (double) var5;
        System.out.println(var5 + " " + var6);
    }
}
