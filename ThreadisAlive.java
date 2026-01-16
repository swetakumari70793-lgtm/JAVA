class myThread extends Thread
{
    public void run()
    {
        System.out.print("R1...");
    try
    {
        Thread.sleep(500);
    }
    catch(InterruptedException e)
    {
     System.out.print(e);   
    
    }
    System.out.print("R2...");
    } 
}
class ThreadisAlive
{
    public static void main(String[]args)
    {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start();
        t2.start();
        System.out.print(t1.isAlive);
        System.out.print(t2.isAlive);
    }
}