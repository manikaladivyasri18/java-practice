import java.util.Scanner;
public class fibonacciseries
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a1=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            sum=sum+a1;
            int c=a1+b;
            a1=b;
            b=c;




        }
        System.out.println(sum);
    }
}