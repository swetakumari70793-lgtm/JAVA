    interface Swimmable 
    {
        void swim();
    }
    
    interface Walkable 
    {
        void walk();
    }
    
    class Fish implements Swimmable 
    {
        public void swim() {
            System.out.println("Fish is swimming");
        }
    }
    
    class Person implements Swimmable, Walkable
     {
        public void swim() 
        {
            System.out.println("Person is swimming");
        }
        public void walk()
        {
          System.out.println("Person is walking");
        }
public static void main (String[]args)
{
  Swimmable p = new Fish();
  p.swim();
  Walkable w = new Person(); 
  w.walk();
}
}
