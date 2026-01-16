class A implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5 ; i++)
        {
            System.out.println("Thread is i = "+i);
        }
    }
}
    class ThreadDemo
    {
        public static void main(String[]args)
        {
            A a = new A();
            Thread t = new Thread(a);
            t.run();
        }
    }
