package day5;

import java.io.IOException;
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) throws IOException {
        System.out.println("What is the correct way to declare a variable to store an integer value in Java" +
                "\na. int 1x=10\nb. int x=10\nc. float x=10.0f\nd. string x=\"10\"");
        char answer = (char) System.in.read();
        switch (answer){
            case 'b': {
                System.out.println("Congratulation");
                break;
            }
            case 'c':
            case 'd':
            case 'a': {
                System.out.println("invalide choice");
                break;
            }
            default:{
                System.out.println("enter a,b,c or d");
                break;
            }
        }
    }
}
