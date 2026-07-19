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
            arr2[i]=arr1[i];
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr1[i]<arr1[j])
                {
                    int t=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=t;
                }

            }
        }
        boolean sorted=true;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]!=arr2[i])
            {
               sorted=false;
               break;
            }
        }
        if(sorted)
        {
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not Sorted array");
        }
            
    }
}