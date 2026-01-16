class School 
{
     void schoolName() 
     {
         System.out.println("D.A.V  Public School");
     }
}
class Teacher extends School 
{
      void teach()
      {
        System.out.println("Teacher teaches science.");
      }
}
class Student extends School
{
    void Studying() 
    {
     System.out.println("Student is in 8th standard");
    }
}
class Main1 
{
    public static void main(String[] args)
    {
     Teacher teacher = new Teacher();
     teacher.schoolName();  
     teacher.teach();

     Student student = new Student();
     student.schoolName();  
     student.Studying(); 
   }
}