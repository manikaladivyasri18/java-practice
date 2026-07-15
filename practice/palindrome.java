public class palindrome
{
    public static void main()
    {
        int n=153;
        int sum=0;
        int t=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(t==sum)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}