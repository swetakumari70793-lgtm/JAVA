import java.util.*;
class Grade_Revision
{
    String name;
    int bas;
    int expn;
    double inc;
    double nbas;
    Grade_Revision()
    {
        name=" ";
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }
    void accept()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee name :");
        name = s.nextLine();
        System.out.print("Enter basic :");
        bas = s.nextInt();
        System.out.print("Enter Experience :");
        expn = s.nextInt();
    }
    void increment()
    {
        if(expn <= 3)
        {
            inc = 1000+(bas*0.1);
        }
        else if(expn <= 5)
        {
            inc = 3000+(bas*0.12);
        }
        else if(expn <= 10)
        {
            inc = 5000+(bas*0.15);
        }
        else
        {
            inc = 8000+(bas*0.2);
        }
        nbas = bas + inc;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Basic : "+bas);
        System.out.println("Experience : "+expn);
        System.out.println("Increment : "+inc);
        System.out.println("New Basic Salary : "+nbas);
    }
    public static void main(String[]args)
    {
        Grade_Revision g = new Grade_Revision();
        g.accept();
        g.increment();
        g.display();
    }
}