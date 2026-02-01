import java.util.*;
class DataType
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter All Basic Data Type ");
        System.out.print("Enter a character ");
        char c = obj.next().charAt(0); 
        System.out.print("Enter Age ");
        int age = obj.nextInt();
        System.out.print("Enter a salary ");
        double salary = obj.nextDouble();
        System.out.print("Enter a bollean data type value ");
        boolean value = obj.nextBoolean();
        System.out.print("Enter a Byte data type value ");
        byte value1 = obj.nextByte();
        System.out.print("Enter a short data type value ");
        short value2 = obj.nextShort();

        obj.nextLine();
    
        System.out.print("Enter any name ");
        String name = obj.nextLine();
        System.out.print("Enter a long data type value ");
        long value3 = obj.nextLong();
        System.out.print("Enter a float data type value ");
        float value4 = obj.nextFloat();
 
        System.out.println("\n ________________________________________________________________\n\n");
        
        System.out.println("Enter character is  "+c);
        System.out.println("Enter age is  "+age);
        System.out.println("Enter salary is  "+salary);
        System.out.println("Enter boolean value is  "+value);
        System.out.println("Enter byte value is  "+value1);
        System.out.println("Enter short value is  "+value2);
        System.out.println("Enter name is  "+name);
        System.out.println("Enter long value is  "+value3);
        System.out.println("Enter float value is  "+value4);
    }
}