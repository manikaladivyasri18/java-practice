import java.util.HashSet;
import java.util.Scanner;
public class hashset1
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
        HashSet <Integer> set=new HashSet<>();
        for(int i:arr)
        {
            if(set.contains(i))
            {
                System.out.println(i);
                break;
            }
            else
            {
                set.add(i);
            }
        }
    }
}