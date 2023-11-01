package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Student No.1\n\n");
        Scanner scanner = new Scanner(System.in);
        Student One = new Student();

        One.getUserInput();

        System.out.println("Student No.2\n\n");
        Student Two = new Student();

        Two.getUserInput();

        System.out.println("Student No.2\n\n");
        Student Three = new Student();

        Three.getUserInput();
    }
}