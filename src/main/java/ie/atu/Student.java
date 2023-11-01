package ie.atu;

import java.util.Scanner;

public class Student
{
    private String name;
    private String email;
    private String course;

    public Student()
    {
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }
    public void getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        this.setName(scanner.nextLine());

        System.out.print("Enter student email: ");
        this.setEmail(scanner.nextLine());

        System.out.print("Enter chosen course: ");
        this.setCourse(scanner.nextLine());

    }
}
