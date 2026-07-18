import java.util.Scanner;
public class reverse
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print( "Reverse Array is ");
            System.out.println(nums[i]);
        }
    }


    
}