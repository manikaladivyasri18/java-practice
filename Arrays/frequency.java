import java.util.Scanner;
public class frequency
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
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==2)
            {
                count++;
             }
        }
        
        System.out.println(count);



    }
}