import java.util.Scanner;
class banker
{
    String Name;
    String accountno;
    int balance;
}
public class bankerdetails
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        banker b1=new banker();
        banker b2=new banker();
        System.out.println("banker 1");
        b1.Name=sc.nextLine();
        b1.accountno=sc.nextLine();
        b1.balance=sc.nextInt();
         sc.nextLine();
        System.out.println("banker 2");
        b2.Name=sc.nextLine();
        b2.accountno=sc.nextLine();
        b2.balance=sc.nextInt();
         sc.nextLine();
        System.out.println(b1.Name);
        System.out.println(b1.accountno);
        System.out.println(b1.balance);
        System.out.println(b2.Name);
        System.out.println(b2.accountno);
        System.out.println(b2.balance);



    }

}