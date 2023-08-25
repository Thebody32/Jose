/*
Class: CSE 1321L
Section:
Term: Fall 2023
Instructor: Milo Wilson
Name: Jose Lopez
Lab#: 2
 */

import java.util.Scanner;

class Lab2A {
    public static void main(String[] args) {
        String name1; //asks for first name
        System.out.println("Enter a name:");
        Scanner gg = new Scanner(System.in);
        name1 = gg.next();

        String name2; // asks for another name
        System.out.println("Enter another name:");
        Scanner mm = new Scanner(System.in);
        name2 = mm.next();

        String verb; // asks for verb
        System.out.println("Enter a verb:");
        Scanner ss = new Scanner(System.in);
        verb = ss.next();

        String adverb; // asks for adverb
        System.out.println("Enter an adverb:");
        Scanner aa = new Scanner(System.in);
        adverb = aa.next();

        System.out.println("Once upon a time, there was a person named " + name1 + " who had a child named "
        + name2 + "." + " This child would " + verb + " " + adverb + " while singing to strangers.");


    }
}

