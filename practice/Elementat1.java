import java.util.HashMap;
import java.util.Scanner;
public class Elementat1
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
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:arr)
        {
            if(map.get(i)==1)
            {
                System.out.println(i);
                break;

            }
        }

    }
   
}