package day5;

import java.io.IOException;

public class exercise9 {
    public static void main(String[] args) throws IOException {
        char symb = (char) System.in.read();
        switch (symb){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':{
                System.out.println(symb + " is a Vowel");
                break;
            }
            default:{
                System.out.println(symb + " is a Consonant");
                break;
            }
        }

    }
}
