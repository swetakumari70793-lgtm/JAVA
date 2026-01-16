/* The population of a country in a particular year can be calculated by:
p*(1+r/100) at the end of year 2000, where p is the initial population and r is the
growth rate.

Write a program by using a class to find the population of the country at the end of each year from 2001 to 2007. The Class has the following specifications:

Class name — Population

Data Members — float p,r

Member Methods:

Population(int a,int b) — Constructor to initialize p and r with a and b respectively.
void print() — to calculate and print the population of each year from 2001 to 2007.*/

import java.util.*;
class Population
{
    float p;
    float r;
    Population(float a , float b)
    {
        p=a;
        r=b;
    }
    void print()
    {
        float q = p;
        for(int y=2001; y<=2025 ; y++)
        {
            q = q*(1+r/100);
            System.out.print("\nPopulation in"+y+":"+q);
        }
    }
    public static void main(String[]args)
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Population in the year 2000 :");
        float x = n.nextFloat();
        System.out.print("Enter growth rate : ");
        float y = n.nextFloat();
        
        Population p = new Population(x,y);
        p.print();
    }

}