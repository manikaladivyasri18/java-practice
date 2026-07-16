public class perfectnum
{
    public static void main(String a[])
    {
        int n=6;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            int r=n%i;
            if(r==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect Number");
        }
    }
}