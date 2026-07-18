import java.util.Scanner;
public class sortedarray
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr1[i]<arr1[j])
                {
                    arr2[j]=arr1[i];
                    arr2[i]=arr1[j];
                }

            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr1[]==arr2[])
            {
               System.out.println("Sorted Array");
            }
           else{
              System.out.println("Not a Sorted array");
            }
        }
            
    }
}