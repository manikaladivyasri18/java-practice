import java.util.Scanner;
public class leftrotate
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=t;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        

    }
}