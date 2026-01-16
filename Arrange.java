/* Question 3.
Define a class Arrange described as below:
Data members/instance variables:
1. String str (a word)
2. String i
3. int p (to store the length of the word)
4. char ch;
Member Methods:
1. A parameterised constructor to initialize the data member
2. To accept the word
3. To arrange all the alphabets of word in ascending order of
their ASCII values without using the sorting technique
4. To display the arranged alphabets.
Write a main method to create an object of the class and call the
above member methods.
*/

import java.util.*;
class Arrange
{
    String str;
    String i;
    int p;
    char ch;
    Arrange(String s)
    {
        str = s;
        i = "";
        p = s.length();
        ch = 0;
    }
    void ReArrange()
    {
        for(int a = 65; a<=90; a++)
        {
            for(int b = 0; b<p; b++)
            {
                ch = str.charAt(b);
                if(a == Character.toUpperCase(ch))
                i += ch;
            }
        }
    }
    void display()
    {
        System.out.println("Alphabets in ascending order : ");
        System.out.print(i);
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = in.nextLine();

        Arrange a = new Arrange(word);
        a.ReArrange();
        a.display();   
    }
}