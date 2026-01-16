//Finally Using Statement Example.......
class TestFinally
{
    public static void main(String[]args)
    {
        try
        {
        // Below code do not throw any exception...
        
            int data = 25/5;
            System.out.println(data);
        }

        //catch want be executed

        catch(NullPointerException e)
        {
            System.out.println(e);
        }

        //Executed regaredes of exception occured or not...

        finally
        {
            System.out.println("Finally block is allways executed....");
        }
    } 
}