package Day4;

import java.util.Scanner;

public class oxygen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oxygen = scanner.nextInt();
        if (oxygen == 98){
            System.out.println("The person is healthy");
        } else if (oxygen == 70) {
            System.out.println("The person is a little unhealthy");
        } else if (oxygen == 50) {
            System.out.println("The person is unhealthy");
        } else if (oxygen == 30){
            System.out.println("The person is ill");
        } else if (oxygen == 0) {
            System.out.println("The person is dead");
        } else {
            System.out.println("no other option is possible");
        }
    }
}
