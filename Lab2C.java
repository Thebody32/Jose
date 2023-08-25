/*
Class: CSE 1321L
Section:
Term: Fall 2023
Instructor: Milo Wilson
Name: Jose Lopez
Lab#: 2
 */

import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args) {
        int width; //asks for a width
        System.out.print("Enter a width: ");
        Scanner gg = new Scanner(System.in);
        width = gg.nextInt();

        int height;
        System.out.print("Enter a height: ");
        Scanner gc = new Scanner(System.in);
        height = gc.nextInt();

        int area = width * height;
        System.out.println("The area is " + area);

        int perimeter = 2 * (width + height);
        System.out.print("The perimeter is " + perimeter);

    }
}
