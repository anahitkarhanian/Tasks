package Day3;

import java.io.IOException;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char a  = (char)  System.in.read();
        char n  = (char)  System.in.read();
        int birthYear = scanner.nextInt();
        String name = String.valueOf(a);
        name = name + n + " " + birthYear;
        System.out.println(name);


    }
}
