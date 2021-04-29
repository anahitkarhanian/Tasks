package Day4;

import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input>=10 && input<=100){
            System.out.println("The number is in the range of [10,100]");
        } else if (input>=200 && input<=300){
            System.out.println("The number is in the range of [200,300]");
        } else if (input>=200 && input<=300){
            System.out.println("The number is in the range of [300,500]");
        } else {
            System.out.println("The number is in another range");
        }
    }
}
