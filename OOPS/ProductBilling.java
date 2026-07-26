import java.util.Scanner;
class Product
{
    String ProductName;
    int price;
    int quantity;
    Product(String PN,int p,int q)
    {
        ProductName=PN;
        price=p;
        quantity=q;
    }
    public int calculate()
    {
        return price*quantity;
    }


}
public class ProductBilling
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        Product p1=new Product(
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt()
            );
        sc.nextLine();
        Product p2=new Product(
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt()
        );
        sc.nextLine();
        Product p3=new Product (
            sc.nextLine(),
            sc.nextInt(),
            sc.nextInt()
             );
        sc.nextLine();
        System.out.println(p1.calculate());
        System.out.println(p2.calculate());
        System.out.println(p3.calculate());

    }
}
