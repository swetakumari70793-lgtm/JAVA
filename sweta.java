import java.util.Scanner;
interface client
{
   void input();
   void display();
}
class sweta implements client
{
    String name;
    double salary;
    public void input()
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter name ");
        name = n.nextLine();
        System.out.print("Enter Salary ");
        salary = n.nextDouble();
    }
    public void display()
    {
        System.out.println("Nmae : "+name);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[]args)
    {
        client d = new sweta();
        d.input();
        d.display();
    }
}