import java.util.Scanner;
public class rightrotate
{
    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];


        }
        arr[0]=t;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }



    }
}