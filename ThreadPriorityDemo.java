class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("thread1 i = "+i);
        }
        {
            System.out.println("thread1 is in teminated state ");
        }
    }
}
class Thread2 extends Thread
{
   public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("thread1 j = "+j);
        }
        {
            System.out.println("thread1 is in teminated state ");
        }
    }
}
class Thread3 extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("thread1 k = "+k);
        }
        {
            System.out.println("thread1 is in teminated state ");
        }
    }
}
class ThreadPriorityDemo
{
    public static void main(String[]args)
    {
        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        Thread3 c = new Thread3();
        System.out.println("Default priority of thread1 "+a.getPriority());
        System.out.println("Default priority of thread2 "+b.getPriority());
        System.out.println("Default priority of thread3 "+c.getPriority());
        a.setPriority(Thread1.MIN_PRIORITY);
        b.setPriority(Thread1.NORM_PRIORITY);
        c.setPriority(Thread1.MAX_PRIORITY);
         System.out.println("NEW priority of thread1 "+a.getPriority());
        System.out.println("NEW priority of thread2 "+b.getPriority());
        System.out.println("NEW priority of thread3 "+c.getPriority());
        a.start();
        b.start();
        c.start();
    }
}