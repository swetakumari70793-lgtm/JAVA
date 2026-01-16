import java.util.*;
class calculate
{
    int a ; int b;
    int sum; int diff;
    void inputdata()
    {
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter 1st value : ");
        a = obj.nextInt();
        System.out.print("Enter 1st value : ");
        b = obj.nextInt();
    }
    void calculate()
    {
        sum = a+b;
        diff = a-b;
    }
    void outputdata()
    {
        System.out.println(+sum);
        System.out.println(+diff);
    }
    public static void main(String[]args)
    {
        calculate A = new calculate();
        A.inputdata();
        A.calculate();
        A.outputdata();
    }
}