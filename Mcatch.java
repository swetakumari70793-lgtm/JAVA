//Multiple Catch Example
public class Mcatch
{
    public static void main(String[]args)
    {
        try
        {
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception 0ccurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutofBonudException occurs ");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("Rest Of The Code..");
    }
}