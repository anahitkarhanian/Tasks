package Day4;

import java.util.Random;

public class exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        boolean value;
        if (num > -1000 && num < 1000 && (num % 5 == 0 || num % 3 ==0)){
            value = true;
        } else {
            value = false;
        }
        System.out.println(value + " " + num);

    }
}
