package Day4;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num <= 0){
            System.out.println("The Number of ice creams is incorrect");
        } else if (num < 3 || num == 4 || num == 7){
            System.out.println("You can't buy ice cream");
        } else {
            System.out.println("You can buy ice cream");
        }

    }
}
