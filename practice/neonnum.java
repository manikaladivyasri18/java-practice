public class neonnum
{
    public static void main(String a[])
    {
        int n=41;
        int ans=n*n;
        int sum=0;
        while(ans>0)
        {
            int r=ans%10;
            sum=sum+r;
            ans=ans/10;
        }
        if(sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }
    }
}