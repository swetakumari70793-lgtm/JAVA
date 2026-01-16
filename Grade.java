import java.util.*;
class student
{
    private String student_Name;
    private int student_id;
    private int [] grades;
    private int numOfgrade;
    public student(String student_Name , int student_id)
    {
        this.student_Name = student_Name;
        this.student_id = student_id;
        this.grades = new int[100];
        this.numOfgrade = 0;
    }
    public String getstudentName()
    {
        return student_Name;
    }
    public void setstudentName(String student_Name)
    {
        this.student_Name=student_Name;
    }
    public int getstudentId()
    {
        return student_id;
    }
    public void setstudent(int student_id)
    {
        this.student_id= student_id;
    }
    public void addgrades(int grade)
    {
        if(grade>=0 && grade <= 100)
        {
            grades[numOfgrade] = grade;
            numOfgrade++;
            System.out.println("Grade Added Successfullly");
        }
        else
        {
            System.out.println("Invalid Grade should be between 0 and 100");
        }
    }
}
class Grade
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student name");
        String student_Name = sc.nextLine();
        System.out.print("Student ID");
        int student_id = sc.nextInt();

        student obj = new student(student_Name , student_id);
        System.out.println("Student Grade");
        int grades = sc.nextInt();
        obj.addgrades(grades);
    }
}