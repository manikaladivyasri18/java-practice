import java.util.Scanner;
public class Tablesum
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            int b=n*i;
            sum=sum+b;

        }
        System.out.println(sum);
    }
}