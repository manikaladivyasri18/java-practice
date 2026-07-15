public class strongnum
{
    public static void main(String a[])
    {
        int n=121;
        int fact=1;
        int s=n;
        int total=0;
        while(n>0)
        {
            int r=n%10;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            total=total+fact;
            n=n/10;
            fact=1;
        }
        if(s==total)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong Number");
        }

    }
}