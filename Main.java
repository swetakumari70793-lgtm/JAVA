import java.util.*;
class Shape 
{
    protected String color;
    Shape() 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = scanner.nextLine();
    }
     void display() 
	{
        System.out.println("Color: " + color);
    }
}
class TwoDShape extends Shape 
{
    protected double area;

    public TwoDShape() 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area: ");
        area = scanner.nextDouble();
    }
    public void displayTwoDShape() 
	{
        display();
        System.out.println("Area: " + area);
    }
}
class ThreeDShape extends Shape 
{
    protected double volume;
    public ThreeDShape() 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter volume: ");
        volume = scanner.nextDouble();
    }
    public void displayThreeDShape() 
	{
        display();
        System.out.println("Volume: " + volume);
    }
}
class Rectangle extends TwoDShape 
{
    protected double length, width;

    public Rectangle() 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
    }
    public void displayRectangle() 
	{
        displayTwoDShape();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
class Cylinder extends TwoDShape 
{
    private ThreeDShape threeDShape; // Composition for ThreeDShape
    protected double radius, height;

        public Cylinder() 
		{
        threeDShape = new ThreeDShape(); // Create an instance of ThreeDShape
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
    }
    void displayCylinder() 
	{
        displayTwoDShape();
        threeDShape.displayThreeDShape();
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }
}
    class Main 
	{
    public static void main(String[] args) 
	{
        Rectangle rectangle = new Rectangle();
        System.out.println("--- Rectangle Details ---");
        rectangle.displayRectangle();
        Cylinder cylinder = new Cylinder();
        System.out.println("--- Cylinder Details ---");
        cylinder.displayCylinder();
    }
}