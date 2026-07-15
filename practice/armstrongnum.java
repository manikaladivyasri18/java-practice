public class armstrongnum
{
    public static void main(String a[])
    {
        int n=153;
        int count=0;
        int total=0;
        int s=n;
        while(n>0)
        {
            n=n/10;
            count++;
            
        }
        n=s;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            total=total+(int)Math.pow(r,count);
            
        }
        if(s==total)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
        
}