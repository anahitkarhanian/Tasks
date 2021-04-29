package Day4;

import java.util.Random;

public class exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num  = random.nextInt();
        if (num < 0){
            num = -num;
        }
        num = num % 6 + 2;
        System.out.println(num);

    }
}
