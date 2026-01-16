/* Question on 2.
Define a class named FruitJuice with the following description:
Data Members Purpose
int
product_code stores the product code number
String flavour stores the flavour of the juice (e.g., orange, apple,
etc.)
String pack_type stores the type of packaging (e.g., tera-pack, PET
bottle, etc.)
int pack_size stores package size (e.g., 200 mL, 400 mL, etc.)
int
product_price stores the price of the product
Member
Methods Purpose
FruitJuice() constructor to initialize integer data members to
0 and string data members to ""
void input() to input and store the product code, flavour,
pack type, pack size and product price
void discount() to reduce the product price by 10
void display() to display the product code, flavour, pack type,
pack size and product price.*/

import java.util.Scanner;
class FruitJuice
{
    int P_C;
    String F;
    String P_T;
    int P_S;
    int P_P;
    FruitJuice()
    {
        P_C = 0;
        F =  " ";
        P_T = " ";
        P_S = 0;
        P_P = 0;
    }
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Flavour : ");
        F = s.nextLine();
        System.out.print("Enter pack type : ");
        P_T = s.nextLine();
        System.out.print("Enter product code : ");
        P_C = s.nextInt();
        System.out.print("Enter pack size : ");
        P_S = s.nextInt();
        System.out.print("Enter product price : ");
        P_P = s.nextInt();
    }
    void discount()
    {
        P_P = P_P - 10;
    }
    void display()
    {
        System.out.println("Flavour : "+F);
        System.out.println("Pack_Type : "+P_T);
        System.out.println("Product_Code : "+P_C);
        System.out.println("Pack_Size : "+P_S);
        System.out.println("Product_Price : "+P_P);
    }
    public static void main(String[]args)
    {
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}