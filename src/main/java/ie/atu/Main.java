package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Sets up the scanner
        Scanner scanner = new Scanner(System.in);

        //Code for receiving Info
        System.out.println("Student No.1\n");
        Student One = new Student();

        One.getUserInput();

        System.out.println("\nStudent No.2\n");
        Student Two = new Student();

        Two.getUserInput();

        System.out.println("\nStudent No.3\n");
        Student Three = new Student();

        Three.getUserInput();

        //Code to Display Information
        System.out.println("The First student's info is:\n");
        One.displayUserInput();

        System.out.println("The Second student's info is:\n");
        Two.displayUserInput();

        System.out.println("The Third student's info is:\n");
        Three.displayUserInput();

    }
}