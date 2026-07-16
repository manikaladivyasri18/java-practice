public class spynum
{
    public static void main(String a[])
    {
        int n=123;
        int ans1=1;
        int ans2=0;
        while(n>0)
        {
            int r=n%10;
            ans1=ans1*r;
            ans2=ans2+r;
            n=n/10;
        }
        if(ans1==ans2)
        {
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }
}