import java.util.Scanner;

abstract class Shape
{
    abstract void calculateArea();

    abstract void draw();
}

class Circle extends Shape
{
    int r;

    void calculateArea()
    {
        double area = 3.14 * r * r;
        System.out.println("Circle Area = " + area);
    }

    void draw()
    {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape
{
    int length, width;

    void calculateArea()
    {
        int area = length * width;
        System.out.println("Rectangle Area = " + area);
    }

    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

class area
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        System.out.println("Enter radius:");
        c.r = sc.nextInt();

        Rectangle r = new Rectangle();
        System.out.println("Enter length:");
        r.length = sc.nextInt();

        System.out.println("Enter width:");
        r.width = sc.nextInt();

        System.out.println("\nCircle Details");
        c.draw();
        c.calculateArea();

        System.out.println("\nRectangle Details");
        r.draw();
        r.calculateArea();
    }
}