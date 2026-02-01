import java.util.*;
class SumMul
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any three number ");
        int N1=s.nextInt();
        int N2=s.nextInt();
        int N3=s.nextInt();
        int Sum=N1+N2+N3;
        int Mul=N1*N2*N3;
        System.out.println("Summation is "+Sum);
        System.out.println("Multiplication is "+Mul);

    }
}
