package day2;

import java.util.Scanner;
//Write a java program to calculate the square of a
//	-right-angled triangle
//   -square
//   -rectangle
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int triangleEdge1 = scanner.nextInt();
        int triangleEdge2 = scanner.nextInt();
        int squareTriangle = triangleEdge1 * triangleEdge2 / 2;
        System.out.println(squareTriangle);

        int squareEdge = scanner.nextInt();
        int squareSquare = squareEdge * squareEdge;
        System.out.println(squareSquare);

        int rectangleEdge1 = scanner.nextInt();
        int rectangleEdge2 = scanner.nextInt();
        int squareRectangle = rectangleEdge1 * rectangleEdge2;
        System.out.println(squareRectangle);


    }
}
