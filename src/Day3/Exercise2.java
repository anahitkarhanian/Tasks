package Day3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double var1 = scanner.nextDouble();
        float var2 = (float) var1;
        System.out.println(var1 + " " + var2);

        long var3 = (long) var2;
        System.out.println(var2 + " " + var3);

        int var4 = (int) var3;
        System.out.println(var3 + " " + var4);

        short var5 = (short) var4;
        System.out.println(var4 + " " + var5);

        byte var6 = (byte) var5;
        System.out.println(var5 + " " + var6);
    }
}
