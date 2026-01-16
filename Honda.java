import java.util.Scanner;
class Honda
{
    int type;
    int cost;
    int newc;
    void gettype()
    {
        Scanner h = new Scanner(System.in);
        System.out.print("Enter type :");
        type = h.nextInt();
        System.out.print("Enter cost :");
        cost = h.nextInt();
    }
    void find()
    {
        if(type <= 2)
        {
            newc = cost+(cost*10)/100;
        }
        else
        {
            newc = cost+(cost*12)/100;
        }
    }
    void printcost()
    {
        System.out.println("Type  "+type);
        System.out.println("New Cost "+newc);
    }
    public static void main(String[]args)
    {
        Honda h = new Honda();
        h.gettype();
        h.find();
        h.printcost();
    }
}