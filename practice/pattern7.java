public class pattern7
{
    public static void main (String a[])
    {
        int n=5;
        for (int i=1;i<=n;i++)
        {
            for(int s=n-i;s>0;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
            
        
    
            
        
            
        
    }
}