abstract class shape
{
    abstract void draw();
}
class circle extends shape
{
    void draw()
    {
        System.out.println("Drawing Circle..");
    }
}
class Rectange extends shape 
{
    void draw()
    {
        System.out.println("Drawing Rectangle..");
    }
}
class Appuu
{
    public static void main (String[]args)
    {
        shape circle = new circle();
        shape Rectangle = new Rectangle();
        circle.draw();
        Rectangle.draw();
    }
}