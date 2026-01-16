import java.util.*;
class Loan
{
    int time;
    double P;
    double R;
    double I;
    double amt;
    void getdata()
    {
        Scanner u = new Scanner (System.in);
        System.out.print("Enter principal : ");
        P = u.nextDouble();
        System.out.print("Enter time : ");
        time = u.nextInt();
    }
    void cal()
    {
        if(time <= 5)
        {
            R = 15.0;
        }
        else if(time <= 10)
        {
            R = 12.0;
        }
        else
        {
            R = 10.0;
        }
        I = (P*R*time)/100;
        amt = P+I;
    }
    void dis()
    {
        System.out.println("Intrest = "+I);
        System.out.println("Amount = "+amt);
    }
    public static void main(String[]args)
    {
        Loan L = new Loan();
        L.getdata();
        L.cal();
        L.dis();
    }
}