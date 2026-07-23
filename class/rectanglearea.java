import java.util.Scanner;
class rectangle
{
    int length;
    int breadth;
}
public class rectanglearea
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        rectangle r1=new rectangle();
        rectangle r2=new rectangle();
        rectangle r3=new rectangle();
        r1.length=sc.nextInt();
        r1.breadth=sc.nextInt();
        r2.length=sc.nextInt();
        r2.breadth=sc.nextInt();
        r3.length=sc.nextInt();
        r3.breadth=sc.nextInt();
        System.out.println(r1.length*r1.breadth);
        System.out.println(r2.length*r2.breadth);
        System.out.println(r3.length*r3.breadth);

    }
}