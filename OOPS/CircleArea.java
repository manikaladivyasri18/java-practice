import java.util.Scanner;
class circle
{
    double radius;
    double area;
    circle(double r)
    {
        radius=r;
    }
    public double area()
    {
        double pi=3.14;
        area=pi*radius*radius;
        return area;
    }
}
public class CircleArea
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        circle r1=new circle(sc.nextDouble());
        circle r2=new circle(sc.nextDouble());
        circle r3=new circle(sc.nextDouble());
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
    }
}
