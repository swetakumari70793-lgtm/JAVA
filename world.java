Package Animal
class A
{
    public void dis()
    {
        System.out.println("Animal in the World");
    }
}
class B extends A
{
    public void msg()
    {
       System.out.println("Animal in the World!..."); 
    }
    public void msg1()
    {
        System.out.println("Animal in the World Monkey....");
    }
}
Package world
import Animal.*;
class c
{
    public static void main (String[]args)
    {
        B b = new B();
        b.dis();
        b.msg();
        b.msg1();
    }
}
