import java.util.HashSet;
import java.util.Scanner;
public class Targetele
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int ans=target-arr[i];
            if(set.contains(ans))
            {
               System.out.println(ans);
               System.out.println(arr[i]);
               break;
            }
            
            set.add(arr[i]);
        }


    }
}
