/*Write a program in Java to find the roots of a quadratic equation ax2+bx+c=0 with the following specifications:

Class name — Quad

Data Members — float a,b,c,d (a,b,c are the co-efficients & d is the discriminant), r1 and r2 are the roots of the equation.

Member Methods:

quad(int x,int y,int z) — to initialize a=x, b=y, c=z, d=0
void calculate() — Find d=b2-4ac
If d < 0 then print "Roots not possible" otherwise find and print:
r1 = (-b + √d) / 2a
r2 = (-b - √d) / 2a */

import java.util.*;
class Quad
{
    float a;
    float b;
    float c;
    float d;
    double r1;
    double r2;
    Quad(float x , float y , float z)
    {
        a = x;
        b = y;
        c = z;
    }
void cal()
{
    d = (b*b)-(4*a*c);
    if(d < 0)
    {
        System.out.println("Roots not possible");
    }
    else
    {
        r1 = ((-b + Math.sqrt(d))/(2*a));
        r2 = ((-b - Math.sqrt(d))/(2*a));
        System.out.println("R1 "+r1);
        System.out.println("R2 "+r2);
    }
}
public static void main(String[]args)
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a : ");
    float x = in.nextFloat();
    System.out.print("Enter b : ");
    float y = in.nextFloat();
    System.out.print("Enter c : ");
    float z = in.nextFloat();

    Quad q = new Quad(x,y,z);
    q.cal();
}
}