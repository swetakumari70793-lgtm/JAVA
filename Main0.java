class Main0
{
    public static void main(String[]args)
    {
        try
        {
            int result = 10/0;
            System.out.println("Result : "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("An error occured : "+e.getMessage());
        }
        finally
        {
            System.err.println("Finally block exceuted.....");
        }
    }
}