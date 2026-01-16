class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
             System.out.println("Thread is i = "+i);
        }
    }
}
class ThreadSample
{
    public static void main(String[]args)
    {
        A a = new A();
        a.run();
    }
}