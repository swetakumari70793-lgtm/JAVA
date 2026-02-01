import java.util.*;
class student
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String name , course , city;
        double mob , fee;
        char  enrollement ;
        System.out.print("Enter Student Name ");
        name=s.nextLine();
        System.out.print("Enter Student city ");
        city=s.nextLine();
        System.out.print("Enter Student Course ");
        course=s.nextLine();
        System.out.print("Enter Student Mobile number ");
        mob=s.nextDouble();
        System.out.print("Enter Student Enrollement number ");
        enrollement=s.next().charAt(0);
        System.out.print("Enter Student Fee ");
        fee=s.nextDouble();

       System.out.println("\n_____________________________________________________\n");
    
        System.out.println("Student Name  Is "+name);
        System.out.println("Student City Is  "+city);
        System.out.println("Student Course Is "+course);
        System.out.println("Student Enrollement Number Is "+enrollement);
        System.out.println("Student Fee Is "+fee);
        System.out.println("Student City "+name);
        
    }
}