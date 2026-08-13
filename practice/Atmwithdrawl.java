import java.util.Scanner;
class Atmwithdrawl
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        double withdraw=sc.nextDouble();
        double balance=sc.nextDouble();
        if(withdraw%100==0)
        {
            if(withdraw<=balance &&balance>=500)
            {
                double ans=balance-withdraw;
                System.out.println("Transaction is successful");
                System.out.println("Remaining balance:" + ans);

            }
        }

    }
}