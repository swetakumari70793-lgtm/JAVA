import java.util.Scanner;
class Interest
{
   int P;
   double R;
   int T;
   double interest;
   double amrt;
   void input()
   {
    Scanner A=new Scanner (System.in);
    System.out.print("Store principal : ");
    P=A.nextInt();
    System.out.print("Store Rate : ");
    R=A.nextInt();
    System.out.print("Store Time : ");
    T=A.nextInt();
   }
   void cal()
   {
    if(T==1)
    {
        R = 6.5 ;
    }
    else if(T==2)
    {
        R = 7.5 ;
    }
    else if(T==3)
    {
        R = 8.5 ;
    }
    else 
    {
        R = 9.5 ;
    }
    interest=(P*R*T)/100.0;
    amrt = P+interest;
   }
   void display()
   {
    System.out.println("Principal : "+P);
    System.out.println("Rate : "+R);
    System.out.println("Time : "+T);
    System.out.println("Intrest : "+interest);
    System.out.println("Amount : "+amrt);
   }
   public static void main(String[] args) 
   {
     Interest I = new Interest();
     I.input();
     I.cal();
     I.display();  
   }
}

