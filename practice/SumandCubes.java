import java.util.Scanner;
public class SumandCubes
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=0;
        for(int i=n;i<=m;i++)
        {
            ans=ans+i*i*i;
        }
        System.out.println(ans);


    }
}