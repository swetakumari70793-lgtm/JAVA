// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class Telephone {
   int prv;
   int pre;
   int call;
   String name;
   double amrt;
   double total;

   Telephone() {
   }

   void input() {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Nmae of the customer : ");
      name = var1.nextLine();
      System.out.print("Store the previous reading : ");
      prv = var1.nextInt();
      System.out.print("Strore the present reading : ");
      pre = var1.nextInt();
   }

   void cal() {
    call = pre - prv;
    if (call <= 1000) 
        {
         amrt = 0.0;
        }
    else if (call <= 200)
        {
         amrt = (double)(call - 100) * 0.9;
        } 
    else if (this.call <= 400) 
       {
         amrt = 90.0 + (double)(call - 200) * 0.8;
        } 
    else 
       {
         amrt = 250.0 + (double)(call - 400) * 0.7;
        }
    total = amrt + 180.0;
   }

   void display() {
      System.out.println("Name\tPrevious\tPresent\tCall\tAmount\tTotal");
      System.out.println(name + "\t" + prv + "\t" + pre + "\t\t" + call + "\t" + amrt + "\t" + total);
   }

   public static void main(String[] var0) {
      Telephone var1 = new Telephone();
      var1.input();
      var1.cal();
      var1.display();
   }
}
