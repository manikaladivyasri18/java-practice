abstract class Shape
{
    double length;
    double breadth;
    Shape(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    abstract void area();

}
class Rectangle extends Shape
{
    Rectangle(double length,double breadth)
    {
        super(length,breadth);
    }
    void area()
    {
        System.out.println(length*breadth);
    }

}
class Triangle extends Shape
{
    Triangle(double length,double breadth)
    {
        super(length,breadth);
    }
    void area()
    {
        System.out.println(0.5*length*breadth);
    }

}
class Shapeabstract
{
    public static void main(String a[])
    {
        Shape s1=new Rectangle(34,54);
        Shape s2=new Triangle(40,50);
        s1.area();
        s2.area();
    }
}