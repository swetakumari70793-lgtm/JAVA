class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.print(e);
            }
            System.out.println("Thread value is "+i);
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("Thread value is "+j);
        }
    }
}
class Threadjoin
{
    public static void main(String[]args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        try
        {
            t1.join();
        }
        catch(InterruptedException e)
        {
            t2.start();
        }
    }
}