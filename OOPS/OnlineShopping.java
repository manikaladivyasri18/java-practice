import java.util.Scanner;
class Shopping
{
    String ProductId;
    String ProductName;
    int quantity;
    int price;
    Shopping(String pi ,String pn, int q, int p)
    {
        ProductId=pi;
        ProductName=pn;
        quantity=q;
        price=p;
    }
    public int CalculateBill()
    {
        return quantity*price;

    }
    public void display()
    {
        System.out.println("Product Details");
        System.out.println("ProductID :"+ProductId);
        System.out.println("ProductName :"+ProductName);
        System.out.println("Quantity:"+quantity);
        System.out.println("Price:"+price);
        System.out.println("Total Bill:"+ CalculateBill());
    
    }
}
public class OnlineShopping
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        Shopping s1 = new Shopping(
            sc.nextLine(),
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt()
            );
        sc.nextLine();
        Shopping s2=new Shopping(
            sc.nextLine(),
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt()
            );
        sc.nextLine();
        Shopping s3=new Shopping(
            sc.nextLine(),
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt()
            );
        sc.nextLine();
        s1.display();
        s2.display();
        s3.display();
    
    
    }
}