import java.util.Scanner;
public class Library 
{
    String Name;
    int price;
    int day;
    double fine;
    void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the book name : ");
        Name=sc.nextLine();
        System.out.print("Enter the book price : ");
        price=sc.nextInt();
        System.out.print("Enter the number of fine day : ");
        day=sc.nextInt();
    }  
    void cal()
    {
        if(day<=7)
        {
            fine=day*25;
        }
        else if(day<=15)
        {
            fine=(7*25)+((day-7)*0.4);
        }
        else if(day<=30)
        {
            fine=day*60;
        }
        else 
        {
            fine=day*80;
        }
    } 
    void display()
    {
        System.out.println("Book name : "+Name);
        System.out.println("Book Fine paid : "+fine);
    }
    public static void main(String[] args) 
    {
        Library L = new Library();
        L.input();
        L.cal();
        L.display();
    }
}
