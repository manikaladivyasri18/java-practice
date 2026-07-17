public class sumofdigits
{
    public static void main(String a[])
    {
        int n=145;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;

        }
        System.out.println(sum);
    }
}