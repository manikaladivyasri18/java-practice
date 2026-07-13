public class pattern8
{
    public static void main(String a[])
    {
        int n=5;
        for(int i=1;i<=10;i++)
        {
            if(i<=n)
            {
                for(int s=n-i;s>0;s--)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<(i+1);j++)
                {
                    System.out.print("* ");
                }
                System.out.println( );
            }
            else
            {
                for(int s=(i-n);s>0;s--)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<(2*n-i);j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}